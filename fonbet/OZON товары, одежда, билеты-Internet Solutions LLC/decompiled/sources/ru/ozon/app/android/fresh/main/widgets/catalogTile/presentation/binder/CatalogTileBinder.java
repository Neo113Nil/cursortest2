package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.binder;

import Lm0.a;
import Sc.o;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.TilePreset;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.CatalogTileView;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view.TileView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0012\u001a\u00020\u0010*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ;\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ'\u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J1\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/binder/CatalogTileBinder;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/TileView;", "tileList", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "catalogTileVO", "", "isSmallHeight", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "layoutParamsList", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "handler", "bindPreset", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;ZLjava/util/List;Lkotlin/jvm/functions/Function1;)V", "buildSingleParams", "()Ljava/util/List;", "", "widthTile", "spaceBetween", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "preset", "buildTwoParams", "(Ljava/util/List;IILru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;)Ljava/util/List;", "buildThreeParams", "buildFourParams", "buildFiveParams", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "spacers", "Landroid/content/Context;", "context", "calculateHeight", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;ZLandroid/content/Context;)I", "calculateWidthMin", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;Landroid/content/Context;)I", "rootView", "bindCatalogTile", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/view/CatalogTileView;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;Lkotlin/jvm/functions/Function1;)V", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<Integer> tileIdList = C7714v.b0(Integer.valueOf(R$id.tile1), Integer.valueOf(R$id.tile2), Integer.valueOf(R$id.tile3), Integer.valueOf(R$id.tile4), Integer.valueOf(R$id.tile5));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/binder/CatalogTileBinder$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "preset", "", "index", "", "resolveTileType", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;I)Ljava/lang/String;", "TILE_SIZE_1X1", "Ljava/lang/String;", "TILE_SIZE_2X1", "TILE_SIZE_1X2", "TILE_SIZE_3X1", "CATALOG_TILE_ITEM", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TilePreset.values().length];
                try {
                    iArr[TilePreset.PRESET_1XL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TilePreset.PRESET_2XL_L.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TilePreset.PRESET_2XL_R.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TilePreset.PRESET_3S_ALL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TilePreset.PRESET_3XL_ALL_L.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TilePreset.PRESET_3XL_ALL_R.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TilePreset.PRESET_4XL_LD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TilePreset.PRESET_4XL_LU.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TilePreset.PRESET_4XL_RD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TilePreset.PRESET_4XL_RU.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TilePreset.PRESET_5XL_L.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TilePreset.PRESET_5XL_R.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TilePreset.PRESET_INVALID.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String resolveTileType(@NotNull TilePreset preset, int index) {
            Intrinsics.checkNotNullParameter(preset, "preset");
            switch (WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
                case 1:
                    return "3x1";
                case 2:
                    return index == 0 ? "2x1" : "1x1";
                case 3:
                    return index == 0 ? "1x1" : "2x1";
                case 5:
                    if (index == 0) {
                        return "1x2";
                    }
                case 4:
                    return "1x1";
                case 6:
                    return index == 1 ? "1x2" : "1x1";
                case 7:
                case 8:
                    return index == 0 ? "1x2" : "1x1";
                case 9:
                case 10:
                    return index == 2 ? "1x2" : "1x1";
                case 11:
                    return index == 0 ? "2x1" : "1x1";
                case 12:
                    return index == 2 ? "1x2" : "1x1";
                case 13:
                    return "unknown";
                default:
                    throw new o();
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TilePreset.values().length];
            try {
                iArr[TilePreset.PRESET_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TilePreset.PRESET_1XL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TilePreset.PRESET_2XL_R.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TilePreset.PRESET_2XL_L.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TilePreset.PRESET_3XL_ALL_L.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TilePreset.PRESET_3XL_ALL_R.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TilePreset.PRESET_3S_ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TilePreset.PRESET_4XL_LD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TilePreset.PRESET_4XL_LU.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TilePreset.PRESET_4XL_RD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TilePreset.PRESET_4XL_RU.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TilePreset.PRESET_5XL_L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TilePreset.PRESET_5XL_R.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void bindPreset(CatalogTileView catalogTileView, List<TileView> list, CatalogTileVO catalogTileVO, boolean z11, List<? extends ConstraintLayout.b> list2, Function1<? super AtomAction, Unit> function1) {
        ViewGroup.LayoutParams layoutParams = catalogTileView.getLayoutParams();
        CatalogTileVO.PaddingsVO spacers = catalogTileVO.getSpacers();
        Context context = catalogTileView.getRootView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.height = calculateHeight(spacers, z11, context);
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TileView tileView = (TileView) obj;
            tileView.setLayoutParams(list2.get(i11));
            TilePreset preset = catalogTileVO.getPreset();
            tileView.setContentDescription("catalogTileItem");
            tileView.setPresetTypeForImage(Companion.resolveTileType(preset, i11));
            tileView.bind(catalogTileVO.getTiles().get(i11), catalogTileView.getTokenizedAnalytics(), function1);
            catalogTileView.addView(tileView);
            i11 = i12;
        }
    }

    private final List<ConstraintLayout.b> buildFiveParams(List<TileView> tileList, int widthTile, int spaceBetween, TilePreset preset) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i11 == 12) {
            ConstraintLayout.b bVar = new ConstraintLayout.b(widthTile, 0);
            bVar.f41628e = 0;
            bVar.f41636i = 0;
            bVar.f41642l = 0;
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(widthTile, widthTile);
            bVar2.f41630f = tileList.get(0).getId();
            bVar2.f41636i = 0;
            bVar2.setMargins(spaceBetween, 0, 0, 0);
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(widthTile, widthTile);
            bVar3.f41630f = tileList.get(1).getId();
            bVar3.f41636i = 0;
            bVar3.f41634h = 0;
            bVar3.setMargins(spaceBetween, 0, 0, 0);
            ConstraintLayout.b bVar4 = new ConstraintLayout.b(widthTile, widthTile);
            bVar4.f41630f = tileList.get(0).getId();
            bVar4.f41638j = tileList.get(1).getId();
            bVar4.f41642l = 0;
            bVar4.setMargins(spaceBetween, spaceBetween, 0, 0);
            ConstraintLayout.b bVar5 = new ConstraintLayout.b(widthTile, widthTile);
            bVar5.f41630f = tileList.get(3).getId();
            bVar5.f41638j = tileList.get(2).getId();
            bVar5.f41642l = 0;
            bVar5.f41634h = 0;
            bVar5.setMargins(spaceBetween, spaceBetween, 0, 0);
            return C7714v.b0(bVar, bVar2, bVar3, bVar4, bVar5);
        }
        if (i11 != 13) {
            return K.f71697a;
        }
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(widthTile, widthTile);
        bVar6.f41628e = 0;
        bVar6.f41636i = 0;
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(widthTile, widthTile);
        bVar7.f41630f = tileList.get(0).getId();
        bVar7.f41636i = 0;
        bVar7.setMargins(spaceBetween, 0, 0, 0);
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(widthTile, 0);
        bVar8.f41630f = tileList.get(1).getId();
        bVar8.f41636i = 0;
        bVar8.f41642l = 0;
        bVar8.f41634h = 0;
        bVar8.setMargins(spaceBetween, 0, 0, 0);
        ConstraintLayout.b bVar9 = new ConstraintLayout.b(widthTile, widthTile);
        bVar9.f41628e = 0;
        bVar9.f41638j = tileList.get(0).getId();
        bVar9.f41642l = 0;
        bVar9.setMargins(0, spaceBetween, 0, 0);
        ConstraintLayout.b bVar10 = new ConstraintLayout.b(widthTile, widthTile);
        bVar10.f41630f = tileList.get(3).getId();
        bVar10.f41638j = tileList.get(1).getId();
        bVar10.f41642l = 0;
        bVar10.setMargins(spaceBetween, spaceBetween, 0, 0);
        return C7714v.b0(bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    private final List<ConstraintLayout.b> buildFourParams(List<TileView> tileList, int widthTile, int spaceBetween, TilePreset preset) {
        switch (WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
            case 8:
                ConstraintLayout.b bVar = new ConstraintLayout.b(widthTile, 0);
                bVar.f41628e = 0;
                bVar.f41636i = 0;
                bVar.f41642l = 0;
                bVar.setMargins(0, 0, 0, 0);
                ConstraintLayout.b bVar2 = new ConstraintLayout.b(widthTile, widthTile);
                bVar2.f41630f = tileList.get(0).getId();
                bVar2.f41636i = 0;
                bVar2.setMargins(spaceBetween, 0, 0, 0);
                ConstraintLayout.b bVar3 = new ConstraintLayout.b(widthTile, widthTile);
                bVar3.f41630f = tileList.get(1).getId();
                bVar3.f41636i = 0;
                bVar3.f41634h = 0;
                bVar3.setMargins(spaceBetween, 0, 0, 0);
                ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, widthTile);
                bVar4.f41630f = tileList.get(0).getId();
                bVar4.f41638j = tileList.get(1).getId();
                bVar4.f41642l = 0;
                bVar4.f41634h = 0;
                bVar4.setMargins(spaceBetween, spaceBetween, 0, 0);
                return C7714v.b0(bVar, bVar2, bVar3, bVar4);
            case 9:
                ConstraintLayout.b bVar5 = new ConstraintLayout.b(widthTile, 0);
                bVar5.f41628e = 0;
                bVar5.f41636i = 0;
                bVar5.f41642l = 0;
                bVar5.setMargins(0, 0, 0, 0);
                ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, widthTile);
                bVar6.f41630f = tileList.get(0).getId();
                bVar6.f41636i = 0;
                bVar6.f41634h = 0;
                bVar6.setMargins(spaceBetween, 0, 0, 0);
                ConstraintLayout.b bVar7 = new ConstraintLayout.b(widthTile, widthTile);
                bVar7.f41630f = tileList.get(0).getId();
                bVar7.f41638j = tileList.get(1).getId();
                bVar7.f41642l = 0;
                bVar7.setMargins(spaceBetween, spaceBetween, 0, 0);
                ConstraintLayout.b bVar8 = new ConstraintLayout.b(widthTile, widthTile);
                bVar8.f41630f = tileList.get(2).getId();
                bVar8.f41638j = tileList.get(1).getId();
                bVar8.f41642l = 0;
                bVar8.f41634h = 0;
                bVar8.setMargins(spaceBetween, spaceBetween, 0, 0);
                return C7714v.b0(bVar5, bVar6, bVar7, bVar8);
            case 10:
                ConstraintLayout.b bVar9 = new ConstraintLayout.b(widthTile, widthTile);
                bVar9.f41628e = 0;
                bVar9.f41636i = 0;
                bVar9.setMargins(0, 0, 0, 0);
                ConstraintLayout.b bVar10 = new ConstraintLayout.b(widthTile, widthTile);
                bVar10.f41630f = tileList.get(0).getId();
                bVar10.f41636i = 0;
                bVar10.setMargins(spaceBetween, 0, 0, 0);
                ConstraintLayout.b bVar11 = new ConstraintLayout.b(widthTile, 0);
                bVar11.f41630f = tileList.get(1).getId();
                bVar11.f41636i = 0;
                bVar11.f41642l = 0;
                bVar11.f41634h = 0;
                bVar11.setMargins(spaceBetween, 0, 0, 0);
                ConstraintLayout.b bVar12 = new ConstraintLayout.b(0, widthTile);
                bVar12.f41628e = 0;
                bVar12.f41638j = tileList.get(0).getId();
                bVar12.f41642l = 0;
                bVar12.f41632g = tileList.get(2).getId();
                bVar12.setMargins(0, spaceBetween, spaceBetween, 0);
                return C7714v.b0(bVar9, bVar10, bVar11, bVar12);
            case 11:
                ConstraintLayout.b bVar13 = new ConstraintLayout.b(0, widthTile);
                bVar13.f41628e = 0;
                bVar13.f41636i = 0;
                bVar13.f41632g = tileList.get(1).getId();
                bVar13.setMargins(0, 0, spaceBetween, 0);
                ConstraintLayout.b bVar14 = new ConstraintLayout.b(widthTile, 0);
                bVar14.f41636i = 0;
                bVar14.f41642l = 0;
                bVar14.f41634h = 0;
                bVar14.setMargins(0, 0, 0, 0);
                ConstraintLayout.b bVar15 = new ConstraintLayout.b(widthTile, widthTile);
                bVar15.f41628e = 0;
                bVar15.f41638j = tileList.get(0).getId();
                bVar15.f41642l = 0;
                bVar15.setMargins(0, spaceBetween, 0, 0);
                ConstraintLayout.b bVar16 = new ConstraintLayout.b(widthTile, widthTile);
                bVar16.f41630f = tileList.get(2).getId();
                bVar16.f41638j = tileList.get(0).getId();
                bVar16.f41642l = 0;
                bVar16.setMargins(spaceBetween, spaceBetween, 0, 0);
                return C7714v.b0(bVar13, bVar14, bVar15, bVar16);
            default:
                return K.f71697a;
        }
    }

    private final List<ConstraintLayout.b> buildSingleParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41628e = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41634h = 0;
        return C7714v.a0(bVar);
    }

    private final List<ConstraintLayout.b> buildThreeParams(List<TileView> tileList, int widthTile, int spaceBetween, TilePreset preset) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i11 == 5) {
            ConstraintLayout.b bVar = new ConstraintLayout.b(widthTile, 0);
            bVar.f41628e = 0;
            bVar.f41636i = 0;
            bVar.f41642l = 0;
            bVar.setMargins(0, 0, 0, 0);
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, widthTile);
            bVar2.f41630f = tileList.get(0).getId();
            bVar2.f41636i = 0;
            bVar2.f41634h = 0;
            bVar2.setMargins(spaceBetween, 0, 0, 0);
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, widthTile);
            bVar3.f41630f = tileList.get(0).getId();
            bVar3.f41638j = tileList.get(1).getId();
            bVar3.f41642l = 0;
            bVar3.f41634h = 0;
            bVar3.setMargins(spaceBetween, spaceBetween, 0, 0);
            return C7714v.b0(bVar, bVar2, bVar3);
        }
        if (i11 == 6) {
            ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, widthTile);
            bVar4.f41632g = tileList.get(1).getId();
            bVar4.f41636i = 0;
            bVar4.f41628e = 0;
            bVar4.setMargins(0, 0, spaceBetween, 0);
            ConstraintLayout.b bVar5 = new ConstraintLayout.b(widthTile, 0);
            bVar5.f41642l = 0;
            bVar5.f41636i = 0;
            bVar5.f41634h = 0;
            bVar5.setMargins(0, 0, 0, 0);
            ConstraintLayout.b bVar6 = new ConstraintLayout.b(0, widthTile);
            bVar6.f41628e = 0;
            bVar6.f41638j = tileList.get(0).getId();
            bVar6.f41642l = 0;
            bVar6.f41632g = tileList.get(1).getId();
            bVar6.setMargins(0, spaceBetween, spaceBetween, 0);
            return C7714v.b0(bVar4, bVar5, bVar6);
        }
        if (i11 != 7) {
            return K.f71697a;
        }
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(widthTile, widthTile);
        bVar7.f41628e = 0;
        bVar7.f41636i = 0;
        bVar7.f41642l = 0;
        bVar7.setMargins(0, 0, 0, 0);
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(widthTile, widthTile);
        bVar8.f41630f = tileList.get(0).getId();
        bVar8.f41636i = 0;
        bVar8.f41642l = 0;
        bVar8.setMargins(spaceBetween, 0, 0, 0);
        ConstraintLayout.b bVar9 = new ConstraintLayout.b(widthTile, widthTile);
        bVar9.f41630f = tileList.get(1).getId();
        bVar9.f41636i = 0;
        bVar9.f41642l = 0;
        bVar9.f41634h = 0;
        bVar9.setMargins(spaceBetween, 0, 0, 0);
        return C7714v.b0(bVar7, bVar8, bVar9);
    }

    private final List<ConstraintLayout.b> buildTwoParams(List<TileView> tileList, int widthTile, int spaceBetween, TilePreset preset) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[preset.ordinal()];
        if (i11 == 3) {
            ConstraintLayout.b bVar = new ConstraintLayout.b(widthTile, widthTile);
            bVar.f41628e = 0;
            bVar.f41636i = 0;
            bVar.f41642l = 0;
            bVar.setMargins(0, 0, 0, 0);
            ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, widthTile);
            bVar2.f41630f = tileList.get(0).getId();
            bVar2.f41636i = 0;
            bVar2.f41642l = 0;
            bVar2.f41634h = 0;
            bVar2.setMargins(spaceBetween, 0, 0, 0);
            return C7714v.b0(bVar, bVar2);
        }
        if (i11 != 4) {
            return K.f71697a;
        }
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, widthTile);
        bVar3.f41628e = 0;
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        bVar3.f41632g = tileList.get(1).getId();
        bVar3.setMargins(0, 0, spaceBetween, 0);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(widthTile, widthTile);
        bVar4.f41636i = 0;
        bVar4.f41642l = 0;
        bVar4.f41634h = 0;
        bVar4.setMargins(0, 0, 0, 0);
        return C7714v.b0(bVar3, bVar4);
    }

    private final int calculateHeight(CatalogTileVO.PaddingsVO spacers, boolean isSmallHeight, Context context) {
        int bottom = spacers.getBottom() + spacers.getTop();
        int calculateWidthMin = calculateWidthMin(spacers, context);
        if (isSmallHeight) {
            return bottom + calculateWidthMin;
        }
        return spacers.getBetween() + (calculateWidthMin * 2) + bottom;
    }

    private final int calculateWidthMin(CatalogTileVO.PaddingsVO spacers, Context context) {
        return (context.getResources().getDisplayMetrics().widthPixels - (spacers.getRight() + (spacers.getLeft() + (spacers.getBetween() * 2)))) / 3;
    }

    public final void bindCatalogTile(@NotNull CatalogTileView rootView, @NotNull CatalogTileVO catalogTileVO, @NotNull Function1<? super AtomAction, Unit> handler) {
        List<ConstraintLayout.b> buildSingleParams;
        List<ConstraintLayout.b> list;
        boolean z11;
        List<ConstraintLayout.b> buildFourParams;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(catalogTileVO, "catalogTileVO");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : catalogTileVO.getTiles()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            int intValue = tileIdList.get(i11).intValue();
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(new TileView(context, intValue, null, 0, 12, null));
            i11 = i12;
        }
        CatalogTileVO.PaddingsVO spacers = catalogTileVO.getSpacers();
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int calculateWidthMin = calculateWidthMin(spacers, context2);
        int between = catalogTileVO.getSpacers().getBetween();
        try {
            boolean z12 = true;
            switch (WhenMappings.$EnumSwitchMapping$0[catalogTileVO.getPreset().ordinal()]) {
                case 1:
                    return;
                case 2:
                    buildSingleParams = buildSingleParams();
                    list = buildSingleParams;
                    z11 = z12;
                    bindPreset(rootView, arrayList, catalogTileVO, z11, list, handler);
                    return;
                case 3:
                case 4:
                    buildSingleParams = buildTwoParams(arrayList, calculateWidthMin, between, catalogTileVO.getPreset());
                    list = buildSingleParams;
                    z11 = z12;
                    bindPreset(rootView, arrayList, catalogTileVO, z11, list, handler);
                    return;
                case 5:
                case 6:
                case 7:
                    if (catalogTileVO.getPreset() != TilePreset.PRESET_3S_ALL) {
                        z12 = false;
                    }
                    buildSingleParams = buildThreeParams(arrayList, calculateWidthMin, between, catalogTileVO.getPreset());
                    list = buildSingleParams;
                    z11 = z12;
                    bindPreset(rootView, arrayList, catalogTileVO, z11, list, handler);
                    return;
                case 8:
                case 9:
                case 10:
                case 11:
                    buildFourParams = buildFourParams(arrayList, calculateWidthMin, between, catalogTileVO.getPreset());
                    list = buildFourParams;
                    z11 = false;
                    bindPreset(rootView, arrayList, catalogTileVO, z11, list, handler);
                    return;
                case 12:
                case 13:
                    buildFourParams = buildFiveParams(arrayList, calculateWidthMin, between, catalogTileVO.getPreset());
                    list = buildFourParams;
                    z11 = false;
                    bindPreset(rootView, arrayList, catalogTileVO, z11, list, handler);
                    return;
                default:
                    throw new o();
            }
        } catch (Exception e11) {
            a.f17149a.d(e11.getMessage(), new Object[0]);
        }
    }
}
