package com.plaid.internal;

import ai.AbstractC2028a;
import com.plaid.internal.C3556a6;
import com.plaid.internal.D1;
import com.plaid.internal.F6;
import com.plaid.internal.I2;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLinkUrlParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkUrlParser.kt\ncom/plaid/internal/url/LinkUrlParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1#2:206\n1271#3,2:207\n1285#3,4:209\n1549#3:213\n1620#3,3:214\n*S KotlinDebug\n*F\n+ 1 LinkUrlParser.kt\ncom/plaid/internal/url/LinkUrlParser\n*L\n121#1:207,2\n121#1:209,4\n133#1:213\n133#1:214,3\n*E\n"})
/* renamed from: com.plaid.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3751t3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f41087a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC4212b f41088b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public String f41089c;

    /* renamed from: com.plaid.internal.t3$a */
    public interface a {
        void a(@NotNull C3551a1 c3551a1);

        void a(@NotNull LinkEvent linkEvent, @NotNull I2 i22);

        void a(@NotNull LinkExit linkExit);

        void a(@NotNull LinkSuccess linkSuccess);

        void a(@NotNull String str, @NotNull LinkEventMetadata linkEventMetadata);

        void a(@NotNull LinkedHashMap linkedHashMap);

        void b(@NotNull String str);

        void c(@NotNull String str);
    }

    /* renamed from: com.plaid.internal.t3$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41090a;

        static {
            int[] iArr = new int[EnumC3772v6.values().length];
            try {
                iArr[EnumC3772v6.ENQUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3772v6.ENQUEUE_AND_FLUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3772v6.NO_ENQUEUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3772v6.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41090a = iArr;
        }
    }

    public C3751t3(@NotNull a listener, @NotNull AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f41087a = listener;
        this.f41088b = json;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6 A[EDGE_INSN: B:86:0x01b6->B:63:0x01b6 BREAK  A[LOOP:1: B:57:0x01a3->B:60:0x01b3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull String url) {
        int parseInt;
        int length;
        int i10;
        I2 i22;
        Intrinsics.checkNotNullParameter(url, "url");
        int i11 = 0;
        EnumC3772v6 enumC3772v6 = null;
        if (!StringsKt.startsWith$default(url, "plaidlink://", false, 2, (Object) null)) {
            C3556a6.a.a(C3556a6.f39823a, "external link: " + url);
            this.f41087a.c(url);
            return;
        }
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(StringsKt.replace$default(url, "plaidlink://", "https://", false, 4, (Object) null));
        C3556a6.a.a(C3556a6.f39823a, "plaidcallback " + url);
        String host = httpUrl.host();
        if (!Intrinsics.areEqual(host, "event")) {
            F6.a.b(MapsKt.emptyMap(), "Webview url intercepted: " + host);
        }
        Set<String> queryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
        for (Object obj : queryParameterNames) {
            String queryParameter = httpUrl.queryParameter((String) obj);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkData.put(obj, queryParameter);
        }
        String str = (String) linkData.get("link_session_id");
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && !Intrinsics.areEqual(str, this.f41089c)) {
                this.f41087a.b(str);
                this.f41089c = str;
            }
        }
        int hashCode = host.hashCode();
        if (hashCode != -579210487) {
            if (hashCode != 3127582) {
                if (hashCode != 96891546) {
                    if (hashCode == 2091030007 && host.equals("session_handoff")) {
                        C3556a6.a.a(C3556a6.f39823a, "Handoff to out of process");
                        this.f41087a.a(linkData);
                        return;
                    }
                } else if (host.equals("event")) {
                    String str2 = (String) linkData.get("event_name");
                    if (str2 == null) {
                        str2 = "null";
                    }
                    String str3 = (String) linkData.get("queue_behavior");
                    if (str3 == null) {
                        str3 = "null";
                    }
                    String str4 = (String) linkData.get("delay_ms");
                    String str5 = str4 != null ? str4 : "null";
                    C3556a6.a aVar = C3556a6.f39823a;
                    aVar.getClass();
                    C3556a6.a.a("Event name: " + str2, false);
                    C3556a6.a.a(aVar, "queue_behavior: " + str3 + ", delay_ms: " + str5);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received event: ");
                    sb2.append(str2);
                    F6.a.b(MapsKt.mapOf(TuplesKt.to("event_name", str2), TuplesKt.to("queue_behavior", str3), TuplesKt.to("delay_ms", str5)), sb2.toString());
                    C3556a6.a.a(aVar, httpUrl.getUrl());
                    String str6 = (String) linkData.get("delay_ms");
                    try {
                        if (str6 != null) {
                            try {
                                parseInt = Integer.parseInt(str6);
                            } catch (NumberFormatException unused) {
                            }
                            EnumC3772v6[] values = EnumC3772v6.values();
                            length = values.length;
                            while (true) {
                                if (i11 < length) {
                                    break;
                                }
                                EnumC3772v6 enumC3772v62 = values[i11];
                                if (Intrinsics.areEqual(enumC3772v62.getProtoString(), str3)) {
                                    enumC3772v6 = enumC3772v62;
                                    break;
                                }
                                i11++;
                            }
                            if (enumC3772v6 == null) {
                                enumC3772v6 = EnumC3772v6.UNKNOWN;
                            }
                            i10 = b.f41090a[enumC3772v6.ordinal()];
                            if (i10 != 1) {
                                i22 = I2.b.f39292a;
                            } else if (i10 == 2) {
                                i22 = I2.c.f39293a;
                            } else if (i10 == 3) {
                                i22 = I2.d.f39294a;
                            } else {
                                if (i10 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i22 = parseInt > 0 ? new I2.a(parseInt) : I2.d.f39294a;
                            }
                            a aVar2 = this.f41087a;
                            Intrinsics.checkNotNullParameter(linkData, "linkData");
                            aVar2.a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkData), i22);
                            return;
                        }
                        a aVar22 = this.f41087a;
                        Intrinsics.checkNotNullParameter(linkData, "linkData");
                        aVar22.a(LinkEvent.INSTANCE.fromMap$link_sdk_release(linkData), i22);
                        return;
                    } catch (NoSuchElementException unused2) {
                        this.f41087a.a(new C3551a1("Failed to parse event"));
                        return;
                    }
                    parseInt = 0;
                    EnumC3772v6[] values2 = EnumC3772v6.values();
                    length = values2.length;
                    while (true) {
                        if (i11 < length) {
                        }
                        i11++;
                    }
                    if (enumC3772v6 == null) {
                    }
                    i10 = b.f41090a[enumC3772v6.ordinal()];
                    if (i10 != 1) {
                    }
                }
            } else if (host.equals("exit")) {
                C3556a6.a aVar3 = C3556a6.f39823a;
                C3556a6.a.a(aVar3, "User status in flow: ", new Object[]{"data: " + linkData.get("status")});
                C3556a6.a.a(aVar3, "Link request ID: ", new Object[]{"data: " + linkData.get("request_id")});
                try {
                    a aVar4 = this.f41087a;
                    Intrinsics.checkNotNullParameter(linkData, "linkData");
                    aVar4.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
                    return;
                } catch (NoSuchElementException unused3) {
                    this.f41087a.a(new C3551a1("Failed to parse exit"));
                    return;
                }
            }
        } else if (host.equals("connected")) {
            C3556a6.a aVar5 = C3556a6.f39823a;
            C3556a6.a.a(aVar5, "Institution id: " + linkData.get("institution_id"));
            C3556a6.a.a(aVar5, "Institution name:  " + linkData.get("institution_name"));
            a(linkData);
            return;
        }
        C3556a6.a.a(C3556a6.f39823a, "Link action detected: " + host);
        this.f41087a.a(host, LinkEventMetadata.INSTANCE.fromMap(linkData, this.f41089c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public final void a(LinkedHashMap linkedHashMap) {
        List list;
        ?? emptyList;
        String str = (String) linkedHashMap.get("accounts");
        if (str == null) {
            str = "";
        }
        try {
            try {
                AbstractC4212b abstractC4212b = this.f41088b;
                D1.f39195g.getClass();
                D1.b.a();
                list = (List) abstractC4212b.d(AbstractC2028a.h(D1.a.f39202a), str);
            } catch (Zh.o unused) {
                C3556a6.a.b(C3556a6.f39823a, "Unable to parse accounts data: " + P4.a(str));
                list = null;
            }
            if (list != null) {
                emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    emptyList.add(L2.a((D1) it.next()));
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            this.f41087a.a(L2.a(linkedHashMap, (List) emptyList));
        } catch (NoSuchElementException unused2) {
            this.f41087a.a(new C3551a1("Failed to parse success"));
        }
    }
}
