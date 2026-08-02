package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f27888a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f27889b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f27890c;

    /* renamed from: d, reason: collision with root package name */
    public String f27891d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f27892e;

    public f(ReadableArray readableArray, ArrayList arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f27891d = str;
    }

    public final String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public final String b(Uri uri) {
        return d.d(this.f27888a, uri, this.f27892e);
    }

    public String c() {
        String str = this.f27891d;
        return str == null ? "*/*" : str;
    }

    public ArrayList d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f27889b.size(); i10++) {
            Uri uri = (Uri) this.f27889b.get(i10);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f27890c.size() >= i10 + 1 ? (String) this.f27890c.get(i10) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file = new File(this.f27892e.booleanValue() ? this.f27888a.getCacheDir() : this.f27888a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(d.a(this.f27888a, file2));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f27890c.size() >= i10 + 1) {
                    arrayList.add(d.a(this.f27888a, new File(uri.getPath(), (String) this.f27890c.get(i10))));
                } else {
                    arrayList.add(d.a(this.f27888a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public final boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(EventKeys.DATA)) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f27891d;
        if (str == null) {
            this.f27891d = substring;
            return true;
        }
        if (!str.equalsIgnoreCase(substring) && this.f27891d.split("/")[0].equalsIgnoreCase(substring.split("/")[0])) {
            this.f27891d = this.f27891d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f27891d.equalsIgnoreCase(substring)) {
            return true;
        }
        this.f27891d = "*/*";
        return true;
    }

    public boolean f() {
        Iterator it = this.f27889b.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            z10 = e(uri) || g(uri);
            if (!z10) {
                break;
            }
        }
        return z10;
    }

    public final boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String a10 = a(uri.toString());
        if (a10 == null) {
            a10 = a(b(uri));
        }
        if (a10 == null) {
            a10 = "*/*";
        }
        String str = this.f27891d;
        if (str == null) {
            this.f27891d = a10;
            return true;
        }
        if (!str.equalsIgnoreCase(a10) && this.f27891d.split("/")[0].equalsIgnoreCase(a10.split("/")[0])) {
            this.f27891d = this.f27891d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f27891d.equalsIgnoreCase(a10)) {
            return true;
        }
        this.f27891d = "*/*";
        return true;
    }

    public f(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f27889b = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                this.f27889b.add(Uri.parse(string));
            }
        }
        this.f27890c = arrayList;
        this.f27892e = bool;
        this.f27888a = reactApplicationContext;
    }
}
