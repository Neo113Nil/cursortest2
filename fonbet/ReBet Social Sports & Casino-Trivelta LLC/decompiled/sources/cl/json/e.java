package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f27882a;

    /* renamed from: b, reason: collision with root package name */
    public String f27883b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f27884c;

    /* renamed from: d, reason: collision with root package name */
    public String f27885d;

    /* renamed from: e, reason: collision with root package name */
    public String f27886e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f27887f;

    public e(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f27885d = str2;
    }

    public final String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public final String b(Uri uri) {
        return d.d(this.f27882a, uri, this.f27887f);
    }

    public String c() {
        String str = this.f27885d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String substring = this.f27884c.toString().substring(this.f27885d.length() + 13);
            String str = this.f27886e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f27887f.booleanValue() ? this.f27882a.getCacheDir() : this.f27882a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return d.a(this.f27882a, file2);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else if (g()) {
            Uri parse = Uri.parse(this.f27883b);
            if (parse.getPath() == null) {
                return null;
            }
            return d.a(this.f27882a, new File(parse.getPath()));
        }
        return null;
    }

    public final boolean e() {
        if (this.f27884c.getScheme() == null || !this.f27884c.getScheme().equals(EventKeys.DATA)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : this.f27884c.toString().substring(5).toCharArray()) {
            if (c10 == ';') {
                break;
            }
            sb2.append(c10);
        }
        this.f27885d = sb2.toString();
        return true;
    }

    public boolean f() {
        return e() || g();
    }

    public final boolean g() {
        if (this.f27884c.getScheme() == null || !(this.f27884c.getScheme().equals("content") || this.f27884c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f27885d != null) {
            return true;
        }
        String a10 = a(this.f27884c.toString());
        this.f27885d = a10;
        if (a10 == null) {
            String b10 = b(this.f27884c);
            if (b10 == null) {
                return false;
            }
            this.f27885d = a(b10);
        }
        if (this.f27885d == null) {
            this.f27885d = "*/*";
        }
        return true;
    }

    public e(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f27883b = str;
        this.f27884c = Uri.parse(str);
        this.f27886e = str2;
        this.f27887f = bool;
        this.f27882a = reactApplicationContext;
    }
}
