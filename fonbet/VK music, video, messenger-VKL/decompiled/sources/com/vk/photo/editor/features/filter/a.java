package com.vk.photo.editor.features.filter;

import com.vk.photo.editor.features.filter.FilterUiModel;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;

/* compiled from: FiltersAdapter.kt */
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: FiltersAdapter.kt */
    /* renamed from: com.vk.photo.editor.features.filter.a$a, reason: collision with other inner class name */
    public static final class C1457a extends a {
        public final FilterUiModel a;

        /* compiled from: FiltersAdapter.kt */
        /* renamed from: com.vk.photo.editor.features.filter.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1458a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FilterUiModel.Type.values().length];
                try {
                    iArr[FilterUiModel.Type.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FilterUiModel.Type.GROUP_ENTRY_POINT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FilterUiModel.Type.SUB_FILTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C1457a(FilterUiModel filterUiModel) {
            this.a = filterUiModel;
        }

        @Override // com.vk.photo.editor.features.filter.a
        public final int a() {
            FilterUiModel filterUiModel = this.a;
            int i = C1458a.$EnumSwitchMapping$0[filterUiModel.f.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            }
            FilterUiModel.a aVar = filterUiModel.c;
            if (epx.f(aVar, FilterUiModel.a.c.a)) {
                return 0;
            }
            return epx.f(aVar, FilterUiModel.a.C1456a.a) ? 2 : 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1457a) && epx.f(this.a, ((C1457a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Filter(filterUiModel=" + this.a + ")";
        }
    }

    /* compiled from: FiltersAdapter.kt */
    public static final class b extends a {
        public static final b a = new b();

        @Override // com.vk.photo.editor.features.filter.a
        public final int a() {
            return 0;
        }
    }

    public abstract int a();
}
