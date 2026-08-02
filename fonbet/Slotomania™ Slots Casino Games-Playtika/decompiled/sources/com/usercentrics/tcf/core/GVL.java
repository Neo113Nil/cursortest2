package com.usercentrics.tcf.core;

import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.v2.tcf.facade.TCFFacade;
import com.usercentrics.tcf.core.errors.GVLError;
import com.usercentrics.tcf.core.model.gvl.DataCategory;
import com.usercentrics.tcf.core.model.gvl.Declarations;
import com.usercentrics.tcf.core.model.gvl.Feature;
import com.usercentrics.tcf.core.model.gvl.Purpose;
import com.usercentrics.tcf.core.model.gvl.Stack;
import com.usercentrics.tcf.core.model.gvl.Vendor;
import com.usercentrics.tcf.core.model.gvl.VendorList;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GVL.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000 K2\u00020\u0001:\u0001KBå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b¢\u0006\u0002\u0010\u0017J$\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010<\u001a\u00020\u0005H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0006\u0010?\u001a\u00020$J\u0006\u0010@\u001a\u00020\u0005J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020;0:H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020;2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000101H\u0002J\u0014\u0010E\u001a\u00020;2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000701J\u0010\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010F\u001a\u00020;2\u0006\u0010I\u001a\u00020JH\u0002R:\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR:\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R:\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR:\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR:\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR:\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010/\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b0\u0010 R.\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000101@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007@BX\u0086\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b6\u0010 R:\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Lcom/usercentrics/tcf/core/GVL;", "", "tcfFacade", "Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacade;", "lastUpdated", "", "gvlSpecificationVersion", "", "_vendorListVersion", "_tcfPolicyVersion", "_vendors", "", "Lcom/usercentrics/tcf/core/model/gvl/Vendor;", "_features", "Lcom/usercentrics/tcf/core/model/gvl/Feature;", "_purposes", "Lcom/usercentrics/tcf/core/model/gvl/Purpose;", "_dataCategories", "Lcom/usercentrics/tcf/core/model/gvl/DataCategory;", "_specialFeatures", "_specialPurposes", "_stacks", "Lcom/usercentrics/tcf/core/model/gvl/Stack;", "(Lcom/usercentrics/sdk/v2/tcf/facade/TCFFacade;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "<set-?>", "dataCategories", "getDataCategories", "()Ljava/util/Map;", X3.a.v, "getFeatures", "fullVendorList", "getGvlSpecificationVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "initialLanguage", "isReady", "", "getLastUpdated", "()Ljava/lang/String;", "purposes", "getPurposes", "specialFeatures", "getSpecialFeatures", "specialPurposes", "getSpecialPurposes", "stacks", "getStacks", "tcfPolicyVersion", "getTcfPolicyVersion", "", "vendorIds", "getVendorIds", "()Ljava/util/List;", "vendorListVersion", "getVendorListVersion", "vendors", "getVendors", "changeLanguage", "Lkotlin/Result;", "", Device.JsonKeys.LANGUAGE, "changeLanguage-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIsReady", "getLanguage", MobileAdsBridgeBase.initializeMethodName, "initialize-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapVendors", "narrowVendorsTo", "populate", "declarations", "Lcom/usercentrics/tcf/core/model/gvl/Declarations;", "vendorList", "Lcom/usercentrics/tcf/core/model/gvl/VendorList;", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class GVL {
    private static final String DEFAULT_LANGUAGE = "EN";
    private Map<String, DataCategory> dataCategories;
    private Map<String, Feature> features;
    private Map<String, Vendor> fullVendorList;
    private Integer gvlSpecificationVersion;
    private String initialLanguage;
    private boolean isReady;
    private String lastUpdated;
    private Map<String, Purpose> purposes;
    private Map<String, Feature> specialFeatures;
    private Map<String, Purpose> specialPurposes;
    private Map<String, Stack> stacks;
    private final TCFFacade tcfFacade;
    private Integer tcfPolicyVersion;
    private List<Integer> vendorIds;
    private Integer vendorListVersion;
    private Map<String, Vendor> vendors;

    public GVL(TCFFacade tcfFacade, String str, Integer num, Integer num2, Integer num3, Map<String, Vendor> map, Map<String, Feature> map2, Map<String, Purpose> map3, Map<String, DataCategory> map4, Map<String, Feature> map5, Map<String, Purpose> map6, Map<String, Stack> map7) {
        Intrinsics.checkNotNullParameter(tcfFacade, "tcfFacade");
        this.tcfFacade = tcfFacade;
        this.lastUpdated = str;
        this.gvlSpecificationVersion = num;
        this.vendors = map;
        this.vendorListVersion = num2;
        this.tcfPolicyVersion = num3;
        this.features = map2;
        this.purposes = map3;
        this.dataCategories = map4;
        this.specialFeatures = map5;
        this.specialPurposes = map6;
        this.stacks = map7;
        this.fullVendorList = MapsKt.emptyMap();
        this.initialLanguage = DEFAULT_LANGUAGE;
    }

    public /* synthetic */ GVL(TCFFacade tCFFacade, String str, Integer num, Integer num2, Integer num3, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tCFFacade, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : map2, (i & 128) != 0 ? null : map3, (i & 256) != 0 ? null : map4, (i & 512) != 0 ? null : map5, (i & 1024) != 0 ? null : map6, (i & 2048) != 0 ? null : map7);
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public final Integer getGvlSpecificationVersion() {
        return this.gvlSpecificationVersion;
    }

    public final Map<String, Vendor> getVendors() {
        return this.vendors;
    }

    public final List<Integer> getVendorIds() {
        return this.vendorIds;
    }

    public final Integer getVendorListVersion() {
        return this.vendorListVersion;
    }

    public final Integer getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final Map<String, Feature> getFeatures() {
        return this.features;
    }

    public final Map<String, Purpose> getPurposes() {
        return this.purposes;
    }

    public final Map<String, DataCategory> getDataCategories() {
        return this.dataCategories;
    }

    public final Map<String, Feature> getSpecialFeatures() {
        return this.specialFeatures;
    }

    public final Map<String, Purpose> getSpecialPurposes() {
        return this.specialPurposes;
    }

    public final Map<String, Stack> getStacks() {
        return this.stacks;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: initialize-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10629initializeIoAF18A(Continuation<? super Result<Unit>> continuation) {
        GVL$initialize$1 gVL$initialize$1;
        int i;
        GVL gvl;
        Object obj;
        VendorList vendorList;
        if (continuation instanceof GVL$initialize$1) {
            gVL$initialize$1 = (GVL$initialize$1) continuation;
            if ((gVL$initialize$1.label & Integer.MIN_VALUE) != 0) {
                gVL$initialize$1.label -= Integer.MIN_VALUE;
                Object obj2 = gVL$initialize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gVL$initialize$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    TCFFacade tCFFacade = this.tcfFacade;
                    gVL$initialize$1.L$0 = this;
                    gVL$initialize$1.label = 1;
                    Object mo10627getVendorListIoAF18A = tCFFacade.mo10627getVendorListIoAF18A(gVL$initialize$1);
                    if (mo10627getVendorListIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gvl = this;
                    obj = mo10627getVendorListIoAF18A;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gvl = (GVL) gVL$initialize$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = ((Result) obj2).getValue();
                }
                vendorList = (VendorList) (!Result.m11186isFailureimpl(obj) ? null : obj);
                if (vendorList != null) {
                    Result.Companion companion = Result.INSTANCE;
                    UsercentricsException m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
                    if (m11183exceptionOrNullimpl == null) {
                        m11183exceptionOrNullimpl = new UsercentricsException("Error when initializing TCF #111", null, 2, null);
                    }
                    return Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl));
                }
                gvl.populate(vendorList);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m11180constructorimpl(Unit.INSTANCE);
            }
        }
        gVL$initialize$1 = new GVL$initialize$1(this, continuation);
        Object obj22 = gVL$initialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gVL$initialize$1.label;
        if (i != 0) {
        }
        vendorList = (VendorList) (!Result.m11186isFailureimpl(obj) ? null : obj);
        if (vendorList != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: Exception -> 0x0091, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x002e, B:12:0x0070, B:14:0x0076, B:17:0x007f, B:20:0x0090, B:27:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #0 {Exception -> 0x0091, blocks: (B:11:0x002e, B:12:0x0070, B:14:0x0076, B:17:0x007f, B:20:0x0090, B:27:0x0060), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: changeLanguage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10628changeLanguagegIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        GVL$changeLanguage$1 gVL$changeLanguage$1;
        int i;
        Object mo10626getDeclarationsgIAlus;
        GVL gvl;
        Throwable m11183exceptionOrNullimpl;
        try {
            if (continuation instanceof GVL$changeLanguage$1) {
                gVL$changeLanguage$1 = (GVL$changeLanguage$1) continuation;
                if ((gVL$changeLanguage$1.label & Integer.MIN_VALUE) != 0) {
                    gVL$changeLanguage$1.label -= Integer.MIN_VALUE;
                    Object obj = gVL$changeLanguage$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = gVL$changeLanguage$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (Intrinsics.areEqual(upperCase, this.initialLanguage)) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m11180constructorimpl(Unit.INSTANCE);
                        }
                        TCFFacade tCFFacade = this.tcfFacade;
                        gVL$changeLanguage$1.L$0 = this;
                        gVL$changeLanguage$1.L$1 = str;
                        gVL$changeLanguage$1.label = 1;
                        mo10626getDeclarationsgIAlus = tCFFacade.mo10626getDeclarationsgIAlus(str, gVL$changeLanguage$1);
                        if (mo10626getDeclarationsgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gvl = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) gVL$changeLanguage$1.L$1;
                        gvl = (GVL) gVL$changeLanguage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mo10626getDeclarationsgIAlus = ((Result) obj).getValue();
                    }
                    m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10626getDeclarationsgIAlus);
                    if (m11183exceptionOrNullimpl == null) {
                        throw m11183exceptionOrNullimpl;
                    }
                    gvl.initialLanguage = str;
                    if (Result.m11186isFailureimpl(mo10626getDeclarationsgIAlus)) {
                        mo10626getDeclarationsgIAlus = null;
                    }
                    Intrinsics.checkNotNull(mo10626getDeclarationsgIAlus);
                    gvl.populate((Declarations) mo10626getDeclarationsgIAlus);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(Unit.INSTANCE);
                }
            }
            if (i != 0) {
            }
            m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10626getDeclarationsgIAlus);
            if (m11183exceptionOrNullimpl == null) {
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new GVLError("Unable to fetch language (" + str + ") declarations: " + e.getMessage(), e)));
        }
        gVL$changeLanguage$1 = new GVL$changeLanguage$1(this, continuation);
        Object obj2 = gVL$changeLanguage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gVL$changeLanguage$1.label;
    }

    /* renamed from: getLanguage, reason: from getter */
    public final String getInitialLanguage() {
        return this.initialLanguage;
    }

    private final void populate(Declarations declarations) {
        this.purposes = declarations.getPurposes();
        this.specialPurposes = declarations.getSpecialPurposes();
        this.features = declarations.getFeatures();
        this.specialFeatures = declarations.getSpecialFeatures();
        this.stacks = declarations.getStacks();
        this.dataCategories = declarations.getDataCategories();
    }

    private final void populate(VendorList vendorList) {
        this.purposes = vendorList.getPurposes();
        this.specialPurposes = vendorList.getSpecialPurposes();
        this.features = vendorList.getFeatures();
        this.specialFeatures = vendorList.getSpecialFeatures();
        this.stacks = vendorList.getStacks();
        this.dataCategories = vendorList.getDataCategories();
        this.gvlSpecificationVersion = vendorList.getGvlSpecificationVersion();
        this.tcfPolicyVersion = vendorList.getTcfPolicyVersion();
        this.vendorListVersion = vendorList.getVendorListVersion();
        this.lastUpdated = vendorList.getLastUpdated();
        this.vendors = vendorList.getVendors();
        Map<String, Vendor> vendors = vendorList.getVendors();
        Intrinsics.checkNotNull(vendors);
        this.fullVendorList = vendors;
        mapVendors(null);
        this.isReady = true;
    }

    private final void mapVendors(List<Integer> vendorIds) {
        if (vendorIds == null) {
            Set<String> keySet = this.fullVendorList.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            vendorIds = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Vendor> map = this.vendors;
        if (vendorIds != null) {
            Iterator<T> it2 = vendorIds.iterator();
            while (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                Vendor vendor = map != null ? map.get(String.valueOf(intValue)) : null;
                if (vendor != null && vendor.getDeletedDate() == null) {
                    linkedHashMap.put(String.valueOf(intValue), vendor);
                }
            }
        }
        this.vendors = linkedHashMap;
        this.vendorIds = vendorIds != null ? CollectionsKt.sorted(vendorIds) : null;
    }

    public final void narrowVendorsTo(List<Integer> vendorIds) {
        Intrinsics.checkNotNullParameter(vendorIds, "vendorIds");
        mapVendors(vendorIds);
    }

    public final boolean getIsReady() {
        return this.isReady;
    }
}
