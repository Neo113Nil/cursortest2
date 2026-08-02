package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class w31 {
    public final String a;
    public final String b;
    public final String c;
    public final bx7 d;
    public final boolean e;
    public final x43 f;

    public /* synthetic */ w31(String str, String str2, String str3, bx7 bx7Var, boolean z) {
        this(str, str2, str3, bx7Var, z, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
    }

    public x43 f() {
        return this.f;
    }

    public String g() {
        return this.b;
    }

    public bx7 h() {
        return this.d;
    }

    public abstract int i();

    public String j() {
        return this.c;
    }

    public String k() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w31 l(x43 x43Var) {
        x43Var.getClass();
        if (!(this instanceof v31)) {
            return this;
        }
        x43 f = f();
        f.getClass();
        MediaReactionType mediaReactionType = x43Var.a;
        if (mediaReactionType == null) {
            mediaReactionType = f.a;
        }
        MediaReactionType mediaReactionType2 = mediaReactionType;
        int i = x43Var.b;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f.b;
        int i2 = x43Var.c;
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 == 0) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : f.c;
        int i3 = x43Var.d;
        Integer valueOf3 = i3 != 0 ? Integer.valueOf(i3) : null;
        int intValue3 = valueOf3 != null ? valueOf3.intValue() : f.d;
        Boolean bool = x43Var.e;
        if (bool == null) {
            bool = f.e;
        }
        return ((v31) this).a(new x43(mediaReactionType2, intValue, intValue2, intValue3, bool));
    }

    public w31(String str, String str2, String str3, bx7 bx7Var, boolean z, x43 x43Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bx7Var;
        this.e = z;
        this.f = x43Var;
    }
}
