package net.time4j.tz.spi;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.PlainDate;
import net.time4j.base.GregorianDate;
import net.time4j.base.ResourceLoader;
import net.time4j.scale.LeapSecondProvider;
import net.time4j.tz.TransitionHistory;
import net.time4j.tz.ZoneModelProvider;
import net.time4j.tz.ZoneNameProvider;

/* loaded from: classes10.dex */
public class TimezoneRepositoryProviderSPI implements ZoneModelProvider, LeapSecondProvider {
    private final Map<String, String> aliases;
    private final Map<String, byte[]> data;
    private final PlainDate expires;
    private final Map<GregorianDate, Integer> leapsecs;
    private final String location;
    private final String version;

    @Override // net.time4j.tz.ZoneModelProvider
    public ZoneNameProvider getSpecificZoneNameRepository() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimezoneRepositoryProviderSPI() {
        InputStream inputStream;
        String str;
        IllegalStateException illegalStateException;
        URI locate;
        InputStream inputStream2;
        String str2 = "";
        PlainDate minimum = PlainDate.axis().getMinimum();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        boolean z = System.getProperty("net.time4j.scale.leapseconds.path") != null;
        if (z) {
            this.leapsecs = Collections.EMPTY_MAP;
        } else {
            this.leapsecs = new LinkedHashMap(50);
        }
        String property = System.getProperty("net.time4j.tz.repository.path");
        String property2 = System.getProperty("net.time4j.tz.repository.version");
        String str3 = property2 == null ? "tzdata.repository" : "tzdata" + property2 + ".repository";
        try {
            String str4 = "tzrepo/" + str3;
            if (property == null) {
                locate = ResourceLoader.getInstance().locate("tzdata", getReference(), str4);
            } else {
                File file = new File(property, str3);
                if (!file.isAbsolute()) {
                    locate = ResourceLoader.getInstance().locate("tzdata", getReference(), file.toString());
                } else if (file.exists()) {
                    locate = file.toURI();
                } else {
                    throw new FileNotFoundException("Path to tz-repository not found: " + file);
                }
            }
            if (locate == null) {
                str = "";
                inputStream2 = null;
            } else {
                inputStream2 = ResourceLoader.getInstance().load(locate, true);
                try {
                    try {
                        str = locate.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    str = "";
                    inputStream = inputStream2;
                    try {
                        IllegalStateException illegalStateException2 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                        }
                        illegalStateException = illegalStateException2;
                        if (illegalStateException != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                }
            }
            if (inputStream2 == null) {
                try {
                    URL resource = getReference().getClassLoader().getResource(str4);
                    if (resource == null) {
                        throw new FileNotFoundException("Classloader cannot access tz-repository: " + str4);
                    }
                    URLConnection openConnection = resource.openConnection();
                    openConnection.setUseCaches(false);
                    openConnection.connect();
                    inputStream2 = openConnection.getInputStream();
                    str = resource.toString();
                } catch (IOException e2) {
                    e = e2;
                    inputStream = inputStream2;
                    IllegalStateException illegalStateException22 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                    if (inputStream != null) {
                    }
                    illegalStateException = illegalStateException22;
                    if (illegalStateException != null) {
                    }
                }
            }
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream2);
                checkMagicLabel(dataInputStream, str);
                String readUTF = dataInputStream.readUTF();
                int readInt = dataInputStream.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i < readInt) {
                    String readUTF2 = dataInputStream.readUTF();
                    int readInt2 = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt2];
                    String str5 = str;
                    String str6 = readUTF;
                    int i2 = 0;
                    do {
                        try {
                            i2 += dataInputStream.read(bArr, i2, readInt2 - i2);
                            if (i2 == -1) {
                                throw new EOFException("Incomplete data: " + readUTF2);
                            }
                        } catch (IOException e3) {
                            e = e3;
                            inputStream = inputStream2;
                            str = str5;
                            IllegalStateException illegalStateException222 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                            }
                            illegalStateException = illegalStateException222;
                            if (illegalStateException != null) {
                            }
                        }
                    } while (readInt2 > i2);
                    arrayList.add(readUTF2);
                    hashMap.put(readUTF2, bArr);
                    i++;
                    str = str5;
                    readUTF = str6;
                }
                String str7 = str;
                String str8 = readUTF;
                short readShort = dataInputStream.readShort();
                for (int i3 = 0; i3 < readShort; i3++) {
                    hashMap2.put(dataInputStream.readUTF(), (String) arrayList.get(dataInputStream.readShort()));
                }
                if (!z) {
                    short readShort2 = dataInputStream.readShort();
                    for (int i4 = 0; i4 < readShort2; i4++) {
                        this.leapsecs.put(PlainDate.of(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte()), Integer.valueOf(dataInputStream.readByte()));
                    }
                    minimum = PlainDate.of(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte());
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                str = str7;
                str2 = str8;
                illegalStateException = null;
            } catch (IOException e4) {
                e = e4;
                inputStream = inputStream2;
                IllegalStateException illegalStateException2222 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                illegalStateException = illegalStateException2222;
                if (illegalStateException != null) {
                }
            }
        } catch (IOException e5) {
            e = e5;
            str = "";
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        if (illegalStateException != null) {
            throw illegalStateException;
        }
        this.version = str2;
        this.location = str;
        this.data = Collections.unmodifiableMap(hashMap);
        this.aliases = Collections.unmodifiableMap(hashMap2);
        this.expires = minimum;
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public Set<String> getAvailableIDs() {
        return this.data.keySet();
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public Map<String, String> getAliases() {
        return this.aliases;
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public TransitionHistory load(String str) {
        try {
            byte[] bArr = this.data.get(str);
            if (bArr != null) {
                return (TransitionHistory) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public String getFallback() {
        return "";
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public String getLocation() {
        return this.location;
    }

    @Override // net.time4j.tz.ZoneModelProvider
    public String getVersion() {
        return this.version;
    }

    @Override // net.time4j.scale.LeapSecondProvider
    public Map<GregorianDate, Integer> getLeapSecondTable() {
        return Collections.unmodifiableMap(this.leapsecs);
    }

    @Override // net.time4j.scale.LeapSecondProvider
    public boolean supportsNegativeLS() {
        return !this.leapsecs.isEmpty();
    }

    @Override // net.time4j.scale.LeapSecondProvider
    public PlainDate getDateOfEvent(int i, int i2, int i3) {
        return PlainDate.of(i, i2, i3);
    }

    @Override // net.time4j.scale.LeapSecondProvider
    public PlainDate getDateOfExpiration() {
        return this.expires;
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.version + ")";
    }

    private static void checkMagicLabel(DataInputStream dataInputStream, String str) throws IOException {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte readByte3 = dataInputStream.readByte();
        byte readByte4 = dataInputStream.readByte();
        byte readByte5 = dataInputStream.readByte();
        byte readByte6 = dataInputStream.readByte();
        if (readByte == 116 && readByte2 == 122 && readByte3 == 114 && readByte4 == 101 && readByte5 == 112 && readByte6 == 111) {
            return;
        }
        throw new IOException("Invalid tz-repository: " + str);
    }

    private static Class<?> getReference() {
        if (Boolean.getBoolean("test.environment")) {
            try {
                return Class.forName("net.time4j.tz.spi.RepositoryTest");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
        return TimezoneRepositoryProviderSPI.class;
    }
}
