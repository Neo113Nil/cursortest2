package ru.ozon.app.android.checkoutcomposer.loader.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.loader.data.LoaderDTO;
import ru.ozon.app.android.checkoutcomposer.loader.presentation.LoaderVO;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/loader/presentation/LoaderVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/loader/presentation/LoaderVO;", "Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "toDsLoaderSize", "(Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;)Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoaderMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoaderDTO.Size.values().length];
            try {
                iArr[LoaderDTO.Size.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoaderDTO.Size.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoaderDTO.Size.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoaderDTO.Size.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoaderDTO.Size.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final DsLoaderSize toDsLoaderSize(LoaderDTO.Size size) {
        int i11 = size == null ? -1 : WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? DsLoaderSize.Size600 : DsLoaderSize.Size600 : DsLoaderSize.Size500 : DsLoaderSize.Size400 : DsLoaderSize.Size300 : DsLoaderSize.Size200;
    }

    @NotNull
    public static final LoaderVO toVO(@NotNull LoaderDTO loaderDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(loaderDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        return new LoaderVO(info.d().hashCode(), loaderDTO.getColor(), toDsLoaderSize(loaderDTO.getSize()));
    }
}
