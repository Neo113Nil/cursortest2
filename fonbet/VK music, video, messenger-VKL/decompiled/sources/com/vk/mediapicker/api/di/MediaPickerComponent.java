package com.vk.mediapicker.api.di;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.mt10;
import xsna.nb0;
import xsna.ou10;

/* compiled from: MediaPickerComponent.kt */
/* loaded from: classes3.dex */
public interface MediaPickerComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MediaPickerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MediaPickerComponent STUB = new MediaPickerComponent() { // from class: com.vk.mediapicker.api.di.MediaPickerComponent$Companion$STUB$1
            public final b a = new b();
            public final a b = new a();

            @Override // com.vk.mediapicker.api.di.MediaPickerComponent
            public final mt10 Be() {
                return this.b;
            }

            @Override // com.vk.mediapicker.api.di.MediaPickerComponent
            public final ou10 Xc() {
                return this.a;
            }

            /* compiled from: MediaPickerComponent.kt */
            public static final class a implements mt10 {
                @Override // xsna.mt10
                public final void C() {
                }

                @Override // xsna.mt10
                public final void D() {
                }

                @Override // xsna.mt10
                public final void d() {
                }

                @Override // xsna.mt10
                public final void g() {
                }

                @Override // xsna.mt10
                public final void k() {
                }

                @Override // xsna.mt10
                public final void onResume() {
                }

                @Override // xsna.mt10
                public final void a(int i) {
                }

                @Override // xsna.mt10
                public final void b(int i) {
                }

                @Override // xsna.mt10
                public final void f(int i) {
                }

                @Override // xsna.mt10
                public final void i(int i) {
                }

                @Override // xsna.mt10
                public final void K0(int i, String[] strArr) {
                }

                @Override // xsna.mt10
                public final void c(int i, ArrayList arrayList) {
                }

                @Override // xsna.mt10
                public final void e(FragmentImpl fragmentImpl, MediaPickerConfiguration.MediaType mediaType) {
                }

                @Override // xsna.mt10
                public final void j(int i, ArrayList arrayList) {
                }

                @Override // xsna.mt10
                public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                }

                @Override // xsna.mt10
                public final void h(FragmentImpl fragmentImpl, int i, int i2, Intent intent) {
                }

                @Override // xsna.mt10
                public final void l(FragmentImpl fragmentImpl, MediaPickerConfiguration mediaPickerConfiguration, List list, mt10.a aVar) {
                }
            }

            /* compiled from: MediaPickerComponent.kt */
            public static final class b implements ou10 {
                @Override // xsna.ou10
                public final List<MediaStoreEntry> a(ActivityResult activityResult) {
                    return EmptyList.b;
                }

                @Override // xsna.ou10
                public final Fragment c(MediaPickerFragmentArguments mediaPickerFragmentArguments) {
                    return new Fragment();
                }

                @Override // xsna.ou10
                public final void b(Context context, nb0 nb0Var, MediaPickerFragmentArguments mediaPickerFragmentArguments) {
                }
            }
        };

        public final MediaPickerComponent getSTUB() {
            return STUB;
        }
    }

    mt10 Be();

    ou10 Xc();
}
