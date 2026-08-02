package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature;

import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.QualityChooserFeatureState;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.c;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.d;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.offline.e;
import one.video.exo.offline.f;
import xsna.c5g;
import xsna.epx;
import xsna.f4z;
import xsna.kbq;
import xsna.mao;
import xsna.oao;
import xsna.tdm;
import xsna.whs0;
import xsna.wk50;

/* compiled from: QualityChooserFeature.kt */
/* loaded from: classes3.dex */
public final class b extends wk50<QualityChooserViewState, QualityChooserFeatureState, com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a, d> {
    public final boolean f;
    public final f4z g;
    public LinkedHashMap h;

    /* compiled from: QualityChooserFeature.kt */
    public static final class a {
        public final QualityChooserFeatureState.QualityOption a;
        public final f b;

        public a(QualityChooserFeatureState.QualityOption qualityOption, f fVar) {
            this.a = qualityOption;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OptionInfo(option=" + this.a + ", selection=" + this.b + ')';
        }
    }

    /* compiled from: QualityChooserFeature.kt */
    /* renamed from: com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1241b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QualityChooserViewState.QualityOption.QualityOptionType.values().length];
            try {
                iArr[QualityChooserViewState.QualityOption.QualityOptionType.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QualityChooserViewState.QualityOption.QualityOptionType.AVG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QualityChooserViewState.QualityOption.QualityOptionType.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QualityChooserViewState.QualityOption.QualityOptionType.AUDIO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(tdm tdmVar, e eVar, boolean z) {
        super(new a.c(tdmVar), eVar);
        this.f = z;
        this.g = new f4z();
    }

    public static final void U(a aVar, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        QualityChooserFeatureState.QualityOption qualityOption = aVar.a;
        linkedHashMap.put(qualityOption.a, aVar.b);
        arrayList.add(qualityOption);
    }

    @Override // xsna.wk50
    public final void N(QualityChooserFeatureState qualityChooserFeatureState, com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a aVar) {
        QualityChooserFeatureState.QualityOption.QualityOptionType qualityOptionType;
        QualityOptionTypeDo qualityOptionTypeDo;
        a aVar2;
        a aVar3;
        a aVar4;
        f fVar;
        com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a aVar5 = aVar;
        if (!(aVar5 instanceof a.c)) {
            boolean z = aVar5 instanceof a.C1240a;
            f4z f4zVar = this.g;
            if (!z) {
                if (!(aVar5 instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(c.b.a);
                return;
            }
            LinkedHashMap linkedHashMap = this.h;
            if (linkedHashMap != null) {
                QualityChooserViewState.QualityOption.QualityOptionType qualityOptionType2 = ((a.C1240a) aVar5).b;
                int[] iArr = C1241b.$EnumSwitchMapping$0;
                int i = iArr[qualityOptionType2.ordinal()];
                if (i == 1) {
                    qualityOptionType = QualityChooserFeatureState.QualityOption.QualityOptionType.HIGH;
                } else if (i == 2) {
                    qualityOptionType = QualityChooserFeatureState.QualityOption.QualityOptionType.AVG;
                } else if (i == 3) {
                    qualityOptionType = QualityChooserFeatureState.QualityOption.QualityOptionType.LOW;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qualityOptionType = QualityChooserFeatureState.QualityOption.QualityOptionType.AUDIO_ONLY;
                }
                f fVar2 = (f) linkedHashMap.get(qualityOptionType);
                if (fVar2 != null) {
                    int i2 = iArr[qualityOptionType2.ordinal()];
                    if (i2 == 1) {
                        qualityOptionTypeDo = QualityOptionTypeDo.HIGH;
                    } else if (i2 == 2) {
                        qualityOptionTypeDo = QualityOptionTypeDo.AVG;
                    } else if (i2 == 3) {
                        qualityOptionTypeDo = QualityOptionTypeDo.LOW;
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qualityOptionTypeDo = QualityOptionTypeDo.AUDIO_ONLY;
                    }
                    f4zVar.b(new c.a(qualityOptionTypeDo, fVar2));
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        tdm tdmVar = ((a.c) aVar5).b;
        f b = mao.b(tdmVar);
        a aVar6 = null;
        if (b != null) {
            whs0 b2 = oao.b(b, tdmVar);
            aVar2 = new a(new QualityChooserFeatureState.QualityOption(QualityChooserFeatureState.QualityOption.QualityOptionType.HIGH, b2.a, b2.b), b);
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            U(aVar2, linkedHashMap2, arrayList);
        }
        f a2 = mao.a(tdmVar);
        if (a2 != null) {
            whs0 b3 = oao.b(a2, tdmVar);
            aVar3 = new a(new QualityChooserFeatureState.QualityOption(QualityChooserFeatureState.QualityOption.QualityOptionType.AVG, b3.a, b3.b), a2);
        } else {
            aVar3 = null;
        }
        if (aVar3 != null) {
            U(aVar3, linkedHashMap2, arrayList);
        }
        f c = mao.c(tdmVar);
        if (c != null) {
            whs0 b4 = oao.b(c, tdmVar);
            aVar4 = new a(new QualityChooserFeatureState.QualityOption(QualityChooserFeatureState.QualityOption.QualityOptionType.LOW, b4.a, b4.b), c);
        } else {
            aVar4 = null;
        }
        if (aVar4 != null) {
            U(aVar4, linkedHashMap2, arrayList);
        }
        if (!this.f) {
            if (((List) tdmVar.c).isEmpty()) {
                fVar = null;
            } else {
                e.b bVar = new e.b();
                e.a aVar7 = new e.a();
                List list = (List) tdmVar.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kbq) it.next()).a);
                }
                fVar = new f(bVar, aVar7, new e.c(arrayList2));
            }
            if (fVar != null) {
                whs0 b5 = oao.b(fVar, tdmVar);
                aVar6 = new a(new QualityChooserFeatureState.QualityOption(QualityChooserFeatureState.QualityOption.QualityOptionType.AUDIO_ONLY, b5.a, b5.b), fVar);
            }
            if (aVar6 != null) {
                U(aVar6, linkedHashMap2, arrayList);
            }
        }
        this.h = linkedHashMap2;
        T(new d.a(arrayList));
    }
}
