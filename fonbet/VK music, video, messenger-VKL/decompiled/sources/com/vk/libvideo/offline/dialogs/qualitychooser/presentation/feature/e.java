package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.QualityChooserFeatureState;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.d;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.mi10;

/* compiled from: QualityChooserReducer.kt */
/* loaded from: classes3.dex */
public final class e extends dm50<QualityChooserViewState, d, QualityChooserFeatureState> {

    /* compiled from: QualityChooserReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QualityChooserFeatureState.QualityOption.QualityOptionType.values().length];
            try {
                iArr[QualityChooserFeatureState.QualityOption.QualityOptionType.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityChooserFeatureState.QualityOption.QualityOptionType.AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QualityChooserFeatureState.QualityOption.QualityOptionType.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QualityChooserFeatureState.QualityOption.QualityOptionType.AUDIO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e() {
        super(new QualityChooserFeatureState.a(EmptyList.b));
    }

    @Override // xsna.dm50
    public final QualityChooserFeatureState c(QualityChooserFeatureState qualityChooserFeatureState, d dVar) {
        d dVar2 = dVar;
        if (dVar2 instanceof d.a) {
            return new QualityChooserFeatureState.a(((d.a) dVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final QualityChooserViewState d() {
        return new QualityChooserViewState(e(new mi10(this, 19)));
    }

    @Override // xsna.dm50
    public final void h(QualityChooserFeatureState qualityChooserFeatureState, QualityChooserViewState qualityChooserViewState) {
        QualityChooserFeatureState qualityChooserFeatureState2 = qualityChooserFeatureState;
        QualityChooserViewState qualityChooserViewState2 = qualityChooserViewState;
        if (!(qualityChooserFeatureState2 instanceof QualityChooserFeatureState.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(qualityChooserViewState2.a, qualityChooserFeatureState2);
    }
}
