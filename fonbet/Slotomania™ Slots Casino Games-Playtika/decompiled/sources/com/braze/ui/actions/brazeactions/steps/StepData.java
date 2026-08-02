package com.braze.ui.actions.brazeactions.steps;

import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StepData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b#J\t\u0010$\u001a\u00020\u001bHÖ\u0001J\u001c\u0010%\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020\u001b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010*\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010+\u001a\u00020,H\u0016R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/StepData;", "", "srcJson", "Lorg/json/JSONObject;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "(Lorg/json/JSONObject;Lcom/braze/enums/Channel;)V", StepData.ARGS, "", "getArgs", "()Ljava/util/List;", "args$delegate", "Lkotlin/Lazy;", "getChannel", "()Lcom/braze/enums/Channel;", "firstArg", "getFirstArg", "()Ljava/lang/Object;", "firstArg$delegate", "secondArg", "getSecondArg", "secondArg$delegate", "getSrcJson", "()Lorg/json/JSONObject;", "coerceArgToPropertiesOrNull", "Lcom/braze/models/outgoing/BrazeProperties;", FirebaseAnalytics.Param.INDEX, "", "component1", "component2", "copy", "equals", "", "other", "getArg", "getArg$android_sdk_ui_release", "hashCode", "isArgCountInBounds", "fixedArgCount", "rangedArgCount", "Lkotlin/ranges/IntRange;", "isArgOptionalJsonObject", "isArgString", "toString", "", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StepData {
    public static final String ARGS = "args";

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args;
    private final Channel channel;

    /* renamed from: firstArg$delegate, reason: from kotlin metadata */
    private final Lazy firstArg;

    /* renamed from: secondArg$delegate, reason: from kotlin metadata */
    private final Lazy secondArg;
    private final JSONObject srcJson;

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    /* renamed from: component1, reason: from getter */
    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    /* renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    public final StepData copy(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        return new StepData(srcJson, channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return Intrinsics.areEqual(this.srcJson, stepData.srcJson) && this.channel == stepData.channel;
    }

    public int hashCode() {
        return (this.srcJson.hashCode() * 31) + this.channel.hashCode();
    }

    public StepData(JSONObject srcJson, Channel channel) {
        Intrinsics.checkNotNullParameter(srcJson, "srcJson");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.srcJson = srcJson;
        this.channel = channel;
        this.args = LazyKt.lazy(new Function0<List<? extends Object>>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Object> invoke() {
                Iterator it;
                final JSONArray optJSONArray = StepData.this.getSrcJson().optJSONArray(StepData.ARGS);
                if (optJSONArray == null) {
                    it = CollectionsKt.emptyList().iterator();
                } else {
                    it = SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Boolean invoke(int i) {
                            return Boolean.valueOf(optJSONArray.opt(i) instanceof Object);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                            return invoke(num.intValue());
                        }
                    }), new Function1<Integer, Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args$2$invoke$$inlined$iterator$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Object invoke(int i) {
                            Object obj = optJSONArray.get(i);
                            if (obj != null) {
                                return obj;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }
                    }).iterator();
                }
                return SequencesKt.toList(SequencesKt.asSequence(it));
            }
        });
        this.firstArg = LazyKt.lazy(new Function0<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$firstArg$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StepData.this.getArg$android_sdk_ui_release(0);
            }
        });
        this.secondArg = LazyKt.lazy(new Function0<Object>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$secondArg$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StepData.this.getArg$android_sdk_ui_release(1);
            }
        });
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }

    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> getArgs() {
        return (List) this.args.getValue();
    }

    public final Object getFirstArg() {
        return this.firstArg.getValue();
    }

    public final Object getSecondArg() {
        return this.secondArg.getValue();
    }

    public final Object getArg$android_sdk_ui_release(int index) {
        return CollectionsKt.getOrNull(getArgs(), index);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int index) {
        Object orNull = CollectionsKt.getOrNull(getArgs(), index);
        if (orNull != null && (orNull instanceof JSONObject)) {
            return new BrazeProperties((JSONObject) orNull);
        }
        return null;
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i, IntRange intRange, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            intRange = null;
        }
        return stepData.isArgCountInBounds(i, intRange);
    }

    public final boolean isArgCountInBounds(final int fixedArgCount, final IntRange rangedArgCount) {
        if (fixedArgCount != -1 && getArgs().size() != fixedArgCount) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$isArgCountInBounds$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    List args;
                    StringBuilder append = new StringBuilder("Expected ").append(fixedArgCount).append(" arguments. Got: ");
                    args = this.getArgs();
                    return append.append(args).toString();
                }
            }, 3, (Object) null);
            return false;
        }
        if (rangedArgCount == null || rangedArgCount.contains(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$isArgCountInBounds$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                List args;
                StringBuilder append = new StringBuilder("Expected ").append(IntRange.this).append(" arguments. Got: ");
                args = this.getArgs();
                return append.append(args).toString();
            }
        }, 3, (Object) null);
        return false;
    }

    public final boolean isArgString(final int index) {
        if (getArg$android_sdk_ui_release(index) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$isArgString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Argument [" + index + "] is not a String. Source: " + this.getSrcJson();
            }
        }, 3, (Object) null);
        return false;
    }

    public final boolean isArgOptionalJsonObject(final int index) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(index);
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$isArgOptionalJsonObject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Argument [" + index + "] is not a JSONObject. Source: " + this.getSrcJson();
            }
        }, 3, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }
}
