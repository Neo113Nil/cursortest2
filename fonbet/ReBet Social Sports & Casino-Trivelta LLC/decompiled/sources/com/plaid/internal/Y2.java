package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import com.plaid.internal.AbstractC3654i4;
import com.plaid.internal.C3556a6;
import com.plaid.internal.D6;
import com.plaid.internal.I2;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.r8;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLinkStateReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateReducer.kt\ncom/plaid/internal/workflow/LinkStateReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,537:1\n1855#2,2:538\n1855#2,2:540\n1549#2:542\n1620#2,3:543\n*S KotlinDebug\n*F\n+ 1 LinkStateReducer.kt\ncom/plaid/internal/workflow/LinkStateReducer\n*L\n156#1:538,2\n490#1:540,2\n500#1:542\n500#1:543,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final i8 f39785a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final L4 f39786b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C3787x3 f39787c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final F3 f39788d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final n8 f39789e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final y8 f39790f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final H6 f39791g;

    @Inject
    public Y2(@NotNull i8 api, @NotNull L4 paneStore, @NotNull C3787x3 linkWorkflowAnalytics, @NotNull F3 localErrorFactory, @NotNull n8 requestFactory, @NotNull y8 writeOAuthRedirectUri, @NotNull H6 remoteLogController) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        Intrinsics.checkNotNullParameter(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        Intrinsics.checkNotNullParameter(localErrorFactory, "localErrorFactory");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(remoteLogController, "remoteLogController");
        this.f39785a = api;
        this.f39786b = paneStore;
        this.f39787c = linkWorkflowAnalytics;
        this.f39788d = localErrorFactory;
        this.f39789e = requestFactory;
        this.f39790f = writeOAuthRedirectUri;
        this.f39791g = remoteLogController;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull N2 n22, boolean z10, @NotNull ContinuationImpl continuationImpl) {
        X2 x22;
        int i10;
        Y2 y22;
        Y2 y23;
        Y2 y24;
        Object a10;
        Object a11;
        if (continuationImpl instanceof X2) {
            x22 = (X2) continuationImpl;
            int i11 = x22.f39769f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x22.f39769f = i11 - Integer.MIN_VALUE;
                X2 x23 = x22;
                Object obj = x23.f39767d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = x23.f39769f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (n22 instanceof N2.a) {
                        y8 y8Var = this.f39790f;
                        x23.f39764a = this;
                        x23.f39765b = n22;
                        x23.f39769f = 1;
                        if (y8Var.a(x23) != coroutine_suspended) {
                            y24 = this;
                            y24.f39787c.b();
                            N2.a aVar = (N2.a) n22;
                            Workflow$LinkWorkflowStartRequest a12 = y24.f39789e.a(aVar);
                            y24.f39791g.a(aVar.i().a(), aVar.i().b());
                            String h10 = n22.h();
                            String g10 = n22.g();
                            x23.f39764a = null;
                            x23.f39765b = null;
                            x23.f39769f = 2;
                            a10 = y24.a(a12, h10, g10, "", x23);
                            if (a10 == coroutine_suspended) {
                            }
                        }
                    } else if (n22 instanceof N2.b) {
                        y8 y8Var2 = this.f39790f;
                        x23.f39764a = this;
                        x23.f39765b = n22;
                        x23.f39766c = z10;
                        x23.f39769f = 3;
                        if (y8Var2.a(x23) != coroutine_suspended) {
                            y23 = this;
                            y23.f39787c.b();
                            N2.b bVar = (N2.b) n22;
                            Workflow$LinkWorkflowStartRequest a13 = y23.f39789e.a(bVar, z10);
                            y23.f39791g.a(n22.g(), bVar.i().getToken());
                            String h11 = n22.h();
                            String g11 = n22.g();
                            String a14 = ((N2.b) n22).a();
                            x23.f39764a = null;
                            x23.f39765b = null;
                            x23.f39769f = 4;
                            a11 = y23.a(a13, h11, g11, a14, x23);
                            if (a11 == coroutine_suspended) {
                            }
                        }
                    } else {
                        if (!(n22 instanceof N2.l)) {
                            if (n22 instanceof N2.i) {
                                return n22;
                            }
                            if (n22 instanceof N2.j) {
                                return this.f39788d.a();
                            }
                            if (n22 instanceof N2.k) {
                                return n22;
                            }
                            return a(O2.a(n22), n22.h(), new Throwable("Should not call workflow.start with state: " + n22), "", CollectionsKt.emptyList());
                        }
                        L4 l42 = this.f39786b;
                        r8 f10 = n22.f();
                        x23.f39764a = this;
                        x23.f39765b = n22;
                        x23.f39769f = 5;
                        obj = l42.a(f10, x23);
                        if (obj != coroutine_suspended) {
                            y22 = this;
                            if (((Pane$PaneRendering) obj) != null) {
                            }
                        }
                    }
                } else if (i10 == 1) {
                    n22 = x23.f39765b;
                    Y2 y25 = x23.f39764a;
                    ResultKt.throwOnFailure(obj);
                    y24 = y25;
                    y24.f39787c.b();
                    N2.a aVar2 = (N2.a) n22;
                    Workflow$LinkWorkflowStartRequest a122 = y24.f39789e.a(aVar2);
                    y24.f39791g.a(aVar2.i().a(), aVar2.i().b());
                    String h102 = n22.h();
                    String g102 = n22.g();
                    x23.f39764a = null;
                    x23.f39765b = null;
                    x23.f39769f = 2;
                    a10 = y24.a(a122, h102, g102, "", x23);
                    if (a10 == coroutine_suspended) {
                        return a10;
                    }
                } else {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i10 != 3) {
                        if (i10 == 4) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n22 = x23.f39765b;
                        Y2 y26 = x23.f39764a;
                        ResultKt.throwOnFailure(obj);
                        y22 = y26;
                        return ((Pane$PaneRendering) obj) != null ? y22.a(((N2.l) n22).c(), n22.h(), new Throwable("Current pane is null"), ((N2.l) n22).b(), CollectionsKt.emptyList()) : n22;
                    }
                    z10 = x23.f39766c;
                    n22 = x23.f39765b;
                    y23 = x23.f39764a;
                    ResultKt.throwOnFailure(obj);
                    y23.f39787c.b();
                    N2.b bVar2 = (N2.b) n22;
                    Workflow$LinkWorkflowStartRequest a132 = y23.f39789e.a(bVar2, z10);
                    y23.f39791g.a(n22.g(), bVar2.i().getToken());
                    String h112 = n22.h();
                    String g112 = n22.g();
                    String a142 = ((N2.b) n22).a();
                    x23.f39764a = null;
                    x23.f39765b = null;
                    x23.f39769f = 4;
                    a11 = y23.a(a132, h112, g112, a142, x23);
                    if (a11 == coroutine_suspended) {
                        return a11;
                    }
                }
                return coroutine_suspended;
            }
        }
        x22 = new X2(this, continuationImpl);
        X2 x232 = x22;
        Object obj2 = x232.f39767d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = x232.f39769f;
        if (i10 != 0) {
        }
        return coroutine_suspended2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0120, code lost:
    
        if (r2 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.plaid.internal.N2] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.plaid.internal.N2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0120 -> B:18:0x0050). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull N2 n22, @NotNull ContinuationImpl continuationImpl) {
        V2 v22;
        int i10;
        r8 e10;
        Object a10;
        Y2 y22;
        N2 n23;
        Pane$PaneRendering pane$PaneRendering;
        List mutableList;
        r8 r8Var;
        Y2 y23;
        N2 n24;
        Pane$Navigation navigation;
        ?? r12 = n22;
        if (continuationImpl instanceof V2) {
            v22 = (V2) continuationImpl;
            int i11 = v22.f39711h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v22.f39711h = i11 - Integer.MIN_VALUE;
                Object obj = v22.f39709f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = v22.f39711h;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (r12 instanceof N2.i) {
                        return a((N2.i) r12);
                    }
                    if (!(r12 instanceof N2.f)) {
                        String c10 = r12 instanceof N2.h ? ((N2.h) r12).c() : null;
                        return new N2.e(r12.h(), new LinkExit(null, new LinkExitMetadata(LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE, null, r12.g(), c10, L2.a(r12.g(), c10 != null ? c10 : ""))));
                    }
                    e10 = ((N2.f) r12).e();
                    L4 l42 = this.f39786b;
                    v22.f39704a = this;
                    v22.f39705b = r12;
                    v22.f39706c = e10;
                    v22.f39711h = 1;
                    a10 = l42.a(e10, v22);
                    if (a10 != coroutine_suspended) {
                        y22 = this;
                        n23 = r12;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    r8 r8Var2 = v22.f39708e;
                    mutableList = v22.f39707d;
                    r8Var = v22.f39706c;
                    N2 n25 = v22.f39705b;
                    Y2 y24 = v22.f39704a;
                    ResultKt.throwOnFailure(obj);
                    N2.h hVar = n25;
                    Y2 y25 = y24;
                    List list = mutableList;
                    Pane$PaneRendering pane$PaneRendering2 = (Pane$PaneRendering) obj;
                    if (pane$PaneRendering2 != null) {
                        Pane$Navigation navigation2 = pane$PaneRendering2.getNavigation();
                        com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 backStackBehavior = navigation2 != null ? navigation2.getBackStackBehavior() : null;
                        if (backStackBehavior == null) {
                            backStackBehavior = com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_UNKNOWN;
                        }
                        if (backStackBehavior == com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.BACK_STACK_BEHAVIOR_PERSISTENT) {
                            y25.f39787c.a(r8Var, r8Var2);
                            return new N2.l(hVar.g(), hVar.h(), hVar.b(), hVar instanceof N2.g ? ((N2.g) hVar).a() : "", r8Var2, CollectionsKt.emptyList(), list, hVar instanceof N2.h ? hVar.c() : "");
                        }
                    } else {
                        C3556a6.a.e(C3556a6.f39823a, "Could not find pane for workflowId: " + r8Var2);
                    }
                    mutableList = list;
                    n24 = hVar;
                    y23 = y25;
                    if (mutableList.isEmpty()) {
                        y23.f39787c.a(r8Var, (r8) null);
                        v22.f39704a = null;
                        v22.f39705b = null;
                        v22.f39706c = null;
                        v22.f39707d = null;
                        v22.f39708e = null;
                        v22.f39711h = 4;
                        Object a11 = y23.a(n24, v22);
                        if (a11 != coroutine_suspended) {
                            return a11;
                        }
                    } else {
                        r8Var2 = (r8) mutableList.remove(mutableList.size() - 1);
                        L4 l43 = y23.f39786b;
                        v22.f39704a = y23;
                        v22.f39705b = n24;
                        v22.f39706c = r8Var;
                        v22.f39707d = mutableList;
                        v22.f39708e = r8Var2;
                        v22.f39711h = 3;
                        obj = l43.a(r8Var2, v22);
                        hVar = n24;
                        y25 = y23;
                    }
                }
                r8 r8Var3 = v22.f39706c;
                N2 n26 = v22.f39705b;
                Y2 y26 = v22.f39704a;
                ResultKt.throwOnFailure(obj);
                e10 = r8Var3;
                n23 = n26;
                a10 = obj;
                y22 = y26;
                pane$PaneRendering = (Pane$PaneRendering) a10;
                if (pane$PaneRendering != null || (navigation = pane$PaneRendering.getNavigation()) == null || navigation.getBackVisible()) {
                    mutableList = CollectionsKt.toMutableList((Collection) ((N2.f) n23).d());
                    r8Var = e10;
                    y23 = y22;
                    n24 = n23;
                    if (mutableList.isEmpty()) {
                    }
                }
                y22.f39787c.a(e10, (r8) null);
                v22.f39704a = null;
                v22.f39705b = null;
                v22.f39706c = null;
                v22.f39711h = 2;
                Object a12 = y22.a(n23, v22);
                return a12 == coroutine_suspended ? coroutine_suspended : a12;
            }
        }
        v22 = new V2(this, continuationImpl);
        Object obj2 = v22.f39709f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = v22.f39711h;
        if (i10 != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) a10;
        if (pane$PaneRendering != null) {
        }
        mutableList = CollectionsKt.toMutableList((Collection) ((N2.f) n23).d());
        r8Var = e10;
        y23 = y22;
        n24 = n23;
        if (mutableList.isEmpty()) {
        }
    }

    public static N2.e a(N2.i iVar) {
        String errorCode = iVar.f39417f;
        String displayMessage = iVar.f39416e;
        String errorJson = L2.a(errorCode, displayMessage, displayMessage);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(displayMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        LinkError linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), displayMessage, displayMessage, errorJson);
        LinkExitMetadataStatus fromString = LinkExitMetadataStatus.INSTANCE.fromString(iVar.f39417f);
        String str = iVar.f39413b;
        String str2 = iVar.f39419h;
        LinkExitMetadata metadata = new LinkExitMetadata(fromString, null, str, str2, L2.a(str, str2));
        String str3 = iVar.f39413b;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new N2.e(str3, new LinkExit(linkError, metadata));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        P2 p22;
        int i10;
        String workflowId;
        Y2 y22;
        String str4;
        String str5;
        AbstractC3654i4 abstractC3654i4;
        L6 l62;
        List<Common$SDKEvent> onAppearList;
        if (continuationImpl instanceof P2) {
            p22 = (P2) continuationImpl;
            int i11 = p22.f39505g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p22.f39505g = i11 - Integer.MIN_VALUE;
                P2 p23 = p22;
                Object obj = p23.f39503e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = p23.f39505g;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ph.L b10 = C1452g0.b();
                    Q2 q22 = new Q2(this, workflow$LinkWorkflowStartRequest, null);
                    p23.f39499a = this;
                    workflowId = str;
                    p23.f39500b = workflowId;
                    p23.f39501c = str2;
                    p23.f39502d = str3;
                    p23.f39505g = 1;
                    obj = AbstractC1455i.g(b10, q22, p23);
                    if (obj != coroutine_suspended) {
                        y22 = this;
                        str4 = str2;
                        str5 = str3;
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                String str6 = p23.f39502d;
                String str7 = p23.f39501c;
                String str8 = p23.f39500b;
                Y2 y23 = p23.f39499a;
                ResultKt.throwOnFailure(obj);
                str5 = str6;
                str4 = str7;
                workflowId = str8;
                y22 = y23;
                abstractC3654i4 = (AbstractC3654i4) obj;
                if (!abstractC3654i4.a()) {
                    return y22.a(workflowId, abstractC3654i4, "", CollectionsKt.emptyList());
                }
                Intrinsics.checkNotNull(abstractC3654i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
                Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC3654i4.c) abstractC3654i4).f40676a;
                H6 h62 = y22.f39791g;
                Workflow$LinkWorkflowStartResponse.c mobileSdkLogLevel = workflow$LinkWorkflowStartResponse.getMobileSdkLogLevel();
                Intrinsics.checkNotNullExpressionValue(mobileSdkLogLevel, "getMobileSdkLogLevel(...)");
                Intrinsics.checkNotNullParameter(mobileSdkLogLevel, "<this>");
                int i12 = C3574c4.f39848a[mobileSdkLogLevel.ordinal()];
                if (i12 == 1) {
                    l62 = L6.ALL;
                } else if (i12 == 2) {
                    l62 = L6.ERRORS_ONLY;
                } else if (i12 == 3) {
                    l62 = L6.NONE;
                } else if (i12 != 4) {
                    if (i12 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l62 = L6.NONE;
                } else {
                    l62 = L6.NONE;
                }
                h62.a(l62);
                if (workflow$LinkWorkflowStartResponse.hasWebviewFallback()) {
                    String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                    if (url.length() > 0) {
                        String workflowSessionId = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                        Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
                        String requestId = workflow$LinkWorkflowStartResponse.getRequestId();
                        Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
                        Common$WebviewFallback webviewFallback = workflow$LinkWorkflowStartResponse.getWebviewFallback();
                        Intrinsics.checkNotNullExpressionValue(webviewFallback, "getWebviewFallback(...)");
                        p23.f39499a = null;
                        p23.f39500b = null;
                        p23.f39501c = null;
                        p23.f39502d = null;
                        p23.f39505g = 2;
                        N2 a10 = y22.a(str4, workflowSessionId, requestId, str5, webviewFallback);
                        return a10 == coroutine_suspended ? coroutine_suspended : a10;
                    }
                }
                C3787x3 c3787x3 = y22.f39787c;
                c3787x3.getClass();
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                Long l10 = c3787x3.f41188d;
                if (l10 != null) {
                    ClientEventOuterClass$ClientEvent.a a11 = C3787x3.a().a(ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().a(String.valueOf(l10.longValue())));
                    Intrinsics.checkNotNullExpressionValue(a11, "setClientOpenDelay(...)");
                    AbstractC1459k.d(C1483w0.f9135a, null, null, new C3778w3(c3787x3, a11, workflowId, null), 3, null);
                } else {
                    C3556a6.a.e(C3556a6.f39823a, "markOpenStart was not called before tracking open delay");
                }
                Workflow$LinkWorkflowStartResponse.Events events = workflow$LinkWorkflowStartResponse.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.f39294a);
                        }
                    }
                }
                String workflowSessionId2 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                Intrinsics.checkNotNullExpressionValue(workflowSessionId2, "getWorkflowSessionId(...)");
                String continuationToken = workflow$LinkWorkflowStartResponse.getContinuationToken();
                Intrinsics.checkNotNullExpressionValue(continuationToken, "getContinuationToken(...)");
                Pane$PaneRendering nextPane = workflow$LinkWorkflowStartResponse.getNextPane();
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
                Intrinsics.checkNotNullExpressionValue(additionalPanesList, "getAdditionalPanesList(...)");
                String requestId2 = workflow$LinkWorkflowStartResponse.getRequestId();
                Intrinsics.checkNotNullExpressionValue(requestId2, "getRequestId(...)");
                p23.f39499a = null;
                p23.f39500b = null;
                p23.f39501c = null;
                p23.f39502d = null;
                p23.f39505g = 3;
                Object a12 = y22.a(str4, workflowSessionId2, continuationToken, str5, nextPane, additionalPanesList, CollectionsKt.emptyList(), requestId2, p23);
                if (a12 != coroutine_suspended) {
                    return a12;
                }
            }
        }
        p22 = new P2(this, continuationImpl);
        P2 p232 = p22;
        Object obj2 = p232.f39503e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = p232.f39505g;
        if (i10 != 0) {
        }
        abstractC3654i4 = (AbstractC3654i4) obj2;
        if (!abstractC3654i4.a()) {
        }
    }

    public final N2 a(String str, String str2, String str3, String str4, Common$WebviewFallback common$WebviewFallback) {
        A a10;
        EnumC3612d7 enumC3612d7;
        String url = common$WebviewFallback.getUrl();
        Intrinsics.checkNotNull(url);
        if (url.length() == 0) {
            return a(str3, str2, new Throwable("Webview fallback URL was null"), "", CollectionsKt.emptyList());
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS) {
            String webviewFallbackId = common$WebviewFallback.getWebviewFallbackId();
            Intrinsics.checkNotNullExpressionValue(webviewFallbackId, "getWebviewFallbackId(...)");
            String id2 = common$WebviewFallback.getChannelFromWebview().getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            String secret = common$WebviewFallback.getChannelFromWebview().getSecret();
            Intrinsics.checkNotNullExpressionValue(secret, "getSecret(...)");
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId, new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id2, secret), common$WebviewFallback.getShouldEagerStart(), EnumC3612d7.NO_SMS_AUTOFILL, 128);
        }
        if (common$WebviewFallback.getMode() == com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.WEBVIEW_FALLBACK_MODE_IN_PROCESS) {
            if (common$WebviewFallback.hasChannelFromWebview()) {
                String id3 = common$WebviewFallback.getChannelFromWebview().getId();
                Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                String secret2 = common$WebviewFallback.getChannelFromWebview().getSecret();
                Intrinsics.checkNotNullExpressionValue(secret2, "getSecret(...)");
                a10 = new A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id3, secret2);
            } else {
                a10 = null;
            }
            A a11 = a10;
            String webviewFallbackId2 = common$WebviewFallback.getWebviewFallbackId();
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Z webviewFallbackBackground = common$WebviewFallback.getWebviewFallbackBackground();
            Intrinsics.checkNotNullExpressionValue(webviewFallbackBackground, "getWebviewFallbackBackground(...)");
            boolean a12 = K7.a(webviewFallbackBackground);
            boolean shouldEagerStart = common$WebviewFallback.getShouldEagerStart();
            com.plaid.internal.core.protos.link.workflow.primitives.f androidSmsVerificationApiType = common$WebviewFallback.getAndroidSmsVerificationApiType();
            if (androidSmsVerificationApiType == null || (enumC3612d7 = C3613e.a(androidSmsVerificationApiType)) == null) {
                enumC3612d7 = EnumC3612d7.NO_SMS_AUTOFILL;
            }
            EnumC3612d7 enumC3612d72 = enumC3612d7;
            Intrinsics.checkNotNull(webviewFallbackId2);
            return new N2.k(str, str2, str3, str4, url, webviewFallbackId2, a11, a12, false, shouldEagerStart, enumC3612d72);
        }
        Throwable th2 = new Throwable("Unsupported webview fallback mode: " + common$WebviewFallback.getMode());
        C3556a6.a.a(C3556a6.f39823a, th2);
        return a(str3, str2, th2, "", CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull N2 n22, @NotNull List list, @NotNull ContinuationImpl continuationImpl) {
        T2 t22;
        int i10;
        List<r8> list2;
        String str;
        Object a10;
        List<r8> list3;
        Y2 y22;
        N2 n23;
        AbstractC3654i4 abstractC3654i4;
        if (continuationImpl instanceof T2) {
            t22 = (T2) continuationImpl;
            int i11 = t22.f39637g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t22.f39637g = i11 - Integer.MIN_VALUE;
                T2 t23 = t22;
                Object obj = t23.f39635e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = t23.f39637g;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (n22 instanceof N2.i) {
                        return a((N2.i) n22);
                    }
                    boolean z10 = n22 instanceof N2.l;
                    if (z10) {
                        ArrayList arrayList = new ArrayList();
                        N2.l lVar = (N2.l) n22;
                        arrayList.addAll(lVar.f39449h);
                        arrayList.add(lVar.f39447f);
                        list2 = arrayList;
                    } else {
                        list2 = CollectionsKt.emptyList();
                    }
                    str = z10 ? ((N2.l) n22).f39445d : "";
                    Workflow$LinkWorkflowNextRequest.a newBuilder = Workflow$LinkWorkflowNextRequest.newBuilder();
                    newBuilder.b(n22.h());
                    newBuilder.a(str);
                    if (!list.isEmpty()) {
                        newBuilder.a(list);
                    }
                    Workflow$LinkWorkflowNextRequest build = newBuilder.build();
                    Z0 z02 = Z0.f39799a;
                    U2 u22 = new U2(this, build, null);
                    t23.f39631a = this;
                    t23.f39632b = n22;
                    t23.f39633c = list2;
                    t23.f39634d = str;
                    t23.f39637g = 1;
                    a10 = z02.a(u22, t23);
                    if (a10 != coroutine_suspended) {
                        list3 = list2;
                        y22 = this;
                        n23 = n22;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                String str2 = t23.f39634d;
                List<r8> list4 = t23.f39633c;
                N2 n24 = t23.f39632b;
                Y2 y23 = t23.f39631a;
                ResultKt.throwOnFailure(obj);
                list3 = list4;
                a10 = obj;
                str = str2;
                n23 = n24;
                y22 = y23;
                abstractC3654i4 = (AbstractC3654i4) a10;
                if (!abstractC3654i4.a()) {
                    return y22.a(n23.h(), abstractC3654i4, str, list3);
                }
                Intrinsics.checkNotNull(abstractC3654i4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextResponse>");
                Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = (Workflow$LinkWorkflowNextResponse) ((AbstractC3654i4.c) abstractC3654i4).f40676a;
                String g10 = n23.g();
                String workflowSessionId = workflow$LinkWorkflowNextResponse.getWorkflowSessionId();
                Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
                String continuationToken = workflow$LinkWorkflowNextResponse.getContinuationToken();
                Intrinsics.checkNotNullExpressionValue(continuationToken, "getContinuationToken(...)");
                String a11 = n23 instanceof N2.g ? ((N2.g) n23).a() : "";
                Pane$PaneRendering nextPane = workflow$LinkWorkflowNextResponse.getNextPane();
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowNextResponse.getAdditionalPanesList();
                Intrinsics.checkNotNullExpressionValue(additionalPanesList, "getAdditionalPanesList(...)");
                String requestId = workflow$LinkWorkflowNextResponse.getRequestId();
                Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
                t23.f39631a = null;
                t23.f39632b = null;
                t23.f39633c = null;
                t23.f39634d = null;
                t23.f39637g = 2;
                Object a12 = y22.a(g10, workflowSessionId, continuationToken, a11, nextPane, additionalPanesList, list3, requestId, t23);
                return a12 == coroutine_suspended ? coroutine_suspended : a12;
            }
        }
        t22 = new T2(this, continuationImpl);
        T2 t232 = t22;
        Object obj2 = t232.f39635e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = t232.f39637g;
        if (i10 != 0) {
        }
        abstractC3654i4 = (AbstractC3654i4) a10;
        if (!abstractC3654i4.a()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n22, ContinuationImpl continuationImpl) {
        R2 r22;
        int i10;
        Y2 y22;
        List<r8> list;
        String str;
        N2 n23;
        Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof R2) {
            r22 = (R2) continuationImpl;
            int i11 = r22.f39582g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r22.f39582g = i11 - Integer.MIN_VALUE;
                Object obj = r22.f39580e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = r22.f39582g;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    r8 f10 = n22.f();
                    boolean z10 = n22 instanceof N2.f;
                    String b10 = z10 ? ((N2.f) n22).b() : "";
                    List<r8> d10 = z10 ? ((N2.f) n22).d() : CollectionsKt.emptyList();
                    L4 l42 = this.f39786b;
                    r22.f39576a = this;
                    r22.f39577b = n22;
                    r22.f39578c = b10;
                    r22.f39579d = d10;
                    r22.f39582g = 1;
                    obj = l42.a(f10, r22);
                    if (obj != coroutine_suspended) {
                        y22 = this;
                        list = d10;
                        str = b10;
                        n23 = n22;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                List<r8> list2 = r22.f39579d;
                String str2 = r22.f39578c;
                N2 n24 = r22.f39577b;
                Y2 y23 = r22.f39576a;
                ResultKt.throwOnFailure(obj);
                list = list2;
                str = str2;
                n23 = n24;
                y22 = y23;
                pane$PaneRendering = (Pane$PaneRendering) obj;
                if (pane$PaneRendering != null) {
                    return y22.a(O2.a(n23), n23.h(), new Throwable("Current pane is null"), str, list);
                }
                Pane$PaneOutput.a a10 = K4.a(pane$PaneRendering);
                if (a10 == null) {
                    return y22.a(O2.a(n23), n23.h(), new Throwable("Current pane could not be converted to an exit action: " + pane$PaneRendering.getRenderingPropertyKey()), str, list);
                }
                List listOf = CollectionsKt.listOf(a10.build());
                r22.f39576a = null;
                r22.f39577b = null;
                r22.f39578c = null;
                r22.f39579d = null;
                r22.f39582g = 2;
                Object a11 = y22.a(n23, listOf, r22);
                return a11 == coroutine_suspended ? coroutine_suspended : a11;
            }
        }
        r22 = new R2(this, continuationImpl);
        Object obj2 = r22.f39580e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = r22.f39582g;
        if (i10 != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) obj2;
        if (pane$PaneRendering != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull N2 n22, @NotNull D6 d62, @NotNull ContinuationImpl continuationImpl) {
        W2 w22;
        int i10;
        Object a10;
        Y2 y22;
        N2 n23;
        if (continuationImpl instanceof W2) {
            w22 = (W2) continuationImpl;
            int i11 = w22.f39737e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w22.f39737e = i11 - Integer.MIN_VALUE;
                W2 w23 = w22;
                Object obj = w23.f39735c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = w23.f39737e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (d62 instanceof D6.d) {
                        return a(O2.a(n22), n22.h(), ((D6.d) d62).a(), "", CollectionsKt.emptyList());
                    }
                    if (n22 instanceof N2.k) {
                        if (!(d62 instanceof D6.b) && !(d62 instanceof D6.c)) {
                            n8 n8Var = this.f39789e;
                            N2.k kVar = (N2.k) n22;
                            Intrinsics.checkNotNull(d62, "null cannot be cast to non-null type com.plaid.internal.redirect.RedirectState.OAuth");
                            Workflow$LinkWorkflowStartRequest a11 = n8Var.a(kVar, (D6.a) d62);
                            String h10 = n22.h();
                            String g10 = n22.g();
                            String a12 = kVar.a();
                            w23.f39737e = 1;
                            Object a13 = a(a11, h10, g10, a12, w23);
                            if (a13 != coroutine_suspended) {
                                return a13;
                            }
                        } else {
                            return new N2.d(n22.g(), n22.h(), ((N2.k) n22).c(), d62 instanceof D6.c);
                        }
                    } else {
                        r8 e10 = n22 instanceof N2.l ? ((N2.l) n22).e() : null;
                        if (e10 == null) {
                            return a(O2.a(n22), n22.h(), new IllegalStateException("Link does not have a current pane"), "", CollectionsKt.emptyList());
                        }
                        L4 l42 = this.f39786b;
                        w23.f39733a = this;
                        w23.f39734b = n22;
                        w23.f39737e = 2;
                        a10 = l42.a(e10, w23);
                        if (a10 != coroutine_suspended) {
                            y22 = this;
                            n23 = n22;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n23 = w23.f39734b;
                Y2 y23 = w23.f39733a;
                ResultKt.throwOnFailure(obj);
                a10 = obj;
                y22 = y23;
                if (((Pane$PaneRendering) a10) == null) {
                    return n23;
                }
                return y22.a(O2.a(n23), n23.h(), new IllegalStateException("OAuth pane not found: " + n23), "", CollectionsKt.emptyList());
            }
        }
        w22 = new W2(this, continuationImpl);
        W2 w232 = w22;
        Object obj2 = w232.f39735c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = w232.f39737e;
        if (i10 != 0) {
        }
        if (((Pane$PaneRendering) a10) == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122 A[LOOP:1: B:22:0x011c->B:24:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, Pane$PaneRendering pane$PaneRendering, List list, List list2, String str5, ContinuationImpl continuationImpl) {
        S2 s22;
        int i10;
        String str6;
        String str7;
        List list3;
        String str8;
        Pane$PaneRendering pane$PaneRendering2;
        String str9;
        List list4;
        String str10;
        Y2 y22;
        List<Pane$PaneRendering> list5;
        List list6;
        String str11;
        Pane$PaneRendering pane$PaneRendering3;
        String str12;
        String str13;
        String str14;
        Iterator it;
        String str15;
        Y2 y23;
        if (continuationImpl instanceof S2) {
            s22 = (S2) continuationImpl;
            int i11 = s22.f39620m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                s22.f39620m = i11 - Integer.MIN_VALUE;
                Object obj = s22.f39618k;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = s22.f39620m;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (pane$PaneRendering == null) {
                        return a(str5, str2, new Throwable("Next pane was null in start request"), str3, (List<r8>) list2);
                    }
                    L4 l42 = this.f39786b;
                    r8.CREATOR.getClass();
                    r8 a10 = r8.c.a(pane$PaneRendering, str2);
                    s22.f39608a = this;
                    str6 = str;
                    s22.f39609b = str6;
                    s22.f39610c = str2;
                    str7 = str3;
                    s22.f39611d = str7;
                    s22.f39612e = str4;
                    s22.f39613f = pane$PaneRendering;
                    s22.f39614g = list;
                    list3 = list2;
                    s22.f39615h = list3;
                    str8 = str5;
                    s22.f39616i = str8;
                    s22.f39620m = 1;
                    if (l42.a(a10, pane$PaneRendering, s22) != coroutine_suspended) {
                        pane$PaneRendering2 = pane$PaneRendering;
                        str9 = str4;
                        list4 = list;
                        str10 = str2;
                        y22 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = s22.f39617j;
                    str15 = s22.f39616i;
                    list6 = s22.f39615h;
                    list5 = s22.f39614g;
                    pane$PaneRendering3 = s22.f39613f;
                    str14 = s22.f39612e;
                    str13 = s22.f39611d;
                    str12 = s22.f39610c;
                    str11 = s22.f39609b;
                    y23 = s22.f39608a;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        Pane$PaneRendering pane$PaneRendering4 = (Pane$PaneRendering) it.next();
                        L4 l43 = y23.f39786b;
                        r8.CREATOR.getClass();
                        r8 a11 = r8.c.a(pane$PaneRendering4, str12);
                        s22.f39608a = y23;
                        s22.f39609b = str11;
                        s22.f39610c = str12;
                        s22.f39611d = str13;
                        s22.f39612e = str14;
                        s22.f39613f = pane$PaneRendering3;
                        s22.f39614g = list5;
                        s22.f39615h = list6;
                        s22.f39616i = str15;
                        s22.f39617j = it;
                        s22.f39620m = 2;
                        if (l43.a(a11, pane$PaneRendering4, s22) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    r8.CREATOR.getClass();
                    r8 a12 = r8.c.a(pane$PaneRendering3, str12);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (Pane$PaneRendering pane$PaneRendering5 : list5) {
                        r8.CREATOR.getClass();
                        arrayList.add(r8.c.a(pane$PaneRendering5, str12));
                    }
                    return new N2.l(str11, str12, str13, str14, a12, arrayList, list6, str15);
                }
                String str16 = s22.f39616i;
                List list7 = s22.f39615h;
                list4 = s22.f39614g;
                pane$PaneRendering2 = s22.f39613f;
                String str17 = s22.f39612e;
                str7 = s22.f39611d;
                str10 = s22.f39610c;
                String str18 = s22.f39609b;
                Y2 y24 = s22.f39608a;
                ResultKt.throwOnFailure(obj);
                str8 = str16;
                str9 = str17;
                str6 = str18;
                y22 = y24;
                list3 = list7;
                Iterator it2 = list4.iterator();
                Pane$PaneRendering pane$PaneRendering6 = pane$PaneRendering2;
                list5 = list4;
                list6 = list3;
                str11 = str6;
                pane$PaneRendering3 = pane$PaneRendering6;
                str12 = str10;
                str13 = str7;
                str14 = str9;
                it = it2;
                str15 = str8;
                y23 = y22;
                while (it.hasNext()) {
                }
                r8.CREATOR.getClass();
                r8 a122 = r8.c.a(pane$PaneRendering3, str12);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                while (r2.hasNext()) {
                }
                return new N2.l(str11, str12, str13, str14, a122, arrayList2, list6, str15);
            }
        }
        s22 = new S2(this, continuationImpl);
        Object obj2 = s22.f39618k;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = s22.f39620m;
        if (i10 != 0) {
        }
        Iterator it22 = list4.iterator();
        Pane$PaneRendering pane$PaneRendering62 = pane$PaneRendering2;
        list5 = list4;
        list6 = list3;
        str11 = str6;
        pane$PaneRendering3 = pane$PaneRendering62;
        str12 = str10;
        str13 = str7;
        str14 = str9;
        it = it22;
        str15 = str8;
        y23 = y22;
        while (it.hasNext()) {
        }
        r8.CREATOR.getClass();
        r8 a1222 = r8.c.a(pane$PaneRendering3, str12);
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        while (r2.hasNext()) {
        }
        return new N2.l(str11, str12, str13, str14, a1222, arrayList22, list6, str15);
    }

    public final <T> N2.i a(String workflowId, AbstractC3654i4<? extends T, ? extends Object> errorResponse, String continuationToken, List<r8> backstack) {
        String str;
        H3 h32;
        F3 f32 = this.f39788d;
        f32.getClass();
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(backstack, "backstack");
        if (!(errorResponse instanceof AbstractC3654i4.c)) {
            str = "";
            if (errorResponse instanceof AbstractC3654i4.b) {
                h32 = H3.NETWORK_ERROR;
            } else if (errorResponse instanceof AbstractC3654i4.d) {
                h32 = H3.UNKNOWN_ERROR;
            } else if (errorResponse instanceof AbstractC3654i4.a) {
                AbstractC3654i4.a aVar = (AbstractC3654i4.a) errorResponse;
                U u10 = aVar.f40673a;
                str = u10 instanceof com.google.gson.internal.g ? String.valueOf(((Map) u10).get("request_id")) : "";
                if (aVar.f40674b == 440) {
                    h32 = H3.SESSION_EXPIRED;
                } else {
                    h32 = H3.HTTP_ERROR;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            H3 h33 = h32;
            r8.CREATOR.getClass();
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new N2.i(workflowId, new r8(workflowId, "error_pane_id", "local_error_pane"), continuationToken, f32.a(h33), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, str, h33);
        }
        throw new B2("Can't convert success response to local error");
    }

    public final N2.i a(String requestId, String workflowId, Throwable throwable, String continuationToken, List<r8> backstack) {
        C3556a6.a.a(C3556a6.f39823a, throwable);
        F3 f32 = this.f39788d;
        f32.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(backstack, "backstack");
        r8.CREATOR.getClass();
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        r8 r8Var = new r8(workflowId, "error_pane_id", "local_error_pane");
        H3 h32 = H3.UNKNOWN_ERROR;
        return new N2.i(workflowId, r8Var, continuationToken, f32.a(h32), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, requestId, h32);
    }
}
