package ai.verisoul.sdk.data.local.preferences;

import I0.InterfaceC1344i;
import L0.f;
import L0.i;
import L0.j;
import ai.verisoul.sdk.helpers.session.SessionData;
import android.content.Context;
import androidx.datastore.preferences.a;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lai/verisoul/sdk/data/local/preferences/PreferencesHelperImpl;", "Lai/verisoul/sdk/data/local/preferences/PreferencesHelper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lai/verisoul/sdk/helpers/session/SessionData;", "sessionData", "", "saveSession", "(Lai/verisoul/sdk/helpers/session/SessionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSession", "LI0/i;", "LL0/f;", "dataStore", "LI0/i;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferencesHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesHelperImpl.kt\nai/verisoul/sdk/data/local/preferences/PreferencesHelperImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,76:1\n53#2:77\n55#2:81\n50#3:78\n55#3:80\n107#4:79\n*S KotlinDebug\n*F\n+ 1 PreferencesHelperImpl.kt\nai/verisoul/sdk/data/local/preferences/PreferencesHelperImpl\n*L\n52#1:77\n52#1:81\n52#1:78\n52#1:80\n52#1:79\n*E\n"})
/* loaded from: classes.dex */
public final class PreferencesHelperImpl implements PreferencesHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final f.a SESSION_KEY = i.g("session_data");

    @NotNull
    private static final ReadOnlyProperty<Context, InterfaceC1344i> sessionDataStore$delegate = a.b("vs_session_preferences", null, null, null, 14, null);

    @NotNull
    private final InterfaceC1344i dataStore;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lai/verisoul/sdk/data/local/preferences/PreferencesHelperImpl$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "LI0/i;", "LL0/f;", "sessionDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getSessionDataStore", "(Landroid/content/Context;)LI0/i;", "sessionDataStore", "LL0/f$a;", "", "SESSION_KEY", "LL0/f$a;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(Companion.class, "sessionDataStore", "getSessionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC1344i getSessionDataStore(Context context) {
            return (InterfaceC1344i) PreferencesHelperImpl.sessionDataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }

        private Companion() {
        }
    }

    public PreferencesHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataStore = INSTANCE.getSessionDataStore(context);
    }

    @Override // ai.verisoul.sdk.data.local.preferences.PreferencesHelper
    @Nullable
    public Object clearSession(@NotNull Continuation<? super Unit> continuation) {
        Object a10 = j.a(this.dataStore, new PreferencesHelperImpl$clearSession$2(null), continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // ai.verisoul.sdk.data.local.preferences.PreferencesHelper
    @Nullable
    public Object getSession(@NotNull Continuation<? super SessionData> continuation) {
        final InterfaceC5321f data = this.dataStore.getData();
        return AbstractC5323h.r(new InterfaceC5321f() { // from class: ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$getSession$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", EventKeys.VALUE_KEY, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PreferencesHelperImpl.kt\nai/verisoul/sdk/data/local/preferences/PreferencesHelperImpl\n*L\n1#1,222:1\n54#2:223\n53#3,5:224\n*E\n"})
            /* renamed from: ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$getSession$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC5322g {
                final /* synthetic */ InterfaceC5322g $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$getSession$$inlined$map$1$2", f = "PreferencesHelperImpl.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl$getSession$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC5322g interfaceC5322g) {
                    this.$this_unsafeFlow = interfaceC5322g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    f.a aVar;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = anonymousClass1.label;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC5322g interfaceC5322g = this.$this_unsafeFlow;
                                aVar = PreferencesHelperImpl.SESSION_KEY;
                                String str = (String) ((f) obj).c(aVar);
                                SessionData sessionData = null;
                                if (str != null) {
                                    try {
                                        sessionData = SessionData.INSTANCE.fromJson(str);
                                    } catch (Exception unused) {
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC5322g.emit(sessionData, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = anonymousClass1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5321f
            @Nullable
            public Object collect(@NotNull InterfaceC5322g interfaceC5322g, @NotNull Continuation continuation2) {
                Object collect = InterfaceC5321f.this.collect(new AnonymousClass2(interfaceC5322g), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, continuation);
    }

    @Override // ai.verisoul.sdk.data.local.preferences.PreferencesHelper
    @Nullable
    public Object saveSession(@NotNull SessionData sessionData, @NotNull Continuation<? super Unit> continuation) {
        Object a10 = j.a(this.dataStore, new PreferencesHelperImpl$saveSession$2(sessionData, null), continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
