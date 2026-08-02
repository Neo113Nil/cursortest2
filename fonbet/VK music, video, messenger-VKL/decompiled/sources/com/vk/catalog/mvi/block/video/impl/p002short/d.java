package com.vk.catalog.mvi.block.video.impl.p002short;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog.mvi.block.video.impl.p002short.c;
import com.vk.dto.common.VideoFile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.c1q;
import xsna.fxc0;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.ydt0;

/* compiled from: ClipListViewEvent.kt */
/* loaded from: classes16.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ClipListViewEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.short.ClipListViewEventKt$ClipsHandleEvents$1$1", f = "ClipListViewEvent.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((c) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ydt0 Y = fxc0.B().Y();
            Context context = this.$context;
            c.a aVar = (c.a) cVar;
            VideoFile videoFile = aVar.b;
            Y.k(context, videoFile, (r43 & 4) != 0 ? null : videoFile.x8(), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : aVar.b.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : true, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
            return s3q0.a;
        }
    }

    public static final <T extends c> void a(final ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-61056441);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-61056441, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.ClipsHandleEvents (ClipListViewEvent.kt:21)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean y = M.y(context);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.k7d
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    com.vk.catalog.mvi.block.video.impl.p002short.d.a(ksr.this, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
