package com.vk.clips.upload.vk.api.di;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.vk.api.navigation.preview.ClipPreviewInputParams;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.movika.sdk.base.ui.i;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import xsna.a3f;
import xsna.bze;
import xsna.eed;
import xsna.ilf;
import xsna.izs;
import xsna.o15;
import xsna.px0;
import xsna.r4;
import xsna.w9c0;
import xsna.wye;
import xsna.xdd;
import xsna.xgf;
import xsna.ylf;

/* compiled from: ClipsUploadVkComponent.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadVkComponentKt {
    public static final ClipsUploadVkComponentKt$COMPONENT_STUB$1 a = new ClipsUploadVkComponent() { // from class: com.vk.clips.upload.vk.api.di.ClipsUploadVkComponentKt$COMPONENT_STUB$1
        public final b a = new b();
        public final e b = new e();
        public final c c = new c();
        public final d d = new d();

        /* compiled from: ClipsUploadVkComponent.kt */
        public static final class c implements w9c0 {
            @Override // xsna.w9c0
            public final boolean a(Uri uri) {
                return false;
            }
        }

        /* compiled from: ClipsUploadVkComponent.kt */
        public static final class d implements a3f {
            @Override // xsna.a3f
            public final ClipUploaderData a(ClipUploadData clipUploadData) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final w9c0 K6() {
            return this.c;
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final wye U5() {
            return new a();
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final ylf Uc() {
            return this.b;
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final xgf f() {
            return this.a;
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final Set<File> s0() {
            return EmptySet.b;
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final a3f v9() {
            return this.d;
        }

        /* compiled from: ClipsUploadVkComponent.kt */
        public static final class a implements wye {
            @Override // xsna.wye
            public final CharSequence b() {
                return null;
            }

            @Override // xsna.wye
            public final CharSequence c() {
                return null;
            }

            @Override // xsna.wye
            public final View d(Context context, r4 r4Var) {
                return new View(context);
            }

            @Override // xsna.wye
            public final void dispose() {
            }

            @Override // xsna.wye
            public final void a(Context context) {
            }

            @Override // xsna.wye
            public final void e(o15 o15Var) {
            }

            @Override // xsna.wye
            public final void f(izs izsVar, bze bzeVar) {
            }
        }

        /* compiled from: ClipsUploadVkComponent.kt */
        public static final class e implements ylf {
            @Override // xsna.ylf
            public final q<List<Pair<ClipVideoFile, eed>>> b() {
                return g0.b;
            }

            @Override // xsna.ylf
            public final v g() {
                return new v(new ilf());
            }

            @Override // xsna.ylf
            public final void a(ClipUploadData clipUploadData) {
            }

            @Override // xsna.ylf
            public final void c(ClipUploadData clipUploadData) {
            }

            @Override // xsna.ylf
            public final void e(xdd xddVar) {
            }

            @Override // xsna.ylf
            public final void d(int i, String str) {
            }

            @Override // xsna.ylf
            public final void f(xdd xddVar, String str) {
            }
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final void D4(Context context) {
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final void kb(FragmentActivity fragmentActivity, px0 px0Var) {
        }

        /* compiled from: ClipsUploadVkComponent.kt */
        public static final class b implements xgf {
            @Override // xsna.xgf
            public final void a(Context context, ClipPreviewInputParams clipPreviewInputParams, int i) {
            }
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final void T3(FragmentActivity fragmentActivity, String str, String str2) {
        }

        @Override // com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent
        public final void s5(FragmentActivity fragmentActivity, String str, String str2, i iVar) {
        }
    };
}
