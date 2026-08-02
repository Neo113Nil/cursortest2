package defpackage;

import androidx.media3.common.b;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jgc implements nh6 {
    public final nh6 a;
    public final osj b;

    public jgc(nh6 nh6Var, osj osjVar) {
        this.a = nh6Var;
        this.b = osjVar;
    }

    @Override // defpackage.nh6
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.nh6
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.nh6
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.nh6
    public final boolean d(int i, long j) {
        return this.a.d(i, j);
    }

    @Override // defpackage.nh6
    public final void disable() {
        this.a.disable();
    }

    @Override // defpackage.nh6
    public final int e(b bVar) {
        return this.a.indexOf(this.b.a(bVar));
    }

    @Override // defpackage.nh6
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (i(obj) && (obj instanceof jgc)) {
            return this.b.equals(((jgc) obj).b);
        }
        return false;
    }

    @Override // defpackage.nh6
    public final int evaluateQueueSize(long j, List list) {
        return this.a.evaluateQueueSize(j, list);
    }

    @Override // defpackage.nh6
    public final boolean f(long j, mu2 mu2Var, List list) {
        return this.a.f(j, mu2Var, list);
    }

    @Override // defpackage.nh6
    public final boolean g(int i, long j) {
        return this.a.g(i, j);
    }

    @Override // defpackage.nh6
    public final b getFormat(int i) {
        return this.b.d[this.a.getIndexInTrackGroup(i)];
    }

    @Override // defpackage.nh6
    public final int getIndexInTrackGroup(int i) {
        return this.a.getIndexInTrackGroup(i);
    }

    @Override // defpackage.nh6
    public final b getSelectedFormat() {
        return this.b.d[this.a.getSelectedIndexInTrackGroup()];
    }

    @Override // defpackage.nh6
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // defpackage.nh6
    public final int getSelectedIndexInTrackGroup() {
        return this.a.getSelectedIndexInTrackGroup();
    }

    @Override // defpackage.nh6
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // defpackage.nh6
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // defpackage.nh6
    public final osj getTrackGroup() {
        return this.b;
    }

    @Override // defpackage.nh6
    public final void h(long j, long j2, long j3, List list, k2c[] k2cVarArr) {
        this.a.h(j, j2, j3, list, k2cVarArr);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jgc) {
            return this.a.equals(((jgc) obj).a);
        }
        return false;
    }

    @Override // defpackage.nh6
    public final int indexOf(int i) {
        return this.a.indexOf(i);
    }

    @Override // defpackage.nh6
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.nh6
    public final void onPlaybackSpeed(float f) {
        this.a.onPlaybackSpeed(f);
    }
}
