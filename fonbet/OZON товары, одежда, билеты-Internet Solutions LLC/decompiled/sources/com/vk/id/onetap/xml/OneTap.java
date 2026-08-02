package com.vk.id.onetap.xml;

import Ba.c;
import Bl0.C2652m;
import Ca.B;
import Ca.C2732A;
import Ca.C2733a;
import Ca.C2734b;
import Ca.C2735c;
import Ca.C2736d;
import Ca.C2737e;
import Ca.f;
import Ca.g;
import Ca.i;
import Ca.j;
import Ca.l;
import Ca.m;
import Ca.o;
import Ca.p;
import Ca.q;
import Ca.r;
import Ca.s;
import Ca.v;
import Ca.x;
import Ca.y;
import Ca.z;
import P0.N1;
import Pk0.h;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import com.vk.id.onetap.xml.OneTap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0085\u0001\u0010\u0019\u001a\u00020\r2\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\n2\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\n2 \b\u0002\u0010\u0018\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010*\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R.\u0010\u0018\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R*\u00100\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010)R*\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R(\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R*\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00107R\"\u00108\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R6\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0;2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0;8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010B\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0;\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R*\u0010D\u001a\u00020C2\u0006\u0010!\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010)R.\u0010L\u001a\u0004\u0018\u00010K2\b\u0010!\u001a\u0004\u0018\u00010K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010R\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010K\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010)R\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010W\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010)R.\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010!\u001a\u0004\u0018\u00010X8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010X\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010)R*\u0010a\u001a\u00020`2\u0006\u0010!\u001a\u00020`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\r0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010)¨\u0006h²\u0006\u000e\u0010\"\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010*\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0;8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010D\u001a\u00020C8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010L\u001a\u0004\u0018\u00010K8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010Y\u001a\u0004\u0018\u00010X8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010a\u001a\u00020`8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/onetap/xml/OneTap;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function2;", "Lcom/vk/id/onetap/common/OneTapOAuth;", "Lcom/vk/id/AccessToken;", "", "onAuth", "Lcom/vk/id/VKIDAuthFail;", "onFail", "Lcom/vk/id/auth/AuthCodeData;", "", "onAuthCode", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lcom/vk/id/auth/VKIDAuthUiParams;", "", "onGetParams", "setCallbacks", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Content", "(LS0/k;I)V", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "Lcom/vk/id/onetap/common/OneTapStyle;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "style", "Lcom/vk/id/onetap/common/OneTapStyle;", "getStyle", "()Lcom/vk/id/onetap/common/OneTapStyle;", "setStyle", "(Lcom/vk/id/onetap/common/OneTapStyle;)V", "onStyleChange", "Lkotlin/jvm/functions/Function1;", "isSignInToAnotherAccountEnabled", "Z", "()Z", "setSignInToAnotherAccountEnabled", "(Z)V", "onSignInToAnotherAccountEnabledChange", "authParams", "Lcom/vk/id/auth/VKIDAuthUiParams;", "getAuthParams", "()Lcom/vk/id/auth/VKIDAuthUiParams;", "setAuthParams", "(Lcom/vk/id/auth/VKIDAuthUiParams;)V", "onAuthParamsChange", "Lkotlin/jvm/functions/Function2;", "fastAuthEnabled", "getFastAuthEnabled", "setFastAuthEnabled", "", "oAuths", "Ljava/util/Set;", "getOAuths", "()Ljava/util/Set;", "setOAuths", "(Ljava/util/Set;)V", "onOAuthsChange", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "scenario", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "getScenario", "()Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "setScenario", "(Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;)V", "onScenarioChange", "", "groupId", "Ljava/lang/String;", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "onGroupIdChange", "Lkotlin/Function0;", "onSuccessSubscribingToGroup", "Lkotlin/jvm/functions/Function0;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "onFailSubscribingToGroup", "Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "snackbarHost", "Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "getSnackbarHost", "()Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "setSnackbarHost", "(Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;)V", "onSnackbarHostChange", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "groupSubscriptionStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "getGroupSubscriptionStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "setGroupSubscriptionStyle", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;)V", "onGroupSubscriptionStyleChange", "onetap-xml_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTap extends FrameLayout {

    @NotNull
    private VKIDAuthUiParams authParams;

    @NotNull
    private final ComposeView composeView;
    private boolean fastAuthEnabled;
    private String groupId;

    @NotNull
    private GroupSubscriptionStyle groupSubscriptionStyle;
    private boolean isSignInToAnotherAccountEnabled;

    @NotNull
    private Set<? extends OneTapOAuth> oAuths;

    @NotNull
    private Function2<? super OneTapOAuth, ? super AccessToken, Unit> onAuth;

    @NotNull
    private Function2<? super AuthCodeData, ? super Boolean, Unit> onAuthCode;

    @NotNull
    private Function1<? super VKIDAuthUiParams, Unit> onAuthParamsChange;

    @NotNull
    private Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> onFail;

    @NotNull
    private Function1<? super VKIDGroupSubscriptionFail, Unit> onFailSubscribingToGroup;

    @NotNull
    private Function1<? super d<? super VKIDAuthUiParams>, ? extends Object> onGetParams;

    @NotNull
    private Function1<? super String, Unit> onGroupIdChange;

    @NotNull
    private Function1<? super GroupSubscriptionStyle, Unit> onGroupSubscriptionStyleChange;

    @NotNull
    private Function1<? super Set<? extends OneTapOAuth>, Unit> onOAuthsChange;

    @NotNull
    private Function1<? super OneTapTitleScenario, Unit> onScenarioChange;

    @NotNull
    private Function1<? super Boolean, Unit> onSignInToAnotherAccountEnabledChange;

    @NotNull
    private Function1<? super GroupSubscriptionSnackbarHost, Unit> onSnackbarHostChange;

    @NotNull
    private Function1<? super OneTapStyle, Unit> onStyleChange;

    @NotNull
    private Function0<Unit> onSuccessSubscribingToGroup;

    @NotNull
    private OneTapTitleScenario scenario;
    private GroupSubscriptionSnackbarHost snackbarHost;

    @NotNull
    private OneTapStyle style;

    public /* synthetic */ OneTap(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d5, code lost:
    
        if (r2 == S0.InterfaceC3967k.a.a()) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        N1 snackbarHostState;
        e.a aVar;
        C3969l u11 = interfaceC3967k.u(1138135084);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            u11.o(-630323157);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(this.style, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            Object b11 = h.b(u11, -630321289);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = new f(interfaceC3978p0, 0);
                u11.x(b11);
            }
            u11.k();
            this.onStyleChange = (Function1) b11;
            u11.o(-630319209);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.valueOf(this.isSignInToAnotherAccountEnabled), D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C12;
            Object b12 = h.b(u11, -630314191);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = new o(interfaceC3978p02, 0);
                u11.x(b12);
            }
            u11.k();
            this.onSignInToAnotherAccountEnabledChange = (Function1) b12;
            u11.o(-630312048);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = n1.f(this.authParams, D1.f25195a);
                u11.x(C13);
            }
            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C13;
            Object b13 = h.b(u11, -630309860);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = new p(interfaceC3978p03, 0);
                u11.x(b13);
            }
            u11.k();
            this.onAuthParamsChange = (Function1) b13;
            u11.o(-630308500);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = n1.f(this.oAuths, D1.f25195a);
                u11.x(C14);
            }
            InterfaceC3978p0 interfaceC3978p04 = (InterfaceC3978p0) C14;
            Object b14 = h.b(u11, -630306568);
            if (b14 == InterfaceC3967k.a.a()) {
                b14 = new q(interfaceC3978p04, 0);
                u11.x(b14);
            }
            u11.k();
            this.onOAuthsChange = (Function1) b14;
            u11.o(-630305266);
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = n1.f(this.scenario, D1.f25195a);
                u11.x(C15);
            }
            InterfaceC3978p0 interfaceC3978p05 = (InterfaceC3978p0) C15;
            Object b15 = h.b(u11, -630303206);
            if (b15 == InterfaceC3967k.a.a()) {
                b15 = new r(interfaceC3978p05, 0);
                u11.x(b15);
            }
            u11.k();
            this.onScenarioChange = (Function1) b15;
            u11.o(-630301875);
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = n1.f(this.groupId, D1.f25195a);
                u11.x(C16);
            }
            InterfaceC3978p0 interfaceC3978p06 = (InterfaceC3978p0) C16;
            Object b16 = h.b(u11, -630299879);
            if (b16 == InterfaceC3967k.a.a()) {
                b16 = new C90.d(interfaceC3978p06, 1);
                u11.x(b16);
            }
            u11.k();
            this.onGroupIdChange = (Function1) b16;
            u11.o(-630298414);
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = n1.f(this.snackbarHost, D1.f25195a);
                u11.x(C17);
            }
            InterfaceC3978p0 interfaceC3978p07 = (InterfaceC3978p0) C17;
            Object b17 = h.b(u11, -630296098);
            if (b17 == InterfaceC3967k.a.a()) {
                b17 = new s(interfaceC3978p07, 0);
                u11.x(b17);
            }
            u11.k();
            this.onSnackbarHostChange = (Function1) b17;
            u11.o(-630294148);
            Object C18 = u11.C();
            if (C18 == InterfaceC3967k.a.a()) {
                C18 = n1.f(this.groupSubscriptionStyle, D1.f25195a);
                u11.x(C18);
            }
            final InterfaceC3978p0 interfaceC3978p08 = (InterfaceC3978p0) C18;
            Object b18 = h.b(u11, -630291192);
            if (b18 == InterfaceC3967k.a.a()) {
                b18 = new Function1() { // from class: Ca.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Content$lambda$54$lambda$53;
                        Content$lambda$54$lambda$53 = OneTap.Content$lambda$54$lambda$53(InterfaceC3978p0.this, (GroupSubscriptionStyle) obj);
                        return Content$lambda$54$lambda$53;
                    }
                };
                u11.x(b18);
            }
            u11.k();
            this.onGroupSubscriptionStyleChange = (Function1) b18;
            if (Content$lambda$41(interfaceC3978p06) != null) {
                u11.o(1935902375);
                e.a aVar2 = e.f40358c0;
                OneTapStyle Content$lambda$16 = Content$lambda$16(interfaceC3978p0);
                Set<OneTapOAuth> Content$lambda$31 = Content$lambda$31(interfaceC3978p04);
                boolean Content$lambda$21 = Content$lambda$21(interfaceC3978p02);
                VKIDAuthUiParams Content$lambda$26 = Content$lambda$26(interfaceC3978p03);
                boolean z11 = this.fastAuthEnabled;
                OneTapTitleScenario Content$lambda$36 = Content$lambda$36(interfaceC3978p05);
                String Content$lambda$41 = Content$lambda$41(interfaceC3978p06);
                Intrinsics.f(Content$lambda$41);
                GroupSubscriptionSnackbarHost Content$lambda$46 = Content$lambda$46(interfaceC3978p07);
                if (Content$lambda$46 == null || (snackbarHostState = Content$lambda$46.getSnackbarHostState()) == null) {
                    throw new IllegalStateException("snackbarHostState is not provided");
                }
                GroupSubscriptionStyle Content$lambda$51 = Content$lambda$51(interfaceC3978p08);
                u11.o(-630257190);
                boolean F11 = u11.F(this);
                Object C19 = u11.C();
                if (F11 || C19 == InterfaceC3967k.a.a()) {
                    C19 = new OneTap$Content$9$1(this, null);
                    u11.x(C19);
                }
                Function1 function1 = (Function1) C19;
                u11.k();
                u11.o(-630285507);
                boolean F12 = u11.F(this);
                Object C21 = u11.C();
                if (F12 || C21 == InterfaceC3967k.a.a()) {
                    C21 = new Function2() { // from class: Ca.u
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Content$lambda$57$lambda$56;
                            Content$lambda$57$lambda$56 = OneTap.Content$lambda$57$lambda$56(OneTap.this, (OneTapOAuth) obj, (AccessToken) obj2);
                            return Content$lambda$57$lambda$56;
                        }
                    };
                    u11.x(C21);
                }
                Function2 function2 = (Function2) C21;
                u11.k();
                u11.o(-630282847);
                boolean F13 = u11.F(this);
                Object C22 = u11.C();
                if (F13 || C22 == InterfaceC3967k.a.a()) {
                    C22 = new Function2() { // from class: Ca.w
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Content$lambda$59$lambda$58;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            Content$lambda$59$lambda$58 = OneTap.Content$lambda$59$lambda$58(OneTap.this, (AuthCodeData) obj, booleanValue);
                            return Content$lambda$59$lambda$58;
                        }
                    };
                    u11.x(C22);
                }
                Function2 function22 = (Function2) C22;
                u11.k();
                u11.o(-630280209);
                boolean F14 = u11.F(this);
                Object C23 = u11.C();
                if (F14 || C23 == InterfaceC3967k.a.a()) {
                    C23 = new g(this, 0);
                    u11.x(C23);
                }
                Function2 function23 = (Function2) C23;
                u11.k();
                u11.o(-630268022);
                boolean F15 = u11.F(this);
                Object C24 = u11.C();
                if (F15) {
                    aVar = aVar2;
                } else {
                    aVar = aVar2;
                }
                C24 = new Ca.h(this, 0);
                u11.x(C24);
                Function0 function0 = (Function0) C24;
                u11.k();
                u11.o(-630265527);
                boolean F16 = u11.F(this);
                Object C25 = u11.C();
                if (F16 || C25 == InterfaceC3967k.a.a()) {
                    C25 = new i(this, 0);
                    u11.x(C25);
                }
                u11.k();
                OneTapKt.OneTap(aVar, Content$lambda$16, (Function1<? super d<? super VKIDAuthUiParams>, ? extends Object>) function1, (Function2<? super OneTapOAuth, ? super AccessToken, Unit>) function2, (Function2<? super AuthCodeData, ? super Boolean, Unit>) function22, (Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit>) function23, Content$lambda$31, z11, Content$lambda$21, Content$lambda$26, Content$lambda$36, Content$lambda$41, (Function0<Unit>) function0, (Function1<? super VKIDGroupSubscriptionFail, Unit>) C25, snackbarHostState, Content$lambda$51, u11, (VKIDAuthUiParams.$stable << 27) | 6, 0, 0);
                u11 = u11;
                u11.k();
            } else {
                u11.o(1936929498);
                e.a aVar3 = e.f40358c0;
                OneTapStyle Content$lambda$162 = Content$lambda$16(interfaceC3978p0);
                Set<OneTapOAuth> Content$lambda$312 = Content$lambda$31(interfaceC3978p04);
                boolean Content$lambda$212 = Content$lambda$21(interfaceC3978p02);
                VKIDAuthUiParams Content$lambda$262 = Content$lambda$26(interfaceC3978p03);
                boolean z12 = this.fastAuthEnabled;
                OneTapTitleScenario Content$lambda$362 = Content$lambda$36(interfaceC3978p05);
                u11.o(-630236550);
                boolean F17 = u11.F(this);
                Object C26 = u11.C();
                if (F17 || C26 == InterfaceC3967k.a.a()) {
                    C26 = new OneTap$Content$15$1(this, null);
                    u11.x(C26);
                }
                Function1 function12 = (Function1) C26;
                u11.k();
                u11.o(-630251971);
                boolean F18 = u11.F(this);
                Object C27 = u11.C();
                if (F18 || C27 == InterfaceC3967k.a.a()) {
                    C27 = new j(this, 0);
                    u11.x(C27);
                }
                Function2 function24 = (Function2) C27;
                u11.k();
                u11.o(-630249311);
                boolean F19 = u11.F(this);
                Object C28 = u11.C();
                if (F19 || C28 == InterfaceC3967k.a.a()) {
                    C28 = new Function2() { // from class: Ca.k
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Content$lambda$70$lambda$69;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            Content$lambda$70$lambda$69 = OneTap.Content$lambda$70$lambda$69(OneTap.this, (AuthCodeData) obj, booleanValue);
                            return Content$lambda$70$lambda$69;
                        }
                    };
                    u11.x(C28);
                }
                Function2 function25 = (Function2) C28;
                u11.k();
                u11.o(-630246673);
                boolean F21 = u11.F(this);
                Object C29 = u11.C();
                if (F21 || C29 == InterfaceC3967k.a.a()) {
                    C29 = new m(this, 0);
                    u11.x(C29);
                }
                u11.k();
                OneTapKt.OneTap(aVar3, Content$lambda$162, function12, function24, function25, (Function2) C29, Content$lambda$312, z12, Content$lambda$212, Content$lambda$262, Content$lambda$362, u11, (VKIDAuthUiParams.$stable << 27) | 6, 0, 0);
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: Ca.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Content$lambda$73;
                    int intValue = ((Integer) obj2).intValue();
                    Content$lambda$73 = OneTap.Content$lambda$73(OneTap.this, i11, (InterfaceC3967k) obj, intValue);
                    return Content$lambda$73;
                }
            });
        }
    }

    private static final OneTapStyle Content$lambda$16(InterfaceC3978p0<OneTapStyle> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$19$lambda$18(InterfaceC3978p0 interfaceC3978p0, OneTapStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    private static final boolean Content$lambda$21(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    private static final void Content$lambda$22(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$24$lambda$23(InterfaceC3978p0 interfaceC3978p0, boolean z11) {
        Content$lambda$22(interfaceC3978p0, z11);
        return Unit.f71690a;
    }

    private static final VKIDAuthUiParams Content$lambda$26(InterfaceC3978p0<VKIDAuthUiParams> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$29$lambda$28(InterfaceC3978p0 interfaceC3978p0, VKIDAuthUiParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    private static final Set<OneTapOAuth> Content$lambda$31(InterfaceC3978p0<Set<OneTapOAuth>> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$34$lambda$33(InterfaceC3978p0 interfaceC3978p0, Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    private static final OneTapTitleScenario Content$lambda$36(InterfaceC3978p0<OneTapTitleScenario> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$39$lambda$38(InterfaceC3978p0 interfaceC3978p0, OneTapTitleScenario it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    private static final String Content$lambda$41(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$44$lambda$43(InterfaceC3978p0 interfaceC3978p0, String str) {
        interfaceC3978p0.setValue(str);
        return Unit.f71690a;
    }

    private static final GroupSubscriptionSnackbarHost Content$lambda$46(InterfaceC3978p0<GroupSubscriptionSnackbarHost> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$49$lambda$48(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost) {
        interfaceC3978p0.setValue(groupSubscriptionSnackbarHost);
        return Unit.f71690a;
    }

    private static final GroupSubscriptionStyle Content$lambda$51(InterfaceC3978p0<GroupSubscriptionStyle> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$54$lambda$53(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$57$lambda$56(OneTap oneTap, OneTapOAuth oneTapOAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        oneTap.onAuth.invoke(oneTapOAuth, accessToken);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$59$lambda$58(OneTap oneTap, AuthCodeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        oneTap.onAuthCode.invoke(data, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$61$lambda$60(OneTap oneTap, OneTapOAuth oneTapOAuth, VKIDAuthFail fail) {
        Intrinsics.checkNotNullParameter(fail, "fail");
        oneTap.onFail.invoke(oneTapOAuth, fail);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$63$lambda$62(OneTap oneTap) {
        oneTap.onSuccessSubscribingToGroup.invoke();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$65$lambda$64(OneTap oneTap, VKIDGroupSubscriptionFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oneTap.onFailSubscribingToGroup.invoke(it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$68$lambda$67(OneTap oneTap, OneTapOAuth oneTapOAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        oneTap.onAuth.invoke(oneTapOAuth, accessToken);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$70$lambda$69(OneTap oneTap, AuthCodeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        oneTap.onAuthCode.invoke(data, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$72$lambda$71(OneTap oneTap, OneTapOAuth oneTapOAuth, VKIDAuthFail fail) {
        Intrinsics.checkNotNullParameter(fail, "fail");
        oneTap.onFail.invoke(oneTapOAuth, fail);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$73(OneTap oneTap, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        oneTap.Content(interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$14(OneTapParsedAttrs oneTapParsedAttrs, VKIDAuthUiParams.Builder newBuilder) {
        Intrinsics.checkNotNullParameter(newBuilder, "$this$newBuilder");
        newBuilder.setScopes(oneTapParsedAttrs.getScopes());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuth$lambda$4(OneTapOAuth oneTapOAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "<unused var>");
        throw new IllegalStateException("No onAuth callback for VKID OneTap Button. Set it with setCallbacks method.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuthCode$lambda$5(AuthCodeData authCodeData, boolean z11) {
        Intrinsics.checkNotNullParameter(authCodeData, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuthParamsChange$lambda$3(VKIDAuthUiParams it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFail$lambda$6(OneTapOAuth oneTapOAuth, VKIDAuthFail vKIDAuthFail) {
        Intrinsics.checkNotNullParameter(vKIDAuthFail, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFailSubscribingToGroup$lambda$11(VKIDGroupSubscriptionFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("setGroupSubscriptionCallbacks was not called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGroupIdChange$lambda$9(String str) {
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGroupSubscriptionStyleChange$lambda$13(GroupSubscriptionStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOAuthsChange$lambda$7(Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScenarioChange$lambda$8(OneTapTitleScenario it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSignInToAnotherAccountEnabledChange$lambda$1(boolean z11) {
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSnackbarHostChange$lambda$12(GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost) {
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStyleChange$lambda$0(OneTapStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSuccessSubscribingToGroup$lambda$10() {
        throw new IllegalStateException("setGroupSubscriptionCallbacks was not called");
    }

    public final void setAuthParams(@NotNull VKIDAuthUiParams value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.authParams = value;
        this.onAuthParamsChange.invoke(value);
    }

    public final void setCallbacks(@NotNull Function2<? super OneTapOAuth, ? super AccessToken, Unit> onAuth, @NotNull Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> onFail, @NotNull Function2<? super AuthCodeData, ? super Boolean, Unit> onAuthCode, @NotNull Function1<? super d<? super VKIDAuthUiParams>, ? extends Object> onGetParams) {
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(onAuthCode, "onAuthCode");
        Intrinsics.checkNotNullParameter(onGetParams, "onGetParams");
        this.onAuth = onAuth;
        this.onAuthCode = onAuthCode;
        this.onFail = onFail;
        this.onGetParams = onGetParams;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
        this.onGroupIdChange.invoke(str);
    }

    public final void setGroupSubscriptionStyle(@NotNull GroupSubscriptionStyle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.groupSubscriptionStyle = value;
        this.onGroupSubscriptionStyleChange.invoke(value);
    }

    public final void setOAuths(@NotNull Set<? extends OneTapOAuth> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.oAuths = value;
        this.onOAuthsChange.invoke(value);
    }

    public final void setScenario(@NotNull OneTapTitleScenario value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.scenario = value;
        this.onScenarioChange.invoke(value);
    }

    public final void setSignInToAnotherAccountEnabled(boolean z11) {
        this.isSignInToAnotherAccountEnabled = z11;
        this.onSignInToAnotherAccountEnabledChange.invoke(Boolean.valueOf(z11));
    }

    public final void setStyle(@NotNull OneTapStyle value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        this.onStyleChange.invoke(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTap(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        this.composeView = composeView;
        this.style = new OneTapStyle.Light(null, null, null, 7, null);
        this.onStyleChange = new C2733a(0);
        this.onSignInToAnotherAccountEnabledChange = new Ba.d(1);
        this.onGetParams = new OneTap$onGetParams$1(null);
        this.authParams = new VKIDAuthUiParams.Builder().build();
        this.onAuthParamsChange = new y();
        this.onAuth = new z();
        this.onAuthCode = new C2732A(0);
        this.onFail = new B();
        this.fastAuthEnabled = true;
        this.oAuths = M.f71699a;
        this.onOAuthsChange = new C2734b();
        this.scenario = OneTapTitleScenario.SignIn;
        this.onScenarioChange = new C2735c(0);
        this.onGroupIdChange = new C2736d(0);
        this.onSuccessSubscribingToGroup = new C2737e(0);
        this.onFailSubscribingToGroup = new l();
        this.onSnackbarHostChange = new v();
        this.groupSubscriptionStyle = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
        this.onGroupSubscriptionStyleChange = new x();
        OneTapParsedAttrs parseOneTapAttrs = OneTapAtrrUtilKt.parseOneTapAttrs(context, attributeSet);
        setStyle(parseOneTapAttrs.getStyle());
        setSignInToAnotherAccountEnabled(parseOneTapAttrs.getIsSignInToAnotherAccountEnabled());
        setOAuths(parseOneTapAttrs.getOAuths());
        setAuthParams(this.authParams.newBuilder(new c(parseOneTapAttrs, 1)));
        this.fastAuthEnabled = parseOneTapAttrs.getFastAuthEnabled();
        setScenario(parseOneTapAttrs.getScenario());
        setGroupId(parseOneTapAttrs.getGroupId());
        setGroupSubscriptionStyle(parseOneTapAttrs.getGroupSubscriptionStyle());
        addView(composeView);
        composeView.a(new C4912a(true, 326389705, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.xml.OneTap.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(InterfaceC3967k interfaceC3967k, int i12) {
                if ((i12 & 3) == 2 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                } else {
                    OneTap.this.Content(interfaceC3967k, 0);
                }
            }
        }));
        setClipChildren(false);
        setClipToPadding(false);
    }
}
