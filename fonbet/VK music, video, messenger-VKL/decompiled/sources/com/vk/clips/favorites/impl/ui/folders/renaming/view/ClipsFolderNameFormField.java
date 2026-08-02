package com.vk.clips.favorites.impl.ui.folders.renaming.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.bap;
import xsna.d370;
import xsna.fj1;
import xsna.g8s;
import xsna.h8s;
import xsna.hly;
import xsna.i8s;
import xsna.izs;
import xsna.jvi;
import xsna.nvu0;
import xsna.q630;
import xsna.qsl;
import xsna.rpo0;
import xsna.rwr;
import xsna.s2x;
import xsna.s3q0;
import xsna.s9;
import xsna.spj;
import xsna.tho0;
import xsna.txj0;
import xsna.ve0;
import xsna.wh50;
import xsna.wzs;
import xsna.x76;
import xsna.yvj;
import xsna.zak0;

/* compiled from: ClipsFolderNameFormField.kt */
/* loaded from: classes16.dex */
public final class ClipsFolderNameFormField extends rpo0 {
    public static final /* synthetic */ int p = 0;
    public final wh50 m;
    public final wh50 n;
    public final int o;

    /* compiled from: ClipsFolderNameFormField.kt */
    @b6l(c = "com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField$ThemedContent$3$1", f = "ClipsFolderNameFormField.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rwr $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rwr rwrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$focusRequester = rwrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$focusRequester, spjVar);
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
                this.label = 1;
                if (qsl.b(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            rwr.b(this.$focusRequester);
            return s3q0.a;
        }
    }

    public ClipsFolderNameFormField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(new tho0("", 0L, 6));
        this.n = k.b(new fj1(7));
        this.o = context.getResources().getInteger(R.integer.clips_favorites_folder_renaming_max_title_length);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-621983905);
        int i2 = i | (M.y(this) ? 4 : 2);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-621983905, i2, -1, "com.vk.clips.favorites.impl.ui.folders.renaming.view.ClipsFolderNameFormField.ThemedContent (ClipsFolderNameFormField.kt:38)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rwr();
                M.R(x);
            }
            rwr rwrVar = (rwr) x;
            hly a2 = h8s.a.a(d370.N(R.string.clips_favorites_folder_renaming_subtitle, 0, M), false, null, i8s.a.AbstractC3037a.C3038a.a(getFolderName().a.c.length(), this.o, null, M, 3072, 4), null, M, 196608, 22);
            tho0 folderName = getFolderName();
            if ((i2 & 14) != 4 && !M.y(this)) {
                z = false;
            }
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new s9(this, 23);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            String N = d370.N(R.string.clips_favorites_folder_renaming_hint, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ve0(14);
                M.R(x3);
            }
            M = M;
            nvu0.a(g8s.b.a.a(s2x.a.C3649a.b(folderName, izsVar, N, 0L, 0L, null, null, null, null, null, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2), M, 0, 196608, 16376), InputSelect$State.Default, false, null, M, 24624, 12), txj0.f(jvi.d(q630.a.a, rwrVar), 1.0f), a2, null, null, M, 0, 24);
            s3q0 s3q0Var = s3q0.a;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new a(rwrVar, null);
                M.R(x4);
            }
            bap.g(s3q0Var, (wzs) x4, M, 6);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new x76(this, i, 3);
        }
    }

    public final tho0 getFolderName() {
        return (tho0) ((zak0) this.m).getValue();
    }

    public final int getMaxCounter() {
        return this.o;
    }

    public final izs<tho0, s3q0> getOnUpdateAction() {
        return (izs) ((zak0) this.n).getValue();
    }

    public final void setFolderName(tho0 tho0Var) {
        ((zak0) this.m).setValue(tho0Var);
    }

    public final void setOnUpdateAction(izs<? super tho0, s3q0> izsVar) {
        ((zak0) this.n).setValue(izsVar);
    }
}
