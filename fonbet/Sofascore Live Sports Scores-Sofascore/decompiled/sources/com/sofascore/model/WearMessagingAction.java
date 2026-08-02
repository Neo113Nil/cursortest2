package com.sofascore.model;

import com.appsflyer.internal.i;
import defpackage.a7a;
import defpackage.duf;
import defpackage.fuf;
import defpackage.g0l;
import defpackage.joa;
import defpackage.lnb;
import defpackage.oea;
import defpackage.qq3;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/sofascore/model/WearMessagingAction;", "", "<init>", "()V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/WearMessagingAction;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "EventData", "RefreshData", "OpenApp", "OpenEventDetails", "OpenEventConfirmation", "OpenAppConfirmation", "Lcom/sofascore/model/WearMessagingAction$EventData;", "Lcom/sofascore/model/WearMessagingAction$OpenApp;", "Lcom/sofascore/model/WearMessagingAction$OpenAppConfirmation;", "Lcom/sofascore/model/WearMessagingAction$OpenEventConfirmation;", "Lcom/sofascore/model/WearMessagingAction$OpenEventDetails;", "Lcom/sofascore/model/WearMessagingAction$RefreshData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WearMessagingAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(0));

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$OpenApp;", "Lcom/sofascore/model/WearMessagingAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenApp extends WearMessagingAction {

        @NotNull
        public static final OpenApp INSTANCE = new OpenApp();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(2));

        private OpenApp() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.WearMessagingAction.OpenApp", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OpenApp);
        }

        public int hashCode() {
            return -784482657;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "OpenApp";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$OpenAppConfirmation;", "Lcom/sofascore/model/WearMessagingAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenAppConfirmation extends WearMessagingAction {

        @NotNull
        public static final OpenAppConfirmation INSTANCE = new OpenAppConfirmation();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(3));

        private OpenAppConfirmation() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.WearMessagingAction.OpenAppConfirmation", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OpenAppConfirmation);
        }

        public int hashCode() {
            return -958683020;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "OpenAppConfirmation";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$OpenEventConfirmation;", "Lcom/sofascore/model/WearMessagingAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenEventConfirmation extends WearMessagingAction {

        @NotNull
        public static final OpenEventConfirmation INSTANCE = new OpenEventConfirmation();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(4));

        private OpenEventConfirmation() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.WearMessagingAction.OpenEventConfirmation", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof OpenEventConfirmation);
        }

        public int hashCode() {
            return 1641729005;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "OpenEventConfirmation";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$RefreshData;", "Lcom/sofascore/model/WearMessagingAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RefreshData extends WearMessagingAction {

        @NotNull
        public static final RefreshData INSTANCE = new RefreshData();
        private static final /* synthetic */ joa $cachedSerializer$delegate = ypa.a(ysa.b, new g0l(5));

        private RefreshData() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new qq3("com.sofascore.model.WearMessagingAction.RefreshData", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof RefreshData);
        }

        public int hashCode() {
            return 1366113357;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @NotNull
        public String toString() {
            return "RefreshData";
        }
    }

    public /* synthetic */ WearMessagingAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        fuf fufVar = duf.a;
        return new zvg("com.sofascore.model.WearMessagingAction", fufVar.getOrCreateKotlinClass(WearMessagingAction.class), new KClass[]{fufVar.getOrCreateKotlinClass(EventData.class), fufVar.getOrCreateKotlinClass(OpenApp.class), fufVar.getOrCreateKotlinClass(OpenAppConfirmation.class), fufVar.getOrCreateKotlinClass(OpenEventConfirmation.class), fufVar.getOrCreateKotlinClass(OpenEventDetails.class), fufVar.getOrCreateKotlinClass(RefreshData.class)}, new KSerializer[]{WearMessagingAction$EventData$$serializer.INSTANCE, new qq3("com.sofascore.model.WearMessagingAction.OpenApp", OpenApp.INSTANCE, new Annotation[0]), new qq3("com.sofascore.model.WearMessagingAction.OpenAppConfirmation", OpenAppConfirmation.INSTANCE, new Annotation[0]), new qq3("com.sofascore.model.WearMessagingAction.OpenEventConfirmation", OpenEventConfirmation.INSTANCE, new Annotation[0]), WearMessagingAction$OpenEventDetails$$serializer.INSTANCE, new qq3("com.sofascore.model.WearMessagingAction.RefreshData", RefreshData.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$EventData;", "Lcom/sofascore/model/WearMessagingAction;", "", "", "eventIds", "<init>", "(Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/WearMessagingAction$EventData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/sofascore/model/WearMessagingAction$EventData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventIds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EventData extends WearMessagingAction {

        @NotNull
        private final List<Integer> eventIds;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final joa[] $childSerializers = {ypa.a(ysa.b, new g0l(1))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EventData(int i, List list, t5h t5hVar) {
            super(i, t5hVar);
            if (1 != (i & 1)) {
                oea.z(i, 1, WearMessagingAction$EventData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.eventIds = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new xg0(a7a.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventData copy$default(EventData eventData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eventData.eventIds;
            }
            return eventData.copy(list);
        }

        public static final /* synthetic */ void write$Self$model_release(EventData self, wf3 output, SerialDescriptor serialDesc) {
            WearMessagingAction.write$Self(self, output, serialDesc);
            output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.eventIds);
        }

        @NotNull
        public final List<Integer> component1() {
            return this.eventIds;
        }

        @NotNull
        public final EventData copy(@NotNull List<Integer> eventIds) {
            eventIds.getClass();
            return new EventData(eventIds);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EventData) && Intrinsics.c(this.eventIds, ((EventData) other).eventIds);
        }

        @NotNull
        public final List<Integer> getEventIds() {
            return this.eventIds;
        }

        public int hashCode() {
            return this.eventIds.hashCode();
        }

        @NotNull
        public String toString() {
            return i.i("EventData(eventIds=", ")", this.eventIds);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$EventData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/WearMessagingAction$EventData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return WearMessagingAction$EventData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventData(@NotNull List<Integer> list) {
            super(null);
            list.getClass();
            this.eventIds = list;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006$"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$OpenEventDetails;", "Lcom/sofascore/model/WearMessagingAction;", "", "eventId", "<init>", "(I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/WearMessagingAction$OpenEventDetails;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/sofascore/model/WearMessagingAction$OpenEventDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEventId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenEventDetails extends WearMessagingAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int eventId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OpenEventDetails(int i, int i2, t5h t5hVar) {
            super(i, t5hVar);
            if (1 != (i & 1)) {
                oea.z(i, 1, WearMessagingAction$OpenEventDetails$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.eventId = i2;
        }

        public static /* synthetic */ OpenEventDetails copy$default(OpenEventDetails openEventDetails, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = openEventDetails.eventId;
            }
            return openEventDetails.copy(i);
        }

        public static final /* synthetic */ void write$Self$model_release(OpenEventDetails self, wf3 output, SerialDescriptor serialDesc) {
            WearMessagingAction.write$Self(self, output, serialDesc);
            output.u(0, self.eventId, serialDesc);
        }

        /* renamed from: component1, reason: from getter */
        public final int getEventId() {
            return this.eventId;
        }

        @NotNull
        public final OpenEventDetails copy(int eventId) {
            return new OpenEventDetails(eventId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenEventDetails) && this.eventId == ((OpenEventDetails) other).eventId;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventId);
        }

        @NotNull
        public String toString() {
            return lnb.k(this.eventId, "OpenEventDetails(eventId=", ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$OpenEventDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/WearMessagingAction$OpenEventDetails;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return WearMessagingAction$OpenEventDetails$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public OpenEventDetails(int i) {
            super(null);
            this.eventId = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/WearMessagingAction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/WearMessagingAction;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) WearMessagingAction.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private WearMessagingAction() {
    }

    public /* synthetic */ WearMessagingAction(int i, t5h t5hVar) {
    }

    public static final /* synthetic */ void write$Self(WearMessagingAction self, wf3 output, SerialDescriptor serialDesc) {
    }
}
