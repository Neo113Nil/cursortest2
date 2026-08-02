package ru.ozon.app.android.storefront.core.atoms.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.data.OpenRangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.data.TimeRangeFilter;
import ru.ozon.app.android.storefront.core.socialAtoms.SocialAtomType;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.parsing.AtomParserModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/di/LegacyStorefrontAtomParserModelsModule;", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class LegacyStorefrontAtomParserModelsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/di/LegacyStorefrontAtomParserModelsModule$Companion;", "", "<init>", "()V", "provideLegacyStorefrontAtomParserModels", "", "Lru/ozon/uni/atoms/parsing/AtomParserModel;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AtomParserModel> provideLegacyStorefrontAtomParserModels() {
            AtomParserModel[] elements = {new AtomParserModel(Type.RANGE_FILTER.getValue(), RangeFilter.class), new AtomParserModel(Type.TIME_RANGE_FILTER.getValue(), TimeRangeFilter.class), new AtomParserModel(Type.OPEN_RANGE_FILTER.getValue(), OpenRangeFilter.class), new AtomParserModel(SocialAtomType.SOCIAL_TEXT_ATOM.getValue(), SocialTextAtomDTO.class)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
