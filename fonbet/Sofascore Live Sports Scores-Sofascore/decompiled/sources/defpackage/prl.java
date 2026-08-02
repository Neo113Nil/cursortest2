package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import defpackage.lrl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class prl extends ltk {
    public final fdi b;
    public final jof c;
    public qvl d;
    public qvl e;
    public qvl f;
    public final rzl g;
    public BlazeDataSourceType h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public prl() {
        fdi a2 = gdi.a(nvl.a);
        this.b = a2;
        this.c = un0.u(a2);
        this.d = new qvl();
        this.e = new qvl();
        this.f = new qvl();
        this.g = new rzl(this);
    }

    public final void f() {
        BlazeDataSourceType blazeDataSourceType = this.h;
        this.b.l(blazeDataSourceType != null ? new lrl.d(blazeDataSourceType) : nvl.a);
    }

    public final void g() {
        this.d = new qvl();
        this.e = new qvl();
        this.f = new qvl();
    }
}
