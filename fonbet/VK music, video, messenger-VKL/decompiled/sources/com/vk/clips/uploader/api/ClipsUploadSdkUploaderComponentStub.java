package com.vk.clips.uploader.api;

import com.vk.api.generated.shortVideo.dto.ShortVideoCreateResponseDto;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.ded;
import xsna.eef;
import xsna.fif;
import xsna.llf;
import xsna.nlf;
import xsna.pbf;
import xsna.rgf;
import xsna.rlf;
import xsna.xke;
import xsna.xy2;

/* compiled from: ClipsUploadSdkUploaderComponent.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadSdkUploaderComponentStub implements ClipsUploadSdkUploaderComponent {

    /* compiled from: ClipsUploadSdkUploaderComponent.kt */
    public static final class a implements pbf {
        @Override // xsna.pbf
        public final q<ShortVideoCreateResponseDto> a(com.vk.clips.uploader.api.model.a aVar, boolean z, long j) {
            return l1.b;
        }
    }

    /* compiled from: ClipsUploadSdkUploaderComponent.kt */
    public static final class b implements nlf {
        @Override // xsna.nlf
        public final ExecutorService a() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.nlf
        public final w b() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.nlf
        public final <T> q<T> c(xy2<T> xy2Var) {
            return l1.b;
        }

        @Override // xsna.nlf
        public final rlf d() {
            return null;
        }

        @Override // xsna.nlf
        public final w e() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.nlf
        public final rgf f() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.nlf
        public final llf getConfig() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.nlf
        public final xke getLogger() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final eef Zb() {
        return new c();
    }

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final nlf k() {
        return new b();
    }

    @Override // com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent
    public final pbf k3() {
        return new a();
    }

    /* compiled from: ClipsUploadSdkUploaderComponent.kt */
    public static final class c implements eef {
        @Override // xsna.eef
        public final q<List<Pair<ClipUploadJob, ded>>> b() {
            return l1.b;
        }

        @Override // xsna.eef
        public final List<Pair<ClipUploadJob, ded>> e() {
            return EmptyList.b;
        }

        @Override // xsna.eef
        public final q<List<fif>> f() {
            return l1.b;
        }

        @Override // xsna.eef
        public final /* bridge */ /* synthetic */ ClipUploadJob g(Integer num, ClipUploaderData clipUploaderData) {
            return null;
        }

        @Override // xsna.eef
        public final ClipUploadJob h(ClipsEncoderParameters clipsEncoderParameters) {
            return new ClipUploadJob(-1, null, null, null, null, false, null, null, null, null, 992, null);
        }

        @Override // xsna.eef
        public final q<Pair<ClipUploadJob, ded>> i() {
            return l1.b;
        }

        @Override // xsna.eef
        public final Set<File> s0() {
            return EmptySet.b;
        }

        @Override // xsna.eef
        public final void clear() {
        }

        @Override // xsna.eef
        public final void a(int i) {
        }

        @Override // xsna.eef
        public final void c(int i) {
        }

        @Override // xsna.eef
        public final void d(int i) {
        }
    }
}
