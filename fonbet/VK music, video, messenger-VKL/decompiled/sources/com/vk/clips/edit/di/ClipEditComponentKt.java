package com.vk.clips.edit.di;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.core.x;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gzs;
import xsna.ht;
import xsna.izs;
import xsna.l7s;
import xsna.qwe;
import xsna.rld;
import xsna.s3q0;

/* compiled from: ClipEditComponent.kt */
/* loaded from: classes16.dex */
public final class ClipEditComponentKt {
    public static final ClipEditComponentKt$COMPONENT_STUB$1 a = new ClipEditComponent() { // from class: com.vk.clips.edit.di.ClipEditComponentKt$COMPONENT_STUB$1
        public final b a = new b();
        public final a b = new a();

        /* compiled from: ClipEditComponent.kt */
        public static final class a implements rld {

            /* compiled from: ClipEditComponent.kt */
            /* renamed from: com.vk.clips.edit.di.ClipEditComponentKt$COMPONENT_STUB$1$a$a, reason: collision with other inner class name */
            public static final class C0578a implements rld.a {
                @Override // xsna.rld.a
                public final Intent a(ClipsChoosePreviewParams clipsChoosePreviewParams) {
                    return new Intent();
                }
            }

            @Override // xsna.rld
            public final rld.a a(Context context, izs<? super ClipsChoosePreviewResult, s3q0> izsVar) {
                return new C0578a();
            }
        }

        @Override // com.vk.clips.edit.di.ClipEditComponent
        public final qwe d6() {
            return this.a;
        }

        @Override // com.vk.clips.edit.di.ClipEditComponent
        public final rld u4() {
            return this.b;
        }

        /* compiled from: ClipEditComponent.kt */
        public static final class b implements qwe {
            @Override // xsna.qwe
            public final PostingVisibilityMode a() {
                return PostingVisibilityMode.ALL;
            }

            @Override // xsna.qwe
            public final List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode) {
                return EmptyList.b;
            }

            @Override // xsna.qwe
            public final List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2) {
                return EmptyList.b;
            }

            @Override // xsna.qwe
            public final boolean d(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.qwe
            public final x<String> e(Context context, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2, PrivacyViewer privacyViewer) {
                return x.k("");
            }

            @Override // xsna.qwe
            public final String g(Context context) {
                return "";
            }

            @Override // xsna.qwe
            public final PostingVisibilityMode h() {
                return PostingVisibilityMode.ALL;
            }

            @Override // xsna.qwe
            public final String i() {
                return "";
            }

            @Override // xsna.qwe
            public final String k(Context context, List<UserId> list, List<Integer> list2) {
                return "";
            }

            @Override // xsna.qwe
            public final boolean m(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.qwe
            public final Integer n(VideoFile videoFile) {
                return null;
            }

            @Override // xsna.qwe
            public final PostingVisibilityMode p(PrivacySetting privacySetting) {
                return null;
            }

            @Override // xsna.qwe
            public final void f(PostingVisibilityMode postingVisibilityMode) {
            }

            @Override // xsna.qwe
            public final void l(l7s l7sVar, VideoFile videoFile) {
            }

            @Override // xsna.qwe
            public final void j(l7s l7sVar, View view, VideoFile videoFile, izs izsVar) {
            }

            @Override // xsna.qwe
            public final void o(Context context, ht htVar, gzs gzsVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            }
        }
    };
}
