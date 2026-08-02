package ru.ozon.uni.atoms.v3.holders.dsBadge;

import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000f\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u0007*\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0010\u001a1\u0010\u000f\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00122\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0013\u001a3\u0010\u0011\u001a\u00020\u0007*\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "preset", "", "getStyle", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;)I", "Lru/ozon/uni/android/atom/badge/BadgeView;", "style", "", "applyStyle", "(Lru/ozon/uni/android/atom/badge/BadgeView;I)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/atom/badge/BadgeView;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "bindOrGone", "Lru/ozon/uni/atoms/data/badge/Badge;", "(Lru/ozon/uni/android/atom/badge/BadgeView;Lru/ozon/uni/atoms/data/badge/Badge;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeHolderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeDTO.Style.values().length];
            try {
                iArr[BadgeDTO.Style.NEUTRAL_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_STATIC_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_PRIMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_PRIMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BadgeDTO.Style.POSITIVE_PRIMARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BadgeDTO.Style.POSITIVE_SECONDARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BadgeDTO.Style.ACTION_PRIMARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BadgeDTO.Style.ACTION_SECONDARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BadgeDTO.Style.SELLER_BONUS_LIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BadgeDTO.Style.SELLER_BONUS_DARK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BadgeDTO.Style.DIGITAL_GOODS_LIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BadgeDTO.Style.DIGITAL_GOODS_DARK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BadgeDTO.Style.PROMOTIONAL_FIRST_LIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BadgeDTO.Style.PROMOTIONAL_FIRST_DARK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_CARE_LIGHT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_CARE_DARK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BadgeDTO.Style.PRE_ORDER_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BadgeDTO.Style.PRE_ORDER_DARK.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BadgeDTO.Style.NEW_LIGHT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BadgeDTO.Style.NEW_DARK.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BadgeDTO.Style.BESTSELLER_LIGHT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BadgeDTO.Style.BESTSELLER_DARK.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BadgeDTO.Style.TSR_CERTIFICATE_LIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BadgeDTO.Style.TSR_CERTIFICATE_DARK.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_ADS_LIGHT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BadgeDTO.Style.OZON_ADS_DARK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BadgeDTO.Style.PAYMENT_AFTER_FITTING_LIGHT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BadgeDTO.Style.PAYMENT_AFTER_FITTING_DARK.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BadgeDTO.Style.POINTS_FOR_REVIEWS_LIGHT.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BadgeDTO.Style.POINTS_FOR_REVIEWS_DARK.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[BadgeDTO.Style.CASH_PAYMENT_LIGHT.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[BadgeDTO.Style.CASH_PAYMENT_DARK.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[BadgeDTO.Style.AUDIO_LIGHT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[BadgeDTO.Style.AUDIO_DARK.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[BadgeDTO.Style.ORIGINAL_PRODUCT_LIGHT.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[BadgeDTO.Style.ORIGINAL_PRODUCT_DARK.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[BadgeDTO.Style.OUT_OF_STOCK_LIGHT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[BadgeDTO.Style.OUT_OF_STOCK_DARK.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[BadgeDTO.Style.BIG_PROMO.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[BadgeDTO.Style.RATING.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[BadgeDTO.Style.PREMIUM_PLUS.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[BadgeDTO.Style.CUSTOM.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyStyle(BadgeView badgeView, int i11) {
        TypedArray obtainStyledAttributes = badgeView.getContext().obtainStyledAttributes(i11, R$styleable.BadgeView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Context context = badgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        badgeView.setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.BadgeView_backgroundGradient, R$styleable.BadgeView_android_background, 0));
        badgeView.setLeftIconColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_leftIconColor, 0));
        badgeView.setRightIconColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_rightIconColor, 0));
        badgeView.setTextColor(obtainStyledAttributes.getColor(R$styleable.BadgeView_android_textColor, 0));
        obtainStyledAttributes.recycle();
    }

    public static final void bind(@NotNull BadgeView badgeView, @NotNull BadgeDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(badgeView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(badgeView, dto, new BadgeHolderKt$bind$provider$1(badgeView), function1);
    }

    public static /* synthetic */ void bind$default(BadgeView badgeView, BadgeDTO badgeDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(badgeView, badgeDTO, (Function1<? super AtomAction, Unit>) function1);
    }

    public static final void bindOrGone(@NotNull BadgeView badgeView, BadgeDTO badgeDTO, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(badgeView, "<this>");
        if (badgeDTO == null) {
            badgeView.setVisibility(8);
        } else {
            badgeView.setVisibility(0);
            bind(badgeView, badgeDTO, function1);
        }
    }

    public static /* synthetic */ void bindOrGone$default(BadgeView badgeView, BadgeDTO badgeDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(badgeView, badgeDTO, (Function1<? super AtomAction, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getStyle(BadgeDTO.Style style) {
        switch (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case -1:
                return R$style.Badge_Neutral_Primary;
            case 0:
            default:
                throw new o();
            case 1:
                return R$style.Badge_Neutral_Primary;
            case 2:
                return R$style.Badge_Neutral_Secondary;
            case 3:
                return R$style.Badge_Neutral_Tertiary;
            case 4:
                return R$style.Badge_Neutral_Static_Primary;
            case 5:
                return R$style.Badge_Warning_Primary;
            case 6:
                return R$style.Badge_Warning_Secondary;
            case 7:
                return R$style.Badge_Negative_Primary;
            case 8:
                return R$style.Badge_Negative_Secondary;
            case 9:
                return R$style.Badge_Positive_Primary;
            case 10:
                return R$style.Badge_Positive_Secondary;
            case 11:
                return R$style.Badge_Action_Primary;
            case 12:
                return R$style.Badge_Action_Secondary;
            case 13:
                return R$style.Badge_SellerBonus_Light;
            case 14:
                return R$style.Badge_SellerBonus_Dark;
            case 15:
                return R$style.Badge_DigitalGoods_Light;
            case 16:
                return R$style.Badge_DigitalGoods_Dark;
            case 17:
                return R$style.Badge_PromotionalFirst_Light;
            case 18:
                return R$style.Badge_PromotionalFirst_Dark;
            case 19:
                return R$style.Badge_OzonCare_Light;
            case 20:
                return R$style.Badge_OzonCare_Dark;
            case 21:
                return R$style.Badge_PreOrder_Light;
            case 22:
                return R$style.Badge_PreOrder_Dark;
            case 23:
                return R$style.Badge_New_Light;
            case 24:
                return R$style.Badge_New_Dark;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                return R$style.Badge_Bestseller_Light;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                return R$style.Badge_Bestseller_Dark;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return R$style.Badge_TSRCertificate_Light;
            case 28:
                return R$style.Badge_TSRCertificate_Dark;
            case 29:
                return R$style.Badge_OzonAds_Light;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                return R$style.Badge_OzonAds_Dark;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return R$style.Badge_PaymentAfterFitting_Light;
            case 32:
                return R$style.Badge_PaymentAfterFitting_Dark;
            case 33:
                return R$style.Badge_PointsForReviews_Light;
            case 34:
                return R$style.Badge_PointsForReviews_Dark;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return R$style.Badge_CashPayment_Light;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return R$style.Badge_CashPayment_Dark;
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return R$style.Badge_Audio_Light;
            case 38:
                return R$style.Badge_Audio_Dark;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return R$style.Badge_OriginalProduct_Light;
            case 40:
                return R$style.Badge_OriginalProduct_Dark;
            case 41:
                return R$style.Badge_OutOfStock_Light;
            case 42:
                return R$style.Badge_OutOfStock_Dark;
            case 43:
                return R$style.Badge_BigPromo;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return R$style.Badge_Rating;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return R$style.Badge_PremiumPlus;
            case 46:
                return R$style.Badge_Custom;
        }
    }

    public static /* synthetic */ void bind$default(BadgeView badgeView, Badge badge, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(badgeView, badge, (Function1<? super AtomAction, Unit>) function1);
    }

    public static /* synthetic */ void bindOrGone$default(BadgeView badgeView, Badge badge, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bindOrGone(badgeView, badge, (Function1<? super AtomAction, Unit>) function1);
    }

    public static final void bind(@NotNull BadgeView badgeView, @NotNull Badge dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(badgeView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(badgeView, BadgeMapperKt.mapToDsBadge(dto), new BadgeHolderKt$bind$provider$2(badgeView), function1);
    }

    public static final void bindOrGone(@NotNull BadgeView badgeView, Badge badge, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(badgeView, "<this>");
        if (badge == null) {
            badgeView.setVisibility(8);
        } else {
            badgeView.setVisibility(0);
            bind(badgeView, badge, function1);
        }
    }
}
