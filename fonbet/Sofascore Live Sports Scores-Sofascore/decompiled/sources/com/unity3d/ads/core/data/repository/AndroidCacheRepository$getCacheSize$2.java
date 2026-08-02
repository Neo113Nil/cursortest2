package com.unity3d.ads.core.data.repository;

import defpackage.a70;
import defpackage.c28;
import defpackage.c38;
import defpackage.hoi;
import defpackage.i5h;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ot8;
import defpackage.rq3;
import defpackage.y6a;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)J"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidCacheRepository$getCacheSize$2 extends hoi implements Function2<ku3, rq3<? super Long>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends ot8 implements Function1<File, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, File.class, "isFile", "isFile()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(File file) {
            file.getClass();
            return Boolean.valueOf(file.isFile());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getCacheSize$2(AndroidCacheRepository androidCacheRepository, rq3<? super AndroidCacheRepository$getCacheSize$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidCacheRepository;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidCacheRepository$getCacheSize$2(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Long> rq3Var) {
        return ((AndroidCacheRepository$getCacheSize$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        File cacheDir;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        cacheDir = this.this$0.getCacheDir();
        c38 c38Var = new c38(i5h.g(c28.e(cacheDir, FileWalkDirection.a), AnonymousClass1.INSTANCE));
        long j = 0;
        while (c38Var.hasNext()) {
            j += ((File) c38Var.next()).length();
        }
        return new Long(j);
    }
}
