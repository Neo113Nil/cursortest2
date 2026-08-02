package com.plaid.internal;

import com.plaid.internal.AbstractC3802z0;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3770v4;
import com.plaid.internal.D6;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import ei.AbstractC4212b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3750t2 implements InterfaceC3759u2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final G2 f41078a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Z2 f41079b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Y2 f41080c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final y8 f41081d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8 f41082e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final x8 f41083f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final B8 f41084g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final A8 f41085h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final A0 f41086i;

    public C3750t2(@NotNull G2 navigator, @NotNull Z2 linkStateStore, @NotNull Y2 linkStateReducer, @NotNull y8 writeOAuthRedirectUri, @NotNull C8 writeWebviewFallbackUri, @NotNull x8 writeChannelInfo, @NotNull B8 writeWebviewFallbackId, @NotNull A8 writeWebviewBackgroundTransparencyState, @NotNull A0 destinationFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(linkStateReducer, "linkStateReducer");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        Intrinsics.checkNotNullParameter(writeChannelInfo, "writeChannelInfo");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackId, "writeWebviewFallbackId");
        Intrinsics.checkNotNullParameter(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        Intrinsics.checkNotNullParameter(destinationFactory, "destinationFactory");
        this.f41078a = navigator;
        this.f41079b = linkStateStore;
        this.f41080c = linkStateReducer;
        this.f41081d = writeOAuthRedirectUri;
        this.f41082e = writeWebviewFallbackUri;
        this.f41083f = writeChannelInfo;
        this.f41084g = writeWebviewFallbackId;
        this.f41085h = writeWebviewBackgroundTransparencyState;
        this.f41086i = destinationFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r8.a(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC3759u2
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Pane$PaneOutput[] pane$PaneOutputArr, @NotNull ContinuationImpl continuationImpl) {
        C3706o2 c3706o2;
        Object obj;
        Object coroutine_suspended;
        int i10;
        Pane$PaneOutput[] pane$PaneOutputArr2;
        Y2 y22;
        C3750t2 c3750t2;
        C3750t2 c3750t22;
        if (continuationImpl instanceof C3706o2) {
            c3706o2 = (C3706o2) continuationImpl;
            int i11 = c3706o2.f40909f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3706o2.f40909f = i11 - Integer.MIN_VALUE;
                obj = c3706o2.f40907d;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3706o2.f40909f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y2 y23 = this.f41080c;
                    Z2 z22 = this.f41079b;
                    c3706o2.f40904a = this;
                    c3706o2.f40905b = pane$PaneOutputArr;
                    c3706o2.f40906c = y23;
                    c3706o2.f40909f = 1;
                    Object a10 = z22.a(c3706o2);
                    if (a10 != coroutine_suspended) {
                        pane$PaneOutputArr2 = pane$PaneOutputArr;
                        y22 = y23;
                        obj = a10;
                        c3750t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    y22 = c3706o2.f40906c;
                    pane$PaneOutputArr2 = c3706o2.f40905b;
                    c3750t2 = c3706o2.f40904a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3750t22 = c3706o2.f40904a;
                    ResultKt.throwOnFailure(obj);
                    N2 n22 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Next " + n22);
                    c3706o2.f40904a = null;
                    c3706o2.f40909f = 3;
                }
                List list = ArraysKt.toList(pane$PaneOutputArr2);
                c3706o2.f40904a = c3750t2;
                c3706o2.f40905b = null;
                c3706o2.f40906c = null;
                c3706o2.f40909f = 2;
                obj = y22.a((N2) obj, list, c3706o2);
                if (obj != coroutine_suspended) {
                    c3750t22 = c3750t2;
                    N2 n222 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Next " + n222);
                    c3706o2.f40904a = null;
                    c3706o2.f40909f = 3;
                }
                return coroutine_suspended;
            }
        }
        c3706o2 = new C3706o2(this, continuationImpl);
        obj = c3706o2.f40907d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3706o2.f40909f;
        if (i10 != 0) {
        }
        List list2 = ArraysKt.toList(pane$PaneOutputArr2);
        c3706o2.f40904a = c3750t2;
        c3706o2.f40905b = null;
        c3706o2.f40906c = null;
        c3706o2.f40909f = 2;
        obj = y22.a((N2) obj, list2, c3706o2);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r2.a(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.plaid.internal.InterfaceC3759u2
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull ContinuationImpl continuationImpl) {
        C3732r2 c3732r2;
        int i10;
        C3750t2 c3750t2;
        if (continuationImpl instanceof C3732r2) {
            c3732r2 = (C3732r2) continuationImpl;
            int i11 = c3732r2.f41022d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3732r2.f41022d = i11 - Integer.MIN_VALUE;
                Object obj = c3732r2.f41020b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3732r2.f41022d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z2 z22 = this.f41079b;
                    c3732r2.f41019a = this;
                    c3732r2.f41022d = 1;
                    obj = z22.a(c3732r2);
                    if (obj != coroutine_suspended) {
                        c3750t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    c3750t2 = c3732r2.f41019a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3750t2 = c3732r2.f41019a;
                    ResultKt.throwOnFailure(obj);
                    N2 n22 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Start next " + n22);
                    c3732r2.f41019a = null;
                    c3732r2.f41022d = 3;
                }
                N2 n23 = (N2) obj;
                C3556a6.a.a(C3556a6.f39823a, "Start from " + n23);
                Y2 y22 = c3750t2.f41080c;
                c3732r2.f41019a = c3750t2;
                c3732r2.f41022d = 2;
                obj = y22.a(n23, false, (ContinuationImpl) c3732r2);
            }
        }
        c3732r2 = new C3732r2(this, continuationImpl);
        Object obj2 = c3732r2.f41020b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3732r2.f41022d;
        if (i10 != 0) {
        }
        N2 n232 = (N2) obj2;
        C3556a6.a.a(C3556a6.f39823a, "Start from " + n232);
        Y2 y222 = c3750t2.f41080c;
        c3732r2.f41019a = c3750t2;
        c3732r2.f41022d = 2;
        obj2 = y222.a(n232, false, (ContinuationImpl) c3732r2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r2.a(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC3759u2
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3715p2 c3715p2;
        Object obj;
        Object coroutine_suspended;
        int i10;
        Y2 y22;
        C3750t2 c3750t2;
        C3750t2 c3750t22;
        if (continuationImpl instanceof C3715p2) {
            c3715p2 = (C3715p2) continuationImpl;
            int i11 = c3715p2.f40957e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3715p2.f40957e = i11 - Integer.MIN_VALUE;
                obj = c3715p2.f40955c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3715p2.f40957e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    y22 = this.f41080c;
                    Z2 z22 = this.f41079b;
                    c3715p2.f40953a = this;
                    c3715p2.f40954b = y22;
                    c3715p2.f40957e = 1;
                    obj = z22.a(c3715p2);
                    if (obj != coroutine_suspended) {
                        c3750t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    y22 = c3715p2.f40954b;
                    c3750t2 = c3715p2.f40953a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3750t22 = c3715p2.f40953a;
                    ResultKt.throwOnFailure(obj);
                    N2 n22 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Previous " + n22);
                    c3715p2.f40953a = null;
                    c3715p2.f40957e = 3;
                }
                c3715p2.f40953a = c3750t2;
                c3715p2.f40954b = null;
                c3715p2.f40957e = 2;
                obj = y22.b((N2) obj, c3715p2);
                if (obj != coroutine_suspended) {
                    c3750t22 = c3750t2;
                    N2 n222 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Previous " + n222);
                    c3715p2.f40953a = null;
                    c3715p2.f40957e = 3;
                }
                return coroutine_suspended;
            }
        }
        c3715p2 = new C3715p2(this, continuationImpl);
        obj = c3715p2.f40955c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3715p2.f40957e;
        if (i10 != 0) {
        }
        c3715p2.f40953a = c3750t2;
        c3715p2.f40954b = null;
        c3715p2.f40957e = 2;
        obj = y22.b((N2) obj, c3715p2);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (r12.a(r13, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.plaid.internal.InterfaceC3759u2
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull D6 d62, @NotNull ContinuationImpl continuationImpl) {
        C3724q2 c3724q2;
        int i10;
        C3750t2 c3750t2;
        N2 n22;
        D6 d63;
        C3750t2 c3750t22;
        C3750t2 c3750t23;
        N2 n23;
        if (continuationImpl instanceof C3724q2) {
            c3724q2 = (C3724q2) continuationImpl;
            int i11 = c3724q2.f40997f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3724q2.f40997f = i11 - Integer.MIN_VALUE;
                Object obj = c3724q2.f40995d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3724q2.f40997f;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z2 z22 = this.f41079b;
                    c3724q2.f40992a = this;
                    c3724q2.f40993b = d62;
                    c3724q2.f40997f = 1;
                    obj = z22.a(c3724q2);
                    if (obj != coroutine_suspended) {
                        c3750t2 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    d62 = c3724q2.f40993b;
                    c3750t2 = c3724q2.f40992a;
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    n23 = c3724q2.f40994c;
                    d63 = c3724q2.f40993b;
                    c3750t23 = c3724q2.f40992a;
                    ResultKt.throwOnFailure(obj);
                    n22 = n23;
                    c3750t22 = c3750t23;
                    Y2 y22 = c3750t22.f41080c;
                    c3724q2.f40992a = c3750t22;
                    c3724q2.f40993b = null;
                    c3724q2.f40994c = null;
                    c3724q2.f40997f = 3;
                    obj = y22.a(n22, d63, c3724q2);
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c3750t22 = c3724q2.f40992a;
                    ResultKt.throwOnFailure(obj);
                    N2 n24 = (N2) obj;
                    C3556a6.a.a(C3556a6.f39823a, "Resume next " + n24);
                    c3724q2.f40992a = null;
                    c3724q2.f40997f = 4;
                }
                n22 = (N2) obj;
                C3556a6.a.a(C3556a6.f39823a, "Resume from " + n22);
                if (!(d62 instanceof D6.a)) {
                    y8 y8Var = c3750t2.f41081d;
                    String a10 = ((D6.a) d62).a();
                    c3724q2.f40992a = c3750t2;
                    c3724q2.f40993b = d62;
                    c3724q2.f40994c = n22;
                    c3724q2.f40997f = 2;
                    if (y8Var.a(a10, c3724q2) != coroutine_suspended) {
                        c3750t23 = c3750t2;
                        d63 = d62;
                        n23 = n22;
                        n22 = n23;
                        c3750t22 = c3750t23;
                        Y2 y222 = c3750t22.f41080c;
                        c3724q2.f40992a = c3750t22;
                        c3724q2.f40993b = null;
                        c3724q2.f40994c = null;
                        c3724q2.f40997f = 3;
                        obj = y222.a(n22, d63, c3724q2);
                    }
                    return coroutine_suspended;
                }
                C3750t2 c3750t24 = c3750t2;
                d63 = d62;
                c3750t22 = c3750t24;
                Y2 y2222 = c3750t22.f41080c;
                c3724q2.f40992a = c3750t22;
                c3724q2.f40993b = null;
                c3724q2.f40994c = null;
                c3724q2.f40997f = 3;
                obj = y2222.a(n22, d63, c3724q2);
            }
        }
        c3724q2 = new C3724q2(this, continuationImpl);
        Object obj2 = c3724q2.f40995d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3724q2.f40997f;
        if (i10 != 0) {
        }
        n22 = (N2) obj2;
        C3556a6.a.a(C3556a6.f39823a, "Resume from " + n22);
        if (!(d62 instanceof D6.a)) {
        }
    }

    @Override // com.plaid.internal.InterfaceC3759u2
    public final void a(@NotNull LinkResult linkResult) {
        Object destination;
        Intrinsics.checkNotNullParameter(linkResult, "linkResult");
        G2 g22 = this.f41078a;
        if (linkResult instanceof LinkSuccess) {
            destination = new AbstractC3802z0.j((LinkSuccess) linkResult);
        } else {
            if (!(linkResult instanceof LinkExit)) {
                throw new IllegalArgumentException("Link result is not a valid result of LinkSuccess or LinkExit");
            }
            destination = new AbstractC3802z0.d((LinkExit) linkResult);
        }
        g22.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        g22.f39257a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC3759u2
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        G2 g22 = this.f41078a;
        AbstractC3802z0.f destination = new AbstractC3802z0.f(url);
        g22.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        g22.f39257a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC3759u2
    public final void a(@NotNull AbstractC3743s4 openMethod) {
        Intrinsics.checkNotNullParameter(openMethod, "openMethod");
        G2 g22 = this.f41078a;
        AbstractC3802z0.g destination = new AbstractC3802z0.g(openMethod);
        g22.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        g22.f39257a.postValue(destination);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|19|(1:21)|22|(1:24))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        com.plaid.internal.L2.b(new com.plaid.internal.C3551a1("Failed to parse webview json"), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.plaid.internal.InterfaceC3759u2
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull LinkedHashMap linkedHashMap, @NotNull ContinuationImpl continuationImpl) {
        C3688m2 c3688m2;
        int i10;
        if (continuationImpl instanceof C3688m2) {
            c3688m2 = (C3688m2) continuationImpl;
            int i11 = c3688m2.f40794c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3688m2.f40794c = i11 - Integer.MIN_VALUE;
                Object obj = c3688m2.f40792a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3688m2.f40794c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4212b b10 = ei.v.b(null, C3697n2.f40844a, 1, null);
                    String str = (String) linkedHashMap.get("webview");
                    if (str == null) {
                        str = "";
                    }
                    C3770v4 c3770v4 = (C3770v4) b10.d(C3770v4.a.f41147a, str);
                    String str2 = "";
                    String str3 = "";
                    String str4 = "";
                    String str5 = "";
                    N2 kVar = new N2.k(str2, str3, str4, str5, c3770v4.f41144b, c3770v4.f41145c, c3770v4.f41146d, false, null, 1152);
                    c3688m2.f40794c = 1;
                    if (a(kVar, c3688m2) == coroutine_suspended) {
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
        c3688m2 = new C3688m2(this, continuationImpl);
        Object obj2 = c3688m2.f40792a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3688m2.f40794c;
        if (i10 != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
    
        if (r9.a(r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        if (r4.a(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (r9.a(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (r4.a(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r4.a(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(N2 n22, ContinuationImpl continuationImpl) {
        C3741s2 c3741s2;
        C3750t2 c3750t2;
        N2.k kVar;
        A a10;
        Unit unit;
        N2.k kVar2;
        G2 g22;
        if (continuationImpl instanceof C3741s2) {
            c3741s2 = (C3741s2) continuationImpl;
            int i10 = c3741s2.f41049e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3741s2.f41049e = i10 - Integer.MIN_VALUE;
                Object obj = c3741s2.f41047c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c3741s2.f41049e) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        if (n22 instanceof N2.k) {
                            C8 c82 = this.f41082e;
                            String str = ((N2.k) n22).f39433f;
                            c3741s2.f41045a = this;
                            c3741s2.f41046b = n22;
                            c3741s2.f41049e = 1;
                            if (c82.a(str, c3741s2) != coroutine_suspended) {
                                c3750t2 = this;
                                kVar = (N2.k) n22;
                                if (kVar.f39434g.length() > 0) {
                                    B8 b82 = c3750t2.f41084g;
                                    String str2 = kVar.f39434g;
                                    c3741s2.f41045a = c3750t2;
                                    c3741s2.f41046b = n22;
                                    c3741s2.f41049e = 2;
                                    break;
                                }
                                a10 = ((N2.k) n22).f39435h;
                                if (a10 != null) {
                                    x8 x8Var = c3750t2.f41083f;
                                    c3741s2.f41045a = c3750t2;
                                    c3741s2.f41046b = n22;
                                    c3741s2.f41049e = 3;
                                    break;
                                } else {
                                    unit = null;
                                    if (unit == null) {
                                        x8 x8Var2 = c3750t2.f41083f;
                                        c3741s2.f41045a = c3750t2;
                                        c3741s2.f41046b = n22;
                                        c3741s2.f41049e = 4;
                                        break;
                                    }
                                    kVar2 = (N2.k) n22;
                                    if (!kVar2.f39437j) {
                                        A8 a82 = c3750t2.f41085h;
                                        boolean z10 = kVar2.f39436i;
                                        c3741s2.f41045a = c3750t2;
                                        c3741s2.f41046b = n22;
                                        c3741s2.f41049e = 5;
                                        break;
                                    }
                                    Z2 z22 = c3750t2.f41079b;
                                    c3741s2.f41045a = c3750t2;
                                    c3741s2.f41046b = n22;
                                    c3741s2.f41049e = 6;
                                    break;
                                }
                            }
                            return coroutine_suspended;
                        }
                        c3750t2 = this;
                        Z2 z222 = c3750t2.f41079b;
                        c3741s2.f41045a = c3750t2;
                        c3741s2.f41046b = n22;
                        c3741s2.f41049e = 6;
                    case 1:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        kVar = (N2.k) n22;
                        if (kVar.f39434g.length() > 0) {
                        }
                        a10 = ((N2.k) n22).f39435h;
                        if (a10 != null) {
                        }
                        break;
                    case 2:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        a10 = ((N2.k) n22).f39435h;
                        if (a10 != null) {
                        }
                        break;
                    case 3:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        unit = Unit.INSTANCE;
                        if (unit == null) {
                        }
                        kVar2 = (N2.k) n22;
                        if (!kVar2.f39437j) {
                        }
                        Z2 z2222 = c3750t2.f41079b;
                        c3741s2.f41045a = c3750t2;
                        c3741s2.f41046b = n22;
                        c3741s2.f41049e = 6;
                        break;
                    case 4:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        kVar2 = (N2.k) n22;
                        if (!kVar2.f39437j) {
                        }
                        Z2 z22222 = c3750t2.f41079b;
                        c3741s2.f41045a = c3750t2;
                        c3741s2.f41046b = n22;
                        c3741s2.f41049e = 6;
                        break;
                    case 5:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        Z2 z222222 = c3750t2.f41079b;
                        c3741s2.f41045a = c3750t2;
                        c3741s2.f41046b = n22;
                        c3741s2.f41049e = 6;
                        break;
                    case 6:
                        n22 = c3741s2.f41046b;
                        c3750t2 = (C3750t2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        G2 g23 = c3750t2.f41078a;
                        A0 a02 = c3750t2.f41086i;
                        c3741s2.f41045a = g23;
                        c3741s2.f41046b = null;
                        c3741s2.f41049e = 7;
                        Object a11 = a02.a(n22, c3741s2);
                        if (a11 != coroutine_suspended) {
                            obj = a11;
                            g22 = g23;
                            AbstractC3802z0 destination = (AbstractC3802z0) obj;
                            g22.getClass();
                            Intrinsics.checkNotNullParameter(destination, "destination");
                            g22.f39257a.postValue(destination);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    case 7:
                        g22 = (G2) c3741s2.f41045a;
                        ResultKt.throwOnFailure(obj);
                        AbstractC3802z0 destination2 = (AbstractC3802z0) obj;
                        g22.getClass();
                        Intrinsics.checkNotNullParameter(destination2, "destination");
                        g22.f39257a.postValue(destination2);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c3741s2 = new C3741s2(this, continuationImpl);
        Object obj2 = c3741s2.f41047c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c3741s2.f41049e) {
        }
    }
}
