package com.vk.clips.sdk.drafts.impl;

import android.content.Context;
import com.vk.clips.sdk.drafts.api.ClearDraftMode;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.clips.sdk.drafts.api.ClipsDraftDirType;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import xsna.asd;
import xsna.b6l;
import xsna.bay;
import xsna.bpn0;
import xsna.bsd;
import xsna.cbr;
import xsna.csd;
import xsna.e43;
import xsna.epx;
import xsna.jd;
import xsna.kd;
import xsna.lud;
import xsna.m1;
import xsna.myc0;
import xsna.osd;
import xsna.otd;
import xsna.qsd;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.vhk0;
import xsna.vtd;
import xsna.wi50;
import xsna.wrd;
import xsna.wtd;
import xsna.wzs;
import xsna.xrd;
import xsna.yrd;
import xsna.yvj;
import xsna.zrd;

/* compiled from: ClipsDraftComponentBase.kt */
/* loaded from: classes17.dex */
public abstract class ClipsDraftComponentBase implements ClipsDraftComponent {
    public final bpn0 a = new bpn0(new m1(this, 22));
    public final wi50 b = bay.a();
    public final bpn0 c = new bpn0(new jd(this, 25));
    public final bpn0 d = new bpn0(new kd(this, 19));

    /* compiled from: ClipsDraftComponentBase.kt */
    @b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$softDelete$1", f = "ClipsDraftComponentBase.kt", l = {125}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $draftId;
        final /* synthetic */ ClearDraftMode $mode;
        int label;

        /* compiled from: ClipsDraftComponentBase.kt */
        @b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$softDelete$1$1", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$a$a, reason: collision with other inner class name */
        public static final class C0636a extends SuspendLambda implements wzs<lud, spj<? super s3q0>, Object> {
            final /* synthetic */ String $draftId;
            final /* synthetic */ ClearDraftMode $mode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0636a(String str, ClearDraftMode clearDraftMode, spj<? super C0636a> spjVar) {
                super(2, spjVar);
                this.$draftId = str;
                this.$mode = clearDraftMode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C0636a c0636a = new C0636a(this.$draftId, this.$mode, spjVar);
                c0636a.L$0 = obj;
                return c0636a;
            }

            @Override // xsna.wzs
            public final Object invoke(lud ludVar, spj<? super s3q0> spjVar) {
                return ((C0636a) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                lud ludVar = (lud) this.L$0;
                String str = this.$draftId;
                ClearDraftMode clearDraftMode = this.$mode;
                String n = ludVar.a.n(str);
                if (n == null) {
                    ludVar.c.f("soft-deleting non-existent or already deleted draft with id = ".concat(str));
                } else {
                    ClipsDraft a = ludVar.a(n);
                    if (a != null) {
                        if (clearDraftMode != ClearDraftMode.NONE) {
                            try {
                                ludVar.b.a(a, clearDraftMode);
                            } catch (Throwable th) {
                                ludVar.c.g(th, new Object[0]);
                            }
                        }
                        JSONObject jSONObject = new JSONObject(a.c.toString());
                        jSONObject.put("is_deleted", true);
                        jSONObject.put("deleted_at", System.currentTimeMillis());
                        ludVar.a.q(new ClipsDraft(ClipsDraftCommonData.a(a.b, new ArrayList(), 0, EmptyList.b, 15099), jSONObject).e5().toString(), str, true);
                        otd otdVar = ludVar.d;
                        if (epx.f(otdVar != null ? otdVar.a.a : null, str)) {
                            ludVar.d = null;
                        }
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ClearDraftMode clearDraftMode, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$draftId = str;
            this.$mode = clearDraftMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return ClipsDraftComponentBase.this.new a(this.$draftId, this.$mode, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ClipsDraftComponentBase clipsDraftComponentBase = ClipsDraftComponentBase.this;
                C0636a c0636a = new C0636a(this.$draftId, this.$mode, null);
                this.label = 1;
                if (clipsDraftComponentBase.Df(c0636a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipsDraftComponentBase.kt */
    @b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase", f = "ClipsDraftComponentBase.kt", l = {171, 161}, m = "syncAndApply")
    public static final class b<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClipsDraftComponentBase.this.Df(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r9.b(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v9, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object Df(wzs<? super lud, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super T> spjVar) {
        b bVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        wi50 wi50Var;
        Throwable th;
        ui50 ui50Var;
        Object invoke;
        try {
            if (spjVar instanceof b) {
                bVar = (b) spjVar;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        bVar.L$0 = wzsVar;
                        wi50Var = this.b;
                        bVar.L$1 = wi50Var;
                        bVar.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var = (ui50) bVar.L$0;
                            try {
                                kotlin.a.a(obj);
                                ui50Var.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var.c(null);
                                throw th;
                            }
                        }
                        ?? r8 = (ui50) bVar.L$1;
                        wzs<? super lud, ? super spj<? super T>, ? extends Object> wzsVar2 = (wzs) bVar.L$0;
                        kotlin.a.a(obj);
                        wi50Var = r8;
                        wzsVar = wzsVar2;
                    }
                    lud ludVar = (lud) this.d.getValue();
                    bVar.L$0 = wi50Var;
                    bVar.L$1 = null;
                    bVar.label = 2;
                    invoke = wzsVar.invoke(ludVar, bVar);
                    if (invoke != coroutineSingletons) {
                        wi50 wi50Var2 = wi50Var;
                        obj = invoke;
                        ui50Var = wi50Var2;
                        ui50Var.c(null);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            lud ludVar2 = (lud) this.d.getValue();
            bVar.L$0 = wi50Var;
            bVar.L$1 = null;
            bVar.label = 2;
            invoke = wzsVar.invoke(ludVar2, bVar);
            if (invoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            wi50 wi50Var3 = wi50Var;
            th = th3;
            ui50Var = wi50Var3;
            ui50Var.c(null);
            throw th;
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object Q7(String str, vtd vtdVar) {
        return Df(new bsd(new yrd(str, null), null), vtdVar);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object Xa(String str, ContinuationImpl continuationImpl) {
        return Df(new bsd(new csd(str, false, null), null), continuationImpl);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final File hb(File file, ClipsDraftDirType clipsDraftDirType, boolean z) {
        File b2;
        osd a2 = ((lud) this.d.getValue()).b.a.a();
        int i = qsd.a.$EnumSwitchMapping$0[clipsDraftDirType.ordinal()];
        if (i == 1) {
            b2 = a2.b();
        } else if (i == 2) {
            b2 = a2.a();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = a2.c();
        }
        File parentFile = file.getParentFile();
        if (!epx.f(parentFile != null ? parentFile.getAbsolutePath() : null, b2.getAbsolutePath())) {
            File c = qsd.c(file, b2);
            if (c != null) {
                if (z) {
                    vhk0.b(file);
                }
                return c;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID());
            sb.append('_');
            sb.append(System.currentTimeMillis());
            File file2 = new File(b2, sb.toString());
            cbr cbrVar = cbr.a;
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            cbrVar.getClass();
            if (cbr.d(context2, file, file2)) {
                if (z) {
                    vhk0.b(file);
                }
                return file2;
            }
        }
        return file;
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object k8(otd otdVar, ContinuationImpl continuationImpl) {
        Object Df = Df(new asd(otdVar, null), continuationImpl);
        return Df == CoroutineSingletons.COROUTINE_SUSPENDED ? Df : s3q0.a;
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object qe(wtd wtdVar) {
        return Df(new zrd(0, Integer.MAX_VALUE, null), wtdVar);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object rd(ContinuationImpl continuationImpl) {
        return Df(new bsd(new xrd(2, null), null), continuationImpl);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final void s1(String str, ClearDraftMode clearDraftMode) {
        myc0.h((yvj) this.a.getValue(), null, null, new a(str, clearDraftMode, null), 3);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final Object y9(otd otdVar, boolean z, ContinuationImpl continuationImpl) {
        Object Df = Df(new wrd(otdVar, z, null), continuationImpl);
        return Df == CoroutineSingletons.COROUTINE_SUSPENDED ? Df : s3q0.a;
    }
}
