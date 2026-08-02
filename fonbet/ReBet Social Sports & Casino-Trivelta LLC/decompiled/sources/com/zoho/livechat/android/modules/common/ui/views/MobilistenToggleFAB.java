package com.zoho.livechat.android.modules.common.ui.views;

import Ph.AbstractC1459k;
import Ph.P;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.load.engine.q;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.modules.common.ui.views.a;
import com.zoho.livechat.android.ui.customviews.SalesIQFloatingActionButton;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import l.AbstractC5335a;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C6461a;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b=\u0018\u00002\u00020\u0001:\n\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0017\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J)\u0010*\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0004\b*\u0010\u0010J0\u0010/\u001a\u00020\b2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0+¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\b2\u0006\u0010&\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107R*\u0010?\u001a\u0002082\u0006\u0010\u001e\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R.\u0010G\u001a\u0004\u0018\u00010@2\b\u0010\u001e\u001a\u0004\u0018\u00010@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u001b\u0010X\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010P\u001a\u0004\bW\u0010RR\u0018\u0010Z\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010MR\u0014\u0010]\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0014\u0010a\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\\R\u0014\u0010c\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\\R\u0014\u0010e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\\R\u0014\u0010g\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\\R\u0014\u0010i\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\\R\u0014\u0010k\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\\R\u0014\u0010m\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\\R\u0014\u0010o\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\\R\u0014\u0010r\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0014\u0010v\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010qR\u0014\u0010x\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010qR\u0014\u0010z\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010qR\u0011\u0010|\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b{\u0010\\R\u0014\u0010\u007f\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0085\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB;", "Lcom/zoho/livechat/android/modules/common/ui/views/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "X0", "()V", "", "considerAsBaseFabClick", "Lkotlin/Function0;", "onEnd", "J0", "(ZLkotlin/jvm/functions/Function0;)V", "", "model", "", "cacheKey", "Landroid/graphics/drawable/Drawable;", "defaultImage", "U0", "(Ljava/lang/Object;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "Lcom/zoho/livechat/android/ui/customviews/SalesIQFloatingActionButton;", "button", "setAliasBaseFloatingActionButton", "(Lcom/zoho/livechat/android/ui/customviews/SalesIQFloatingActionButton;)V", "", EventKeys.VALUE_KEY, "setBadgeCount", "(I)V", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenTextView;", "view", "setAliasBaseFabBadgeCountView", "(Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenTextView;)V", "Landroid/view/View$OnClickListener;", "listener", "setOnChatClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnCallClickListener", "G0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isExpanded", "setOnFabToggleListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View$OnTouchListener;", "setBaseFabOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View;", "rootView", "W0", "(Landroid/view/View;)V", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$a;", "p2", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$a;", "getFabsVisibility", "()Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$a;", "setFabsVisibility", "(Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$a;)V", "fabsVisibility", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$d;", "x2", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$d;", "getImageModel", "()Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$d;", "setImageModel", "(Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$d;)V", "imageModel", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$b;", "y2", "Lcom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB$b;", "baseFabType", "P4", "Landroid/view/View$OnClickListener;", "defaultOnBaseFABClickListener", "Q4", "Lkotlin/Lazy;", "getDefaultOnChatClickListener", "()Landroid/view/View$OnClickListener;", "defaultOnChatClickListener", "R4", "onChatClickListener", "S4", "getDefaultOnCallClickListener", "defaultOnCallClickListener", "T4", "onCallClickListener", "N0", "()Z", "isCustomerScreen", "M0", "isConversationsEnabled", "P0", "isKnowledgeBaseEnabled", "R0", "isNewCallAllowed", "L0", "isCallsEnabled", "O0", "isFABsAllowedToShow", "S0", "isNewConversationAllowed", "getHasOngoingCall", "hasOngoingCall", "getHasOngoingConversation", "hasOngoingConversation", "T0", "isParallelConversationsEnabled", "getSupportIcon", "()Landroid/graphics/drawable/Drawable;", "supportIcon", "getChatIcon", "chatIcon", "getCallIcon", "callIcon", "getCreateChatIcon", "createChatIcon", "getCloseIcon", "closeIcon", "Q0", "isMultiFab", "getBaseFab", "()Lcom/zoho/livechat/android/ui/customviews/SalesIQFloatingActionButton;", "baseFab", "a", com.google.crypto.tink.integration.android.b.f37029b, "c", W9.d.f13160a, com.bumptech.glide.gifdecoder.e.f29601m, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobilistenToggleFAB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobilistenToggleFAB.kt\ncom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1#2:458\n1863#3,2:459\n*S KotlinDebug\n*F\n+ 1 MobilistenToggleFAB.kt\ncom/zoho/livechat/android/modules/common/ui/views/MobilistenToggleFAB\n*L\n407#1:459,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MobilistenToggleFAB extends com.zoho.livechat.android.modules.common.ui.views.a {

    /* renamed from: P4, reason: collision with root package name and from kotlin metadata */
    public final View.OnClickListener defaultOnBaseFABClickListener;

    /* renamed from: Q4, reason: collision with root package name and from kotlin metadata */
    public final Lazy defaultOnChatClickListener;

    /* renamed from: R4, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener onChatClickListener;

    /* renamed from: S4, reason: collision with root package name and from kotlin metadata */
    public final Lazy defaultOnCallClickListener;

    /* renamed from: T4, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener onCallClickListener;

    /* renamed from: p2, reason: collision with root package name and from kotlin metadata */
    public a fabsVisibility;

    /* renamed from: x2, reason: collision with root package name and from kotlin metadata */
    public d imageModel;

    /* renamed from: y2, reason: collision with root package name and from kotlin metadata */
    public b baseFabType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Chat = new b("Chat", 0);
        public static final b Call = new b("Call", 1);
        public static final b CreateChat = new b("CreateChat", 2);
        public static final b Support = new b("Support", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{Chat, Call, CreateChat, Support};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private b(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Start = new c("Start", 0);
        public static final c End = new c("End", 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{Start, End};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private c(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Object f42720a;

        /* renamed from: b, reason: collision with root package name */
        public final String f42721b;

        /* renamed from: c, reason: collision with root package name */
        public final Drawable f42722c;

        public d(Object obj, String cacheKey, Drawable drawable) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            this.f42720a = obj;
            this.f42721b = cacheKey;
            this.f42722c = drawable;
        }

        public final String a() {
            return this.f42721b;
        }

        public final Drawable b() {
            return this.f42722c;
        }

        public final Object c() {
            return this.f42720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f42720a, dVar.f42720a) && Intrinsics.areEqual(this.f42721b, dVar.f42721b) && Intrinsics.areEqual(this.f42722c, dVar.f42722c);
        }

        public int hashCode() {
            Object obj = this.f42720a;
            int hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + this.f42721b.hashCode()) * 31;
            Drawable drawable = this.f42722c;
            return hashCode + (drawable != null ? drawable.hashCode() : 0);
        }

        public String toString() {
            return "ImageData(model=" + this.f42720a + ", cacheKey=" + this.f42721b + ", defaultImage=" + this.f42722c + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e Top = new e("Top", 0);
        public static final e Bottom = new e("Bottom", 1);

        private static final /* synthetic */ e[] $values() {
            return new e[]{Top, Bottom};
        }

        static {
            e[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private e(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42723n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f42725p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f42726q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f42725p = z10;
            this.f42726q = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MobilistenToggleFAB.this.new g(this.f42725p, this.f42726q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42723n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MobilistenToggleFAB mobilistenToggleFAB = MobilistenToggleFAB.this;
                boolean z10 = this.f42725p;
                Function0 function0 = this.f42726q;
                this.f42723n = 1;
                if (mobilistenToggleFAB.l0(z10, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        public static final void c(MobilistenToggleFAB this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            View.OnClickListener onClickListener = this$0.onCallClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View.OnClickListener invoke() {
            final MobilistenToggleFAB mobilistenToggleFAB = MobilistenToggleFAB.this;
            return new View.OnClickListener() { // from class: ye.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobilistenToggleFAB.h.c(MobilistenToggleFAB.this, view);
                }
            };
        }
    }

    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(MobilistenToggleFAB this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            View.OnClickListener onClickListener = this$0.onChatClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View.OnClickListener invoke() {
            final MobilistenToggleFAB mobilistenToggleFAB = MobilistenToggleFAB.this;
            return new View.OnClickListener() { // from class: ye.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobilistenToggleFAB.i.c(MobilistenToggleFAB.this, view);
                }
            };
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42729n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f42731p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f42732q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f42731p = z10;
            this.f42732q = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MobilistenToggleFAB.this.new j(this.f42731p, this.f42732q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42729n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MobilistenToggleFAB mobilistenToggleFAB = MobilistenToggleFAB.this;
                boolean z10 = this.f42731p;
                Function0 function0 = this.f42732q;
                this.f42729n = 1;
                if (mobilistenToggleFAB.n0(z10, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k implements L4.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Drawable f42733a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MobilistenToggleFAB f42734b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SalesIQFloatingActionButton f42735c;

        public k(Drawable drawable, MobilistenToggleFAB mobilistenToggleFAB, SalesIQFloatingActionButton salesIQFloatingActionButton) {
            this.f42733a = drawable;
            this.f42734b = mobilistenToggleFAB;
            this.f42735c = salesIQFloatingActionButton;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            MobilistenToggleFAB.V0(this.f42734b, this.f42735c, resource);
            return true;
        }

        @Override // L4.g
        public boolean k(q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MobilistenCustomCoreFAB onLoadFailed: ");
            sb2.append(qVar != null ? qVar.getLocalizedMessage() : null);
            LiveChatUtil.log(sb2.toString());
            MobilistenToggleFAB.V0(this.f42734b, this.f42735c, this.f42733a);
            return true;
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f42736d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(View view) {
            super(0);
            this.f42736d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m118invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m118invoke() {
            p.n(this.f42736d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilistenToggleFAB(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fabsVisibility = new a(false, false, false, false, false, false, false, false, false, false, null, null, null, false, 6144, null);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ye.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobilistenToggleFAB.I0(MobilistenToggleFAB.this, view);
            }
        };
        this.defaultOnBaseFABClickListener = onClickListener;
        setOnBaseFabClickListener(onClickListener);
        this.defaultOnChatClickListener = LazyKt.lazy(new i());
        this.defaultOnCallClickListener = LazyKt.lazy(new h());
    }

    public static /* synthetic */ void H0(MobilistenToggleFAB mobilistenToggleFAB, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        mobilistenToggleFAB.G0(z10, function0);
    }

    public static final void I0(MobilistenToggleFAB this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.baseFabType == b.Call) {
            View.OnClickListener onClickListener = this$0.onCallClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        View.OnClickListener onClickListener2 = this$0.onChatClickListener;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
    }

    public static /* synthetic */ void K0(MobilistenToggleFAB mobilistenToggleFAB, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        mobilistenToggleFAB.J0(z10, function0);
    }

    public static final void V0(MobilistenToggleFAB mobilistenToggleFAB, SalesIQFloatingActionButton salesIQFloatingActionButton, Drawable drawable) {
        mobilistenToggleFAB.setBaseFabCustomImageDrawable(drawable);
        salesIQFloatingActionButton.setImageDrawable(null);
        salesIQFloatingActionButton.setForeground(drawable);
    }

    public static final void Y0(MobilistenToggleFAB mobilistenToggleFAB, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
        if (mobilistenToggleFAB.S0() && mobilistenToggleFAB.R0()) {
            mobilistenToggleFAB.setMiniFabOneImageResource(mobilistenToggleFAB.getChatIcon());
            mobilistenToggleFAB.setMiniFabTwoImageResource(mobilistenToggleFAB.getCallIcon());
            mobilistenToggleFAB.setBaseFabImageResource(mobilistenToggleFAB.getCreateChatIcon());
            mobilistenToggleFAB.baseFabType = b.CreateChat;
            booleanRef.element = true;
            return;
        }
        if ((mobilistenToggleFAB.S0() || (mobilistenToggleFAB.getHasOngoingConversation() && (mobilistenToggleFAB.N0() || (mobilistenToggleFAB.T0() && mobilistenToggleFAB.S0())))) && !(mobilistenToggleFAB.getHasOngoingCall() && mobilistenToggleFAB.N0())) {
            mobilistenToggleFAB.setBaseFabImageResource(mobilistenToggleFAB.getChatIcon());
            mobilistenToggleFAB.baseFabType = b.Chat;
            booleanRef2.element = true;
            return;
        }
        if (((mobilistenToggleFAB.N0() && !mobilistenToggleFAB.M0() && !mobilistenToggleFAB.getHasOngoingCall()) || ((!mobilistenToggleFAB.N0() && mobilistenToggleFAB.R0()) || (mobilistenToggleFAB.getHasOngoingCall() && (mobilistenToggleFAB.N0() || (mobilistenToggleFAB.T0() && mobilistenToggleFAB.R0()))))) && (!mobilistenToggleFAB.getHasOngoingConversation() || !mobilistenToggleFAB.N0())) {
            mobilistenToggleFAB.setBaseFabImageResource(mobilistenToggleFAB.getCallIcon());
            mobilistenToggleFAB.baseFabType = b.Call;
            booleanRef2.element = true;
        } else if (mobilistenToggleFAB.S0() || mobilistenToggleFAB.R0()) {
            mobilistenToggleFAB.setBaseFabImageResource(mobilistenToggleFAB.getSupportIcon());
            mobilistenToggleFAB.baseFabType = b.Support;
            booleanRef2.element = true;
        }
    }

    private final Drawable getCallIcon() {
        Drawable a10;
        nd.c g10 = this.fabsVisibility.g();
        if (g10 != null && (a10 = g10.a()) != null) {
            return a10;
        }
        Context context = getContext();
        Drawable m10 = context != null ? AbstractC5892d.m(context, AbstractC5886l.f59893u2) : null;
        if (m10 != null) {
            return m10;
        }
        Drawable f10 = androidx.core.content.res.k.f(getResources(), od.p.f60109i, null);
        Intrinsics.checkNotNull(f10);
        return f10;
    }

    private final Drawable getChatIcon() {
        Drawable b10;
        nd.c g10 = this.fabsVisibility.g();
        if (g10 != null && (b10 = g10.b()) != null) {
            return b10;
        }
        Context context = getContext();
        Drawable m10 = context != null ? AbstractC5892d.m(context, AbstractC5886l.f59897v2) : null;
        if (m10 != null) {
            return m10;
        }
        Drawable f10 = androidx.core.content.res.k.f(getResources(), od.p.f60114j, null);
        Intrinsics.checkNotNull(f10);
        return f10;
    }

    private final Drawable getCloseIcon() {
        Drawable c10;
        nd.c g10 = this.fabsVisibility.g();
        if (g10 != null && (c10 = g10.c()) != null) {
            return c10;
        }
        Context context = getContext();
        Drawable m10 = context != null ? AbstractC5892d.m(context, AbstractC5886l.f59901w2) : null;
        if (m10 != null) {
            return m10;
        }
        Drawable f10 = androidx.core.content.res.k.f(getResources(), od.p.f60119k, null);
        Intrinsics.checkNotNull(f10);
        return f10;
    }

    private final Drawable getCreateChatIcon() {
        Drawable d10;
        nd.c g10 = this.fabsVisibility.g();
        if (g10 != null && (d10 = g10.d()) != null) {
            return d10;
        }
        Context context = getContext();
        Drawable m10 = context != null ? AbstractC5892d.m(context, AbstractC5886l.f59905x2) : null;
        if (m10 != null) {
            return m10;
        }
        Drawable f10 = androidx.core.content.res.k.f(getResources(), od.p.f60124l, null);
        Intrinsics.checkNotNull(f10);
        return f10;
    }

    private final View.OnClickListener getDefaultOnCallClickListener() {
        return (View.OnClickListener) this.defaultOnCallClickListener.getValue();
    }

    private final View.OnClickListener getDefaultOnChatClickListener() {
        return (View.OnClickListener) this.defaultOnChatClickListener.getValue();
    }

    private final boolean getHasOngoingCall() {
        return this.fabsVisibility.d();
    }

    private final boolean getHasOngoingConversation() {
        return this.fabsVisibility.e();
    }

    private final Drawable getSupportIcon() {
        return getChatIcon();
    }

    public final void G0(boolean considerAsBaseFabClick, Function0 onEnd) {
        AbstractC1459k.d(C6461a.f65810a.d(), null, null, new g(considerAsBaseFabClick, onEnd, null), 3, null);
    }

    public final void J0(boolean considerAsBaseFabClick, Function0 onEnd) {
        AbstractC1459k.d(C6461a.f65810a.d(), null, null, new j(considerAsBaseFabClick, onEnd, null), 3, null);
    }

    public final boolean L0() {
        return this.fabsVisibility.i();
    }

    public final boolean M0() {
        return this.fabsVisibility.j();
    }

    public final boolean N0() {
        return this.fabsVisibility.k();
    }

    public final boolean O0() {
        return !this.fabsVisibility.c();
    }

    public final boolean P0() {
        return this.fabsVisibility.l();
    }

    public final boolean Q0() {
        return getFabsState().a();
    }

    public final boolean R0() {
        return this.fabsVisibility.m();
    }

    public final boolean S0() {
        return this.fabsVisibility.n();
    }

    public final boolean T0() {
        return this.fabsVisibility.o();
    }

    public final void U0(Object model, String cacheKey, Drawable defaultImage) {
        ArrayList<SalesIQFloatingActionButton> arrayList = new ArrayList();
        SalesIQFloatingActionButton aliasBaseFab = getAliasBaseFab();
        if (aliasBaseFab != null) {
            arrayList.add(aliasBaseFab);
        }
        arrayList.add(getBaseFab());
        for (SalesIQFloatingActionButton salesIQFloatingActionButton : arrayList) {
            V0(this, salesIQFloatingActionButton, defaultImage);
            if (model != null) {
                wd.d.K(salesIQFloatingActionButton, model, null, false, false, new k(defaultImage, this, salesIQFloatingActionButton), null, null, cacheKey, Float.valueOf((salesIQFloatingActionButton.getCornerSizeInDp() / 2) - 1.5f), false, null, 3072, null);
            }
        }
    }

    public final void W0(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        if (this.baseFabType != b.CreateChat) {
            getBaseFab().performClick();
        } else if (z0()) {
            G0(true, new l(rootView));
        } else {
            p.w(rootView);
            K0(this, true, null, 2, null);
        }
    }

    public final void X0() {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        if (O0()) {
            if (M0() && P0() && L0()) {
                setMiniFabOneImageResource(getChatIcon());
                setMiniFabTwoImageResource(getCallIcon());
                Y0(this, booleanRef, booleanRef2);
            } else if (M0() && P0()) {
                if (N0() || S0()) {
                    setBaseFabImageResource(getChatIcon());
                    this.baseFabType = b.Chat;
                    booleanRef.element = false;
                    booleanRef2.element = true;
                }
            } else if (P0() && L0()) {
                if (S0() && R0()) {
                    booleanRef.element = true;
                    setMiniFabOneImageResource(getChatIcon());
                    setMiniFabTwoImageResource(getCallIcon());
                    setBaseFabImageResource(getCreateChatIcon());
                    this.baseFabType = b.CreateChat;
                } else if (N0()) {
                    setBaseFabImageResource(getSupportIcon());
                    this.baseFabType = b.Support;
                    booleanRef2.element = true;
                } else {
                    booleanRef2.element = true;
                    if (S0()) {
                        setBaseFabImageResource(getChatIcon());
                        this.baseFabType = b.Chat;
                    } else if (R0()) {
                        setBaseFabImageResource(getCallIcon());
                        this.baseFabType = b.Call;
                    } else {
                        booleanRef2.element = false;
                    }
                }
            } else if (M0() && L0()) {
                Y0(this, booleanRef, booleanRef2);
            } else if (M0()) {
                if (N0() || S0()) {
                    setBaseFabImageResource(getChatIcon());
                    this.baseFabType = b.Chat;
                    booleanRef2.element = true;
                }
            } else if (P0()) {
                if (N0()) {
                    setBaseFabImageResource(getSupportIcon());
                    this.baseFabType = b.Support;
                    booleanRef2.element = true;
                } else {
                    booleanRef2.element = true;
                    if (S0()) {
                        setBaseFabImageResource(getChatIcon());
                        this.baseFabType = b.Chat;
                    } else if (R0()) {
                        setBaseFabImageResource(getCallIcon());
                        this.baseFabType = b.Call;
                    } else {
                        booleanRef2.element = false;
                    }
                }
            } else if (L0()) {
                if (!N0()) {
                    setBaseFabImageResource(getCallIcon());
                    this.baseFabType = b.Call;
                    booleanRef2.element = true;
                } else if (S0() && R0()) {
                    booleanRef.element = true;
                    setMiniFabOneImageResource(getChatIcon());
                    setMiniFabTwoImageResource(getCallIcon());
                    setBaseFabImageResource(getCreateChatIcon());
                    this.baseFabType = b.CreateChat;
                } else if (getHasOngoingConversation()) {
                    setBaseFabImageResource(getChatIcon());
                    this.baseFabType = b.Chat;
                    booleanRef2.element = true;
                } else {
                    setBaseFabImageResource(getCallIcon());
                    this.baseFabType = b.Call;
                    booleanRef2.element = true;
                }
            } else if (S0() || getHasOngoingConversation()) {
                setBaseFabImageResource(getChatIcon());
                this.baseFabType = b.Chat;
                booleanRef2.element = true;
            }
        }
        if (booleanRef.element) {
            Drawable e10 = AbstractC5892d.e(getContext(), getCloseIcon(), AbstractC5335a.f55002q);
            if (e10 != null) {
                setBaseFabExpandedStateImageResource(e10);
            }
            Drawable e11 = AbstractC5892d.e(getContext(), getCreateChatIcon(), AbstractC5886l.f59728I2);
            if (e11 != null) {
                setBaseFabCollapsedStateImageResource(e11);
            }
            A0();
        } else if (booleanRef2.element) {
            A0();
            x0();
            y0();
        } else {
            v0();
        }
        setFabsState(new a.C0616a(booleanRef.element));
    }

    @Override // com.zoho.livechat.android.modules.common.ui.views.a
    @NotNull
    public SalesIQFloatingActionButton getBaseFab() {
        return super.getBaseFab();
    }

    @NotNull
    public final a getFabsVisibility() {
        return this.fabsVisibility;
    }

    @Nullable
    public final d getImageModel() {
        return this.imageModel;
    }

    @Override // com.zoho.livechat.android.modules.common.ui.views.a
    public void setAliasBaseFabBadgeCountView(@NotNull MobilistenTextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setAliasBaseFabBadgeCountView(view);
    }

    @Override // com.zoho.livechat.android.modules.common.ui.views.a
    public void setAliasBaseFloatingActionButton(@NotNull SalesIQFloatingActionButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        super.setAliasBaseFloatingActionButton(button);
    }

    @Override // com.zoho.livechat.android.modules.common.ui.views.a
    public void setBadgeCount(int value) {
        super.setBadgeCount(value);
    }

    public final void setBaseFabOnTouchListener(@NotNull View.OnTouchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.setOnBaseFabTouchListener(listener);
    }

    public final void setFabsVisibility(@NotNull a value) {
        a.c cVar;
        a.b bVar;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.fabsVisibility.f() != value.f()) {
            int i10 = f.$EnumSwitchMapping$0[value.f().ordinal()];
            if (i10 == 1) {
                bVar = a.b.Start;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = a.b.End;
            }
            t0(bVar);
        }
        if (this.fabsVisibility.h() != value.h()) {
            int i11 = f.$EnumSwitchMapping$1[value.h().ordinal()];
            if (i11 == 1) {
                cVar = a.c.Top;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = a.c.Bottom;
            }
            u0(cVar);
        }
        this.fabsVisibility = value;
        X0();
    }

    public final void setImageModel(@Nullable d dVar) {
        this.imageModel = dVar;
        if (dVar != null) {
            U0(dVar.c(), dVar.a(), dVar.b());
            return;
        }
        setBaseFabCustomImageDrawable(null);
        SalesIQFloatingActionButton aliasBaseFab = getAliasBaseFab();
        if (aliasBaseFab != null) {
            aliasBaseFab.setForeground(null);
        }
        getBaseFab().setForeground(null);
    }

    public final void setOnCallClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnMiniFabTwoClickListener(getDefaultOnCallClickListener());
        this.onCallClickListener = listener;
    }

    public final void setOnChatClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnMiniFabOneClickListener(getDefaultOnChatClickListener());
        this.onChatClickListener = listener;
    }

    public final void setOnFabToggleListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnFabToggleClickListener(listener);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f42706a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f42707b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f42708c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f42709d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f42710e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f42711f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f42712g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f42713h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f42714i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f42715j;

        /* renamed from: k, reason: collision with root package name */
        public final nd.c f42716k;

        /* renamed from: l, reason: collision with root package name */
        public final c f42717l;

        /* renamed from: m, reason: collision with root package name */
        public final e f42718m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f42719n;

        public a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nd.c cVar, c horizontalSide, e verticalSide, boolean z20) {
            Intrinsics.checkNotNullParameter(horizontalSide, "horizontalSide");
            Intrinsics.checkNotNullParameter(verticalSide, "verticalSide");
            this.f42706a = z10;
            this.f42707b = z11;
            this.f42708c = z12;
            this.f42709d = z13;
            this.f42710e = z14;
            this.f42711f = z15;
            this.f42712g = z16;
            this.f42713h = z17;
            this.f42714i = z18;
            this.f42715j = z19;
            this.f42716k = cVar;
            this.f42717l = horizontalSide;
            this.f42718m = verticalSide;
            this.f42719n = z20;
        }

        public final a a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nd.c cVar, c horizontalSide, e verticalSide, boolean z20) {
            Intrinsics.checkNotNullParameter(horizontalSide, "horizontalSide");
            Intrinsics.checkNotNullParameter(verticalSide, "verticalSide");
            return new a(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, cVar, horizontalSide, verticalSide, z20);
        }

        public final boolean c() {
            return this.f42715j;
        }

        public final boolean d() {
            return this.f42709d;
        }

        public final boolean e() {
            return this.f42712g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42706a == aVar.f42706a && this.f42707b == aVar.f42707b && this.f42708c == aVar.f42708c && this.f42709d == aVar.f42709d && this.f42710e == aVar.f42710e && this.f42711f == aVar.f42711f && this.f42712g == aVar.f42712g && this.f42713h == aVar.f42713h && this.f42714i == aVar.f42714i && this.f42715j == aVar.f42715j && Intrinsics.areEqual(this.f42716k, aVar.f42716k) && this.f42717l == aVar.f42717l && this.f42718m == aVar.f42718m && this.f42719n == aVar.f42719n;
        }

        public final c f() {
            return this.f42717l;
        }

        public final nd.c g() {
            return this.f42716k;
        }

        public final e h() {
            return this.f42718m;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v28 */
        /* JADX WARN: Type inference failed for: r0v29 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f42706a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            ?? r22 = this.f42707b;
            int i11 = r22;
            if (r22 != 0) {
                i11 = 1;
            }
            int i12 = (i10 + i11) * 31;
            ?? r23 = this.f42708c;
            int i13 = r23;
            if (r23 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            ?? r24 = this.f42709d;
            int i15 = r24;
            if (r24 != 0) {
                i15 = 1;
            }
            int i16 = (i14 + i15) * 31;
            ?? r25 = this.f42710e;
            int i17 = r25;
            if (r25 != 0) {
                i17 = 1;
            }
            int i18 = (i16 + i17) * 31;
            ?? r26 = this.f42711f;
            int i19 = r26;
            if (r26 != 0) {
                i19 = 1;
            }
            int i20 = (i18 + i19) * 31;
            ?? r27 = this.f42712g;
            int i21 = r27;
            if (r27 != 0) {
                i21 = 1;
            }
            int i22 = (i20 + i21) * 31;
            ?? r28 = this.f42713h;
            int i23 = r28;
            if (r28 != 0) {
                i23 = 1;
            }
            int i24 = (i22 + i23) * 31;
            ?? r29 = this.f42714i;
            int i25 = r29;
            if (r29 != 0) {
                i25 = 1;
            }
            int i26 = (i24 + i25) * 31;
            ?? r210 = this.f42715j;
            int i27 = r210;
            if (r210 != 0) {
                i27 = 1;
            }
            int i28 = (i26 + i27) * 31;
            nd.c cVar = this.f42716k;
            int hashCode = (((((i28 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f42717l.hashCode()) * 31) + this.f42718m.hashCode()) * 31;
            boolean z11 = this.f42719n;
            return hashCode + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final boolean i() {
            return this.f42707b;
        }

        public final boolean j() {
            return this.f42710e;
        }

        public final boolean k() {
            return this.f42706a;
        }

        public final boolean l() {
            return this.f42713h;
        }

        public final boolean m() {
            return this.f42708c;
        }

        public final boolean n() {
            return this.f42711f;
        }

        public final boolean o() {
            return this.f42714i;
        }

        public String toString() {
            return "FABsVisibility(isCustomerScreen=" + this.f42706a + ", isCallsEnabled=" + this.f42707b + ", isNewCallAllowed=" + this.f42708c + ", hasOngoingCall=" + this.f42709d + ", isConversationEnabled=" + this.f42710e + ", isNewConversationAllowed=" + this.f42711f + ", hasOngoingConversation=" + this.f42712g + ", isKnowledgeBaseEnabled=" + this.f42713h + ", isParallelConversationsEnabled=" + this.f42714i + ", forceHideFABsTemporarily=" + this.f42715j + ", launcherProperties=" + this.f42716k + ", horizontalSide=" + this.f42717l + ", verticalSide=" + this.f42718m + ", isMoving=" + this.f42719n + ')';
        }

        public /* synthetic */ a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nd.c cVar, c cVar2, e eVar, boolean z20, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, cVar, (i10 & 2048) != 0 ? c.End : cVar2, (i10 & 4096) != 0 ? e.Bottom : eVar, (i10 & 8192) != 0 ? false : z20);
        }
    }
}
