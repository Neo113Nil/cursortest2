package com.inmobi.media;

import android.widget.ProgressBar;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3946zn extends hoi implements Function2 {
    public int a;
    public int b;
    public int c;
    public long d;
    public float e;
    public ProgressBar f;
    public int g;
    public final /* synthetic */ ProgressBar h;
    public final /* synthetic */ An i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946zn(ProgressBar progressBar, An an, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.h = progressBar;
        this.i = an;
        this.j = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3946zn(this.h, this.i, this.j, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3946zn) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0064 -> B:5:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProgressBar progressBar;
        int i;
        float f;
        int i2;
        int i3;
        long j;
        lu3 lu3Var = lu3.a;
        int i4 = this.g;
        if (i4 == 0) {
            y6a.M(obj);
            int progress = this.h.getProgress();
            long j2 = this.i.c.f / 10;
            progressBar = this.h;
            i = progress;
            f = (this.j - progress) / 10.0f;
            i2 = 10;
            i3 = 0;
            j = j2;
            if (i3 < i2) {
            }
        } else {
            if (i4 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.c;
            i2 = this.b;
            f = this.e;
            j = this.d;
            i = this.a;
            progressBar = this.f;
            y6a.M(obj);
            i3++;
            if (i3 < i2) {
                Un.a(progressBar, (int) (((i3 + 1) * f) + i));
                this.f = progressBar;
                this.a = i;
                this.d = j;
                this.e = f;
                this.b = i2;
                this.c = i3;
                this.g = 1;
                if (n4o.y(j, this) == lu3Var) {
                    return lu3Var;
                }
                i3++;
                if (i3 < i2) {
                    return Unit.a;
                }
            }
        }
    }
}
