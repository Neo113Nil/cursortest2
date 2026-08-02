package org.mp4parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mp4parser.tools.Hex;

/* loaded from: classes10.dex */
public class PropertyBoxParserImpl extends AbstractBoxParser {
    public static Properties BOX_MAP_CACHE;
    static String[] EMPTY_STRING_ARRAY = new String[0];
    public Properties mapping;
    Pattern constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
    StringBuilder buildLookupStrings = new StringBuilder();
    ThreadLocal<String> clazzName = new ThreadLocal<>();
    ThreadLocal<String[]> param = new ThreadLocal<>();

    public PropertyBoxParserImpl(String... strArr) {
        if (BOX_MAP_CACHE != null) {
            this.mapping = new Properties(BOX_MAP_CACHE);
            return;
        }
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("isoparser2-default.properties");
        try {
            Properties properties = new Properties();
            this.mapping = properties;
            try {
                properties.load(systemResourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    Throwable th = null;
                    try {
                        InputStream openStream = resources.nextElement().openStream();
                        try {
                            this.mapping.load(openStream);
                            if (openStream != null) {
                                openStream.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (openStream == null) {
                                throw th;
                            }
                            openStream.close();
                            throw th;
                        }
                    } finally {
                    }
                }
                for (String str : strArr) {
                    this.mapping.load(getClass().getResourceAsStream(str));
                }
                BOX_MAP_CACHE = this.mapping;
                if (systemResourceAsStream != null) {
                    try {
                        systemResourceAsStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Throwable th3) {
            if (systemResourceAsStream != null) {
                try {
                    systemResourceAsStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th3;
        }
    }

    public PropertyBoxParserImpl(Properties properties) {
        this.mapping = properties;
    }

    @Override // org.mp4parser.AbstractBoxParser
    public ParsableBox createBox(String str, byte[] bArr, String str2) {
        invoke(str, bArr, str2);
        String[] strArr = this.param.get();
        try {
            Class<?> cls = Class.forName(this.clazzName.get());
            if (strArr.length > 0) {
                Class<?>[] clsArr = new Class[strArr.length];
                Object[] objArr = new Object[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    if ("userType".equals(strArr[i])) {
                        objArr[i] = bArr;
                        clsArr[i] = byte[].class;
                    } else if ("type".equals(strArr[i])) {
                        objArr[i] = str;
                        clsArr[i] = String.class;
                    } else if ("parent".equals(strArr[i])) {
                        objArr[i] = str2;
                        clsArr[i] = String.class;
                    } else {
                        throw new InternalError("No such param: " + strArr[i]);
                    }
                }
                return (ParsableBox) cls.getConstructor(clsArr).newInstance(objArr);
            }
            return (ParsableBox) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void invoke(String str, byte[] bArr, String str2) {
        String property;
        if (bArr != null) {
            if (!"uuid".equals(str)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            property = this.mapping.getProperty("uuid[" + Hex.encodeHex(bArr).toUpperCase() + "]");
            if (property == null) {
                property = this.mapping.getProperty(String.valueOf(str2) + "-uuid[" + Hex.encodeHex(bArr).toUpperCase() + "]");
            }
            if (property == null) {
                property = this.mapping.getProperty("uuid");
            }
        } else {
            property = this.mapping.getProperty(str);
            if (property == null) {
                StringBuilder sb = this.buildLookupStrings;
                sb.append(str2);
                sb.append('-');
                sb.append(str);
                String sb2 = sb.toString();
                this.buildLookupStrings.setLength(0);
                property = this.mapping.getProperty(sb2);
            }
        }
        if (property == null) {
            property = this.mapping.getProperty("default");
        }
        if (property == null) {
            throw new RuntimeException("No box object found for " + str);
        }
        if (!property.endsWith(")")) {
            this.param.set(EMPTY_STRING_ARRAY);
            this.clazzName.set(property);
            return;
        }
        Matcher matcher = this.constuctorPattern.matcher(property);
        if (!matcher.matches()) {
            throw new RuntimeException("Cannot work with that constructor: " + property);
        }
        this.clazzName.set(matcher.group(1));
        if (matcher.group(2).length() == 0) {
            this.param.set(EMPTY_STRING_ARRAY);
        } else {
            this.param.set(matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0]);
        }
    }
}
