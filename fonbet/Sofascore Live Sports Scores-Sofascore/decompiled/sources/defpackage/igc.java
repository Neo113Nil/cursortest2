package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class igc implements mh6 {
    public final mh6 a;
    public final nsj b;

    public igc(mh6 mh6Var, nsj nsjVar) {
        this.a = mh6Var;
        this.b = nsjVar;
    }

    @Override // defpackage.mh6
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.mh6
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.mh6
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.mh6
    public final void disable() {
        this.a.disable();
    }

    @Override // defpackage.mh6
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igc)) {
            return false;
        }
        igc igcVar = (igc) obj;
        return this.a.equals(igcVar.a) && this.b.equals(igcVar.b);
    }

    @Override // defpackage.mh6
    public final sm8 getFormat(int i) {
        return this.a.getFormat(i);
    }

    @Override // defpackage.mh6
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // defpackage.mh6
    public final sm8 getSelectedFormat() {
        return this.a.getSelectedFormat();
    }

    @Override // defpackage.mh6
    public final nsj getTrackGroup() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // defpackage.mh6
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }

    @Override // defpackage.mh6
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.mh6
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }
}
