package com.plaid.internal;

import com.plaid.internal.AbstractC3802z0;
import com.plaid.internal.C3556a6;
import com.plaid.internal.I2;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkException;
import com.plaid.link.exception.LinkInvalidResultException;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
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

@SourceDebugExtension({"SMAP\nDestinationFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationFactory.kt\ncom/plaid/internal/workflow/DestinationFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1855#2,2:197\n1549#2:199\n1620#2,3:200\n*S KotlinDebug\n*F\n+ 1 DestinationFactory.kt\ncom/plaid/internal/workflow/DestinationFactory\n*L\n110#1:197,2\n181#1:199\n181#1:200,3\n*E\n"})
/* loaded from: classes3.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3799y6 f39142a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39143a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39144b;

        static {
            int[] iArr = new int[Pane$PaneRendering.b.values().length];
            try {
                iArr[Pane$PaneRendering.b.SINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pane$PaneRendering.b.HEADLESS_O_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39143a = iArr;
            int[] iArr2 = new int[SdkResult$SDKResult.b.values().length];
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f39144b = iArr2;
        }
    }

    @Inject
    public A0(@NotNull InterfaceC3799y6 paneStore) {
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        this.f39142a = paneStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull N2 n22, @NotNull ContinuationImpl continuationImpl) {
        B0 b02;
        int i10;
        r8 f10;
        Object a10;
        A0 a02;
        Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof B0) {
            b02 = (B0) continuationImpl;
            int i11 = b02.f39172f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b02.f39172f = i11 - Integer.MIN_VALUE;
                Object obj = b02.f39170d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = b02.f39172f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (n22 instanceof N2.e) {
                        return new AbstractC3802z0.d(((N2.e) n22).i());
                    }
                    if (n22 instanceof N2.i) {
                        return new AbstractC3802z0.c((N2.i) n22);
                    }
                    if (n22 instanceof N2.k) {
                        N2.k kVar = (N2.k) n22;
                        return kVar.m() ? kVar.i() == null ? a(new D2("Can't open out of process webview without channel info"), n22.h()) : new AbstractC3802z0.h(kVar.k(), kVar.l(), kVar.i()) : new AbstractC3802z0.k(kVar.k(), kVar.l(), kVar.j());
                    }
                    if (n22 instanceof N2.d) {
                        return new AbstractC3802z0.b(((N2.d) n22).i());
                    }
                    f10 = n22.f();
                    InterfaceC3799y6 interfaceC3799y6 = this.f39142a;
                    b02.f39167a = this;
                    b02.f39168b = n22;
                    b02.f39169c = f10;
                    b02.f39172f = 1;
                    a10 = interfaceC3799y6.a(f10, b02);
                    if (a10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    a02 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r8 r8Var = b02.f39169c;
                    N2 n23 = b02.f39168b;
                    A0 a03 = b02.f39167a;
                    ResultKt.throwOnFailure(obj);
                    f10 = r8Var;
                    n22 = n23;
                    a02 = a03;
                    a10 = obj;
                }
                pane$PaneRendering = (Pane$PaneRendering) a10;
                if (pane$PaneRendering != null) {
                    C2 c22 = new C2("No pane in response");
                    String h10 = n22.h();
                    a02.getClass();
                    return a(c22, h10);
                }
                Pane$PaneRendering.b renderingCase = pane$PaneRendering.getRenderingCase();
                int i12 = renderingCase == null ? -1 : a.f39143a[renderingCase.ordinal()];
                if (i12 == -1) {
                    D2 d22 = new D2("Can't render pane because rendering is null");
                    String h11 = n22.h();
                    a02.getClass();
                    return a(d22, h11);
                }
                if (i12 == 1) {
                    a02.getClass();
                    return a(pane$PaneRendering, n22);
                }
                if (i12 == 2) {
                    return new AbstractC3802z0.i.a(f10);
                }
                String str = "Native panes are no longer supported: " + pane$PaneRendering.getRenderingCase();
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                C2 c23 = new C2(str);
                String h12 = n22.h();
                a02.getClass();
                return a(c23, h12);
            }
        }
        b02 = new B0(this, continuationImpl);
        Object obj2 = b02.f39170d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = b02.f39172f;
        if (i10 != 0) {
        }
        pane$PaneRendering = (Pane$PaneRendering) a10;
        if (pane$PaneRendering != null) {
        }
    }

    public static AbstractC3802z0 a(Pane$PaneRendering pane$PaneRendering, N2 n22) {
        List<Common$SDKEvent> onAppearList;
        if (pane$PaneRendering.hasSink()) {
            SinkPaneOuterClass$SinkPane.Rendering sink = pane$PaneRendering.getSink();
            if (sink.hasResult()) {
                SdkResult$SDKResult result = sink.getResult();
                SinkPaneOuterClass$SinkPane.Rendering.Events events = sink.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.f39294a);
                        }
                    }
                }
                try {
                    SdkResult$SDKResult.b callback = result.getCallback();
                    int i10 = callback == null ? -1 : a.f39144b[callback.ordinal()];
                    if (i10 == 1) {
                        Intrinsics.checkNotNull(result);
                        String metadataJson = sink.getMetadataJson();
                        Intrinsics.checkNotNullExpressionValue(metadataJson, "getMetadataJson(...)");
                        return new AbstractC3802z0.j(a(result, metadataJson));
                    }
                    if (i10 == 2) {
                        Intrinsics.checkNotNull(result);
                        String a10 = O2.a(n22);
                        String errorJson = sink.getErrorJson();
                        Intrinsics.checkNotNullExpressionValue(errorJson, "getErrorJson(...)");
                        String metadataJson2 = sink.getMetadataJson();
                        Intrinsics.checkNotNullExpressionValue(metadataJson2, "getMetadataJson(...)");
                        return new AbstractC3802z0.d(a(result, a10, errorJson, metadataJson2));
                    }
                    throw new LinkInvalidResultException("Result type not supported by client: " + result.getCallback());
                } catch (Throwable th2) {
                    return a(th2, n22.h());
                }
            }
            pane$PaneRendering.getId();
            pane$PaneRendering.getPaneNodeId();
            return a(new C2("Tried to convert sink pane but result was null"), n22.h());
        }
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        return a(new C2("Tried to get sink but didn't exist"), n22.h());
    }

    @NotNull
    public static LinkExit a(@NotNull SdkResult$SDKResult result, @NotNull String storedRequestId, @NotNull String errorJson, @NotNull String metadataJson) {
        LinkExitMetadata metadata;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(storedRequestId, "storedRequestId");
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        if (result.hasError() && !Intrinsics.areEqual(result.getError().getRequestId(), "")) {
            storedRequestId = result.getError().getRequestId();
        }
        String str = storedRequestId;
        LinkError linkError = null;
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata.Institution institution = result.getMetadata().hasInstitution() ? result.getMetadata().getInstitution() : null;
            String linkSessionId = result.getMetadata().getLinkSessionId();
            String name = institution != null ? institution.getName() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            String str2 = name;
            metadata = new LinkExitMetadata(LinkExitMetadataStatus.INSTANCE.fromString(result.getMetadata().getStatus()), (institutionId == null || institutionId.length() == 0 || str2 == null || str2.length() == 0) ? null : new LinkInstitution(institutionId, str2), linkSessionId, str, metadataJson);
        } else {
            metadata = L2.a(55, str);
        }
        SdkResult$SDKResult.Error error = result.hasError() ? result.getError() : null;
        if (error != null) {
            String errorCode = error.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "getErrorCode(...)");
            String errorMessage = error.getErrorMessage();
            Intrinsics.checkNotNullExpressionValue(errorMessage, "getErrorMessage(...)");
            String displayMessage = error.getDisplayMessage();
            Intrinsics.checkNotNullExpressionValue(displayMessage, "getDisplayMessage(...)");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
            Intrinsics.checkNotNullParameter(errorJson, "errorJson");
            linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson);
        }
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    @NotNull
    public static LinkSuccess a(@NotNull SdkResult$SDKResult result, @NotNull String metadataJson) {
        String str;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(metadataJson, "metadataJson");
        if (result.hasMetadata()) {
            SdkResult$SDKResult.Metadata metadata = result.getMetadata();
            Intrinsics.checkNotNull(metadata);
            List<SdkResult$SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            Intrinsics.checkNotNullExpressionValue(accountsList, "getAccountsList(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accountsList, 10));
            Iterator<T> it = accountsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SdkResult$SDKResult.Metadata.Account account = (SdkResult$SDKResult.Metadata.Account) it.next();
                String accountId = account.getId();
                Intrinsics.checkNotNullExpressionValue(accountId, "getId(...)");
                String name = account.getName();
                String mask = account.getMask();
                LinkAccountSubtype accountSubType = LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType());
                String verificationStatus = account.getVerificationStatus();
                if (verificationStatus != null && verificationStatus.length() != 0) {
                    str = account.getVerificationStatus();
                }
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(accountSubType, "accountSubType");
                arrayList.add(new LinkAccount(accountId, name, mask, accountSubType, LinkAccountVerificationStatus.INSTANCE.convert(str), null, 32, null));
            }
            SdkResult$SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            String institutionId = institution != null ? institution.getInstitutionId() : null;
            str = institution != null ? institution.getName() : null;
            String linkSessionId = metadata.getLinkSessionId();
            Intrinsics.checkNotNullExpressionValue(linkSessionId, "getLinkSessionId(...)");
            LinkSuccessMetadata a10 = L2.a(arrayList, institutionId, str, linkSessionId, metadataJson);
            String publicToken = result.getPublicToken();
            Intrinsics.checkNotNullExpressionValue(publicToken, "getPublicToken(...)");
            return L2.a(publicToken, a10);
        }
        throw new LinkException("Was successful but returned no data: " + result);
    }

    public static AbstractC3802z0.d a(Throwable th2, String str) {
        C3556a6.a.a(C3556a6.f39823a, th2);
        return new AbstractC3802z0.d(L2.b(th2, str));
    }
}
