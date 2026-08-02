package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zo3 implements yo3, ap3 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public zo3(zo3 zo3Var) {
        ClipData clipData = zo3Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = zo3Var.c;
        if (i < 0) {
            Locale locale = Locale.US;
            a70.p("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            a70.p("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = zo3Var.d;
        if ((i2 & 1) != i2) {
            vp2.d("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i2;
        this.e = zo3Var.e;
        this.f = zo3Var.f;
    }

    @Override // defpackage.yo3
    public void a(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.ap3
    public ContentInfo b() {
        return null;
    }

    @Override // defpackage.yo3
    public bp3 build() {
        return new bp3(new zo3(this));
    }

    @Override // defpackage.ap3
    public ClipData c() {
        return this.b;
    }

    @Override // defpackage.yo3
    public void d(int i) {
        this.d = i;
    }

    @Override // defpackage.ap3
    public int e() {
        return this.d;
    }

    @Override // defpackage.ap3
    public int getSource() {
        return this.c;
    }

    @Override // defpackage.yo3
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return mz1.o(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zo3() {
    }
}
