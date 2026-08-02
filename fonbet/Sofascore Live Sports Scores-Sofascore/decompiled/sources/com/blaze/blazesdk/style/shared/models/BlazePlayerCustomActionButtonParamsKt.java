package com.blaze.blazesdk.style.shared.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.models.BlazeExtraInfoKeyPreset;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"exists", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "Lcom/blaze/blazesdk/shared/models/BlazeExtraInfoKeyPreset;", "notExists", "equalsTo", U3.i.X, "", "notEqualsTo", "isIn", "values", "", "isNotIn", "greaterThan", "threshold", "", "lessThan", "between", "min", InneractiveMediationNameConsts.MAX, "contains", "substring", "", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazePlayerCustomActionButtonParamsKt {
    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition between(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, double d, double d2) {
        blazeExtraInfoKeyPreset.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyBetween(blazeExtraInfoKeyPreset.getValue(), d, d2);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition contains(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull String str) {
        blazeExtraInfoKeyPreset.getClass();
        str.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyContains(blazeExtraInfoKeyPreset.getValue(), str);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition equalsTo(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull Object obj) {
        blazeExtraInfoKeyPreset.getClass();
        obj.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyEquals(blazeExtraInfoKeyPreset.getValue(), obj);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition exists(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset) {
        blazeExtraInfoKeyPreset.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyExists(blazeExtraInfoKeyPreset.getValue());
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition greaterThan(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, double d) {
        blazeExtraInfoKeyPreset.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyGreaterThan(blazeExtraInfoKeyPreset.getValue(), d);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition isIn(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull List<? extends Object> list) {
        blazeExtraInfoKeyPreset.getClass();
        list.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyIn(blazeExtraInfoKeyPreset.getValue(), list);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition isNotIn(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull List<? extends Object> list) {
        blazeExtraInfoKeyPreset.getClass();
        list.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyNotIn(blazeExtraInfoKeyPreset.getValue(), list);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition lessThan(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, double d) {
        blazeExtraInfoKeyPreset.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyLessThan(blazeExtraInfoKeyPreset.getValue(), d);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition notEqualsTo(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset, @NotNull Object obj) {
        blazeExtraInfoKeyPreset.getClass();
        obj.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyNotEquals(blazeExtraInfoKeyPreset.getValue(), obj);
    }

    @Keep
    @NotNull
    public static final BlazePlayerCustomActionButtonParams.VisibilityCondition notExists(@NotNull BlazeExtraInfoKeyPreset blazeExtraInfoKeyPreset) {
        blazeExtraInfoKeyPreset.getClass();
        return new BlazePlayerCustomActionButtonParams.VisibilityCondition.KeyNotExists(blazeExtraInfoKeyPreset.getValue());
    }
}
