package com.vk.id.analytics.stat;

import Sc.InterfaceC4008j;
import Sc.s;
import We.InterfaceC4865g;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.stat.StatTracker$trackEvent$1;
import com.vk.id.network.InternalVKIDApiContract;
import fd.q;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.json.JSONArray;
import ve.EnumC10311b;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.analytics.stat.StatTracker$trackEvent$1", f = "StatTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class StatTracker$trackEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $name;
    final /* synthetic */ VKIDAnalytics.EventParam[] $params;
    int label;
    final /* synthetic */ StatTracker this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.analytics.stat.StatTracker$trackEvent$1$1", f = "StatTracker.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.vk.id.analytics.stat.StatTracker$trackEvent$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $accessToken;
        int label;
        final /* synthetic */ StatTracker this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.vk.id.analytics.stat.StatTracker$trackEvent$1$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends C7735q implements q<String, String, String, String, JSONArray, String, InterfaceC4865g> {
            AnonymousClass2(Object obj) {
                super(6, obj, InternalVKIDApiContract.class, "sendStatEvents", "sendStatEvents(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lokhttp3/Call;", 0);
            }

            @Override // fd.q
            public final InterfaceC4865g invoke(String p02, String p12, String p22, String p32, JSONArray p42, String p52) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                Intrinsics.checkNotNullParameter(p22, "p2");
                Intrinsics.checkNotNullParameter(p32, "p3");
                Intrinsics.checkNotNullParameter(p42, "p4");
                Intrinsics.checkNotNullParameter(p52, "p5");
                return ((InternalVKIDApiContract) this.receiver).sendStatEvents(p02, p12, p22, p32, p42, p52);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StatTracker statTracker, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = statTracker;
            this.$accessToken = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC4865g invokeSuspend$lambda$0(StatTracker statTracker, String str, String str2, String str3, String str4, JSONArray jSONArray, String str5) {
            InterfaceC4008j interfaceC4008j;
            interfaceC4008j = statTracker.api;
            return ((InternalVKIDApiContract) interfaceC4008j.getValue()).sendStatEventsAnonymously(str2, str3, str4, jSONArray, str5);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$accessToken, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LinkedBlockingQueue linkedBlockingQueue;
            LinkedBlockingQueue linkedBlockingQueue2;
            InterfaceC4008j interfaceC4008j;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                b.Companion companion = b.INSTANCE;
                long g10 = c.g(1, EnumC10311b.SECONDS);
                this.label = 1;
                if (Y.c(g10, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            StatTracker statTracker = this.this$0;
            linkedBlockingQueue = statTracker.anonymousBatchEvents;
            final StatTracker statTracker2 = this.this$0;
            statTracker.sendEvents("", linkedBlockingQueue, new q() { // from class: com.vk.id.analytics.stat.a
                @Override // fd.q
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    InterfaceC4865g invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = StatTracker$trackEvent$1.AnonymousClass1.invokeSuspend$lambda$0(StatTracker.this, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (JSONArray) obj6, (String) obj7);
                    return invokeSuspend$lambda$0;
                }
            });
            String str = this.$accessToken;
            if (str != null) {
                StatTracker statTracker3 = this.this$0;
                linkedBlockingQueue2 = statTracker3.personalizedBatchEvents;
                interfaceC4008j = this.this$0.api;
                statTracker3.sendEvents(str, linkedBlockingQueue2, new AnonymousClass2(interfaceC4008j.getValue()));
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatTracker$trackEvent$1(String str, VKIDAnalytics.EventParam[] eventParamArr, StatTracker statTracker, String str2, d<? super StatTracker$trackEvent$1> dVar) {
        super(2, dVar);
        this.$name = str;
        this.$params = eventParamArr;
        this.this$0 = statTracker;
        this.$accessToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StatTracker$trackEvent$1(this.$name, this.$params, this.this$0, this.$accessToken, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        EventCounter eventCounter;
        EventCounter eventCounter2;
        EventCounter eventCounter3;
        M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = this.$name;
        VKIDAnalytics.EventParam[] eventParamArr = this.$params;
        eventCounter = this.this$0.eventCounter;
        int eventId = eventCounter.getEventId();
        eventCounter2 = this.this$0.eventCounter;
        StatEventJson statEventJson = new StatEventJson(str, eventParamArr, eventId, eventCounter2.getPrevEventId());
        eventCounter3 = this.this$0.eventCounter;
        eventCounter3.increment();
        (this.$accessToken == null ? this.this$0.anonymousBatchEvents : this.this$0.personalizedBatchEvents).add(statEventJson.getJson());
        m11 = this.this$0.trackerScope;
        C10727i.c(m11, null, null, new AnonymousClass1(this.this$0, this.$accessToken, null), 3);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StatTracker$trackEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
