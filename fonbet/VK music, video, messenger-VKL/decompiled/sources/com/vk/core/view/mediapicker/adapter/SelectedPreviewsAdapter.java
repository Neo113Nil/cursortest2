package com.vk.core.view.mediapicker.adapter;

import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.m;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.epx;
import xsna.f4m;
import xsna.gf6;
import xsna.hf6;
import xsna.iah0;
import xsna.jjc;
import xsna.n7b0;
import xsna.uai0;
import xsna.wai0;
import xsna.zif0;
import xsna.zrp;

/* compiled from: SelectedPreviewsAdapter.kt */
/* loaded from: classes17.dex */
public final class SelectedPreviewsAdapter extends gf6<b> {
    public static final float g = iah0.b(4.0f);
    public static final int h = iah0.a(44);
    public final wai0 e;
    public PreviewAspectRation f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectedPreviewsAdapter.kt */
    public static final class PreviewAspectRation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreviewAspectRation[] $VALUES;
        public static final PreviewAspectRation Square;
        public static final PreviewAspectRation Vertical;
        private final float value;

        static {
            PreviewAspectRation previewAspectRation = new PreviewAspectRation("Square", 0, 1.0f);
            Square = previewAspectRation;
            PreviewAspectRation previewAspectRation2 = new PreviewAspectRation("Vertical", 1, 0.72727275f);
            Vertical = previewAspectRation2;
            PreviewAspectRation[] previewAspectRationArr = {previewAspectRation, previewAspectRation2};
            $VALUES = previewAspectRationArr;
            $ENTRIES = new asp(previewAspectRationArr);
        }

        public PreviewAspectRation(String str, int i, float f) {
            this.value = f;
        }

        public static PreviewAspectRation valueOf(String str) {
            return (PreviewAspectRation) Enum.valueOf(PreviewAspectRation.class, str);
        }

        public static PreviewAspectRation[] values() {
            return (PreviewAspectRation[]) $VALUES.clone();
        }

        public final float h() {
            return this.value;
        }
    }

    /* compiled from: SelectedPreviewsAdapter.kt */
    public static final class a extends hf6<b> {
        public final c m;
        public final DefaultVkImageView n;
        public final Size o;

        public a(View view, PreviewAspectRation previewAspectRation, wai0 wai0Var) {
            super(view);
            this.m = wai0Var;
            DefaultVkImageView defaultVkImageView = (DefaultVkImageView) this.itemView;
            this.n = defaultVkImageView;
            int i = SelectedPreviewsAdapter.h;
            Size size = new Size((int) (previewAspectRation.h() * i), i);
            this.o = size;
            f4m.A(defaultVkImageView, size);
            defaultVkImageView.setCornerRadius(SelectedPreviewsAdapter.g);
            defaultVkImageView.setAspectRatio(previewAspectRation.h());
            defaultVkImageView.setDontLoadAgainIfSameResource(true);
            jjc.g(view, new n7b0(this, 4));
        }

        @Override // xsna.hf6
        public final void W5(b bVar) {
            this.n.m0(bVar.a.b, this.o);
        }
    }

    /* compiled from: SelectedPreviewsAdapter.kt */
    public static final class b extends zif0 {
        public final uai0 a;

        public b(uai0 uai0Var) {
            this.a = uai0Var;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.ds_selected_gallery_preview_holder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectedImagePreviewHolderItem(data=" + this.a + ')';
        }
    }

    /* compiled from: SelectedPreviewsAdapter.kt */
    public interface c {
        void b(uai0 uai0Var);
    }

    /* compiled from: SelectedPreviewsAdapter.kt */
    public static final class d extends m.e<b> {
        public static final d a = new d();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(b bVar, b bVar2) {
            return epx.f(bVar.a, bVar2.a);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(b bVar, b bVar2) {
            return bVar.a.a == bVar2.a.a;
        }
    }

    /* compiled from: SelectedPreviewsAdapter.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkMediaPicker.CellAspectRation.values().length];
            try {
                iArr[VkMediaPicker.CellAspectRation.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkMediaPicker.CellAspectRation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SelectedPreviewsAdapter(wai0 wai0Var) {
        super(new com.vk.lists.a(d.a), 2);
        this.e = wai0Var;
        this.f = PreviewAspectRation.Vertical;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        return new a(view, this.f, this.e);
    }
}
