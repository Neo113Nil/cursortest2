package com.vk.id.onetap.xml;

import Ca.D;
import Ca.E;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.xml.GroupSubscriptionAttrsKt;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonCornersStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonElevationStyle;
import com.vk.id.onetap.common.button.style.OneTapButtonSizeStyle;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.xml.OneTapAtrrUtilKt;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a3\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\f*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018*\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u0015*\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020\b*\u00020\u00002\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010$¨\u0006'"}, d2 = {"Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lcom/vk/id/onetap/xml/OneTapParsedAttrs;", "parseOneTapAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/vk/id/onetap/xml/OneTapParsedAttrs;", "Landroid/content/res/TypedArray;", "", "getButtonsCornerRadius", "(Landroid/content/res/TypedArray;Landroid/content/Context;)F", "getOneTapButtonsElevation", "Lkotlin/Function3;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonCornersStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "Lcom/vk/id/onetap/common/button/style/OneTapButtonElevationStyle;", "Lcom/vk/id/onetap/common/OneTapStyle;", "getOneTapStyleConstructor", "(Landroid/content/res/TypedArray;Landroid/content/Context;)Lfd/n;", "getOneTapButtonsSize", "(Landroid/content/res/TypedArray;)Lcom/vk/id/onetap/common/button/style/OneTapButtonSizeStyle;", "", "getSignInToAnotherAccountButtonEnabled", "(Landroid/content/res/TypedArray;)Z", "", "Lcom/vk/id/onetap/common/OneTapOAuth;", "getOAuths", "(Landroid/content/res/TypedArray;)Ljava/util/Set;", "", "getScopes", "getFastAuthEnabled", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "getOneTapScenario", "(Landroid/content/res/TypedArray;)Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "px", "pixelsToDp", "(Landroid/content/Context;F)F", "dp", "dpToPixels", "onetap-xml_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapAtrrUtilKt {
    private static final float dpToPixels(Context context, float f7) {
        return TypedValue.applyDimension(1, f7, context.getResources().getDisplayMetrics());
    }

    private static final float getButtonsCornerRadius(TypedArray typedArray, Context context) {
        return typedArray.getDimension(R$styleable.vkid_OneTap_vkid_buttonsCornerRadius, dpToPixels(context, OneTapButtonCornersStyle.Default.INSTANCE.getRadiusDp()));
    }

    private static final boolean getFastAuthEnabled(TypedArray typedArray) {
        return typedArray.getBoolean(R$styleable.vkid_OneTap_vkid_onetapFastAuthEnabled, true);
    }

    private static final Set<OneTapOAuth> getOAuths(TypedArray typedArray) {
        OneTapOAuth oneTapOAuth;
        String string = typedArray.getString(R$styleable.vkid_OneTap_vkid_onetapOAuths);
        if (string == null) {
            string = "";
        }
        List l11 = h.l(string, new char[]{','}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l11) {
            if (!h.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Intrinsics.d(str, "mail")) {
                oneTapOAuth = OneTapOAuth.MAIL;
            } else {
                if (!Intrinsics.d(str, "ok")) {
                    throw new IllegalStateException(("Unexpected oauth \"" + str + "\", please use one of \"mail\" or \"ok\", separated by commas").toString());
                }
                oneTapOAuth = OneTapOAuth.OK;
            }
            arrayList2.add(oneTapOAuth);
        }
        return C7714v.Y0(arrayList2);
    }

    private static final float getOneTapButtonsElevation(TypedArray typedArray, Context context) {
        return typedArray.getDimension(R$styleable.vkid_OneTap_vkid_buttonsElevation, dpToPixels(context, OneTapButtonElevationStyle.Default.INSTANCE.getElevationDp()));
    }

    private static final OneTapButtonSizeStyle getOneTapButtonsSize(TypedArray typedArray) {
        switch (typedArray.getInt(R$styleable.vkid_OneTap_vkid_buttonsSize, 0)) {
            case 1:
                return OneTapButtonSizeStyle.SMALL_32;
            case 2:
                return OneTapButtonSizeStyle.SMALL_34;
            case 3:
                return OneTapButtonSizeStyle.SMALL_36;
            case 4:
                return OneTapButtonSizeStyle.SMALL_38;
            case 5:
                return OneTapButtonSizeStyle.MEDIUM_40;
            case 6:
                return OneTapButtonSizeStyle.MEDIUM_42;
            case 7:
                return OneTapButtonSizeStyle.MEDIUM_44;
            case 8:
                return OneTapButtonSizeStyle.MEDIUM_46;
            case 9:
                return OneTapButtonSizeStyle.LARGE_48;
            case 10:
                return OneTapButtonSizeStyle.LARGE_50;
            case 11:
                return OneTapButtonSizeStyle.LARGE_52;
            case 12:
                return OneTapButtonSizeStyle.LARGE_54;
            case 13:
                return OneTapButtonSizeStyle.LARGE_56;
            default:
                return OneTapButtonSizeStyle.DEFAULT;
        }
    }

    private static final OneTapTitleScenario getOneTapScenario(TypedArray typedArray) {
        switch (typedArray.getInt(R$styleable.vkid_OneTap_vkid_onetapScenario, 0)) {
            case 1:
                return OneTapTitleScenario.SignUp;
            case 2:
                return OneTapTitleScenario.Get;
            case 3:
                return OneTapTitleScenario.Open;
            case 4:
                return OneTapTitleScenario.Calculate;
            case 5:
                return OneTapTitleScenario.Order;
            case 6:
                return OneTapTitleScenario.PlaceOrder;
            case 7:
                return OneTapTitleScenario.SendRequest;
            case 8:
                return OneTapTitleScenario.Participate;
            default:
                return OneTapTitleScenario.SignIn;
        }
    }

    private static final InterfaceC6511n<OneTapButtonCornersStyle, OneTapButtonSizeStyle, OneTapButtonElevationStyle, OneTapStyle> getOneTapStyleConstructor(TypedArray typedArray, final Context context) {
        switch (typedArray.getInt(R$styleable.vkid_OneTap_vkid_onetapStyle, 0)) {
            case 1:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$1.INSTANCE;
            case 2:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$2.INSTANCE;
            case 3:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$3.INSTANCE;
            case 4:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$4.INSTANCE;
            case 5:
                return new InterfaceC6511n() { // from class: Ca.C
                    @Override // fd.InterfaceC6511n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        OneTapStyle oneTapStyleConstructor$lambda$5;
                        oneTapStyleConstructor$lambda$5 = OneTapAtrrUtilKt.getOneTapStyleConstructor$lambda$5(context, (OneTapButtonCornersStyle) obj, (OneTapButtonSizeStyle) obj2, (OneTapButtonElevationStyle) obj3);
                        return oneTapStyleConstructor$lambda$5;
                    }
                };
            case 6:
                return new D(context, 0);
            case 7:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$7.INSTANCE;
            case 8:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$8.INSTANCE;
            case 9:
                return new E(context, 0);
            default:
                return OneTapAtrrUtilKt$getOneTapStyleConstructor$10.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OneTapStyle getOneTapStyleConstructor$lambda$5(Context context, OneTapButtonCornersStyle cornersStyle, OneTapButtonSizeStyle sizeStyle, OneTapButtonElevationStyle elevationStyle) {
        Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
        Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        return OneTapStyle.INSTANCE.system(context, cornersStyle, sizeStyle, elevationStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OneTapStyle getOneTapStyleConstructor$lambda$6(Context context, OneTapButtonCornersStyle cornersStyle, OneTapButtonSizeStyle sizeStyle, OneTapButtonElevationStyle elevationStyle) {
        Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
        Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        return OneTapStyle.INSTANCE.transparentSystem(context, cornersStyle, sizeStyle, elevationStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OneTapStyle getOneTapStyleConstructor$lambda$7(Context context, OneTapButtonCornersStyle cornersStyle, OneTapButtonSizeStyle sizeStyle, OneTapButtonElevationStyle elevationStyle) {
        Intrinsics.checkNotNullParameter(cornersStyle, "cornersStyle");
        Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        Intrinsics.checkNotNullParameter(elevationStyle, "elevationStyle");
        return OneTapStyle.INSTANCE.secondarySystem(context, cornersStyle, sizeStyle, elevationStyle);
    }

    private static final Set<String> getScopes(TypedArray typedArray) {
        String string = typedArray.getString(R$styleable.vkid_OneTap_vkid_onetapScopes);
        if (string == null) {
            string = "";
        }
        List l11 = h.l(string, new char[]{',', ' '}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l11) {
            if (!h.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        return C7714v.Y0(arrayList);
    }

    private static final boolean getSignInToAnotherAccountButtonEnabled(TypedArray typedArray) {
        return typedArray.getBoolean(R$styleable.vkid_OneTap_vkid_onetapShowSignInToAnotherAccount, false);
    }

    @NotNull
    public static final OneTapParsedAttrs parseOneTapAttrs(@NotNull Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.vk.id.group.subscription.xml.R$styleable.vkid_GroupSubscription, 0, 0);
        try {
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.vkid_OneTap, 0, 0);
            try {
                Intrinsics.f(obtainStyledAttributes);
                OneTapStyle invoke = getOneTapStyleConstructor(obtainStyledAttributes, context).invoke(new OneTapButtonCornersStyle.Custom(pixelsToDp(context, getButtonsCornerRadius(obtainStyledAttributes, context))), getOneTapButtonsSize(obtainStyledAttributes), new OneTapButtonElevationStyle.Custom(pixelsToDp(context, getOneTapButtonsElevation(obtainStyledAttributes, context))));
                boolean signInToAnotherAccountButtonEnabled = getSignInToAnotherAccountButtonEnabled(obtainStyledAttributes);
                Set<OneTapOAuth> oAuths = getOAuths(obtainStyledAttributes);
                Set<String> scopes = getScopes(obtainStyledAttributes);
                boolean fastAuthEnabled = getFastAuthEnabled(obtainStyledAttributes);
                OneTapTitleScenario oneTapScenario = getOneTapScenario(obtainStyledAttributes);
                Intrinsics.f(obtainStyledAttributes);
                OneTapParsedAttrs oneTapParsedAttrs = new OneTapParsedAttrs(invoke, signInToAnotherAccountButtonEnabled, oAuths, scopes, fastAuthEnabled, oneTapScenario, GroupSubscriptionAttrsKt.vkidInternalGetGroupId(obtainStyledAttributes), GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionStyleConstructor(obtainStyledAttributes, context).invoke(new GroupSubscriptionSheetCornersStyle.Custom(pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionCornerRadius(obtainStyledAttributes, context))), new GroupSubscriptionButtonsCornersStyle.Custom(pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonCornerRadius(obtainStyledAttributes, context))), GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonSize(obtainStyledAttributes)));
                obtainStyledAttributes.recycle();
                return oneTapParsedAttrs;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private static final float pixelsToDp(Context context, float f7) {
        return f7 / (context.getResources().getDisplayMetrics().densityDpi / 160);
    }
}
