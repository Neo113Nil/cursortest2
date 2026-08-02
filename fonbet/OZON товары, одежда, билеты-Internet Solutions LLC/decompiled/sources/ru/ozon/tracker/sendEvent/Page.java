package ru.ozon.tracker.sendEvent;

import B4.V;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019B½\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u001aBÉ\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u001bBÕ\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u001cJÁ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u00108JÍ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u00109JÙ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010:J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00105Jæ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00172\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\fHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b/\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b0\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b1\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105¨\u0006R"}, d2 = {"Lru/ozon/tracker/sendEvent/Page;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "pageId", ImagesContract.URL, "ruleId", "layoutId", "layoutVersion", "composerPageType", "previousPage", "categoryId", "", "nextUrl", "tagId", "", "sku", "highlightId", "sellerId", "brandId", "miniapp", "marketplaceId", "teensMode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPageId", "getUrl", "getRuleId", "getLayoutId", "getLayoutVersion", "getComposerPageType", "getPreviousPage", "()Lru/ozon/tracker/sendEvent/Page;", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextUrl", "getTagId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSku", "getHighlightId", "getSellerId", "getBrandId", "getMiniapp", "getMarketplaceId", "getTeensMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/tracker/sendEvent/Page;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/tracker/sendEvent/Page;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/sendEvent/Page;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/tracker/sendEvent/Page;", "equals", "other", "hashCode", "toString", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Page {
    private final Long brandId;
    private final Integer categoryId;
    private final String composerPageType;
    private final Long highlightId;
    private final String layoutId;
    private final String layoutVersion;
    private final String marketplaceId;
    private final String miniapp;
    private final String name;
    private final String nextUrl;
    private final String pageId;
    private final Page previousPage;
    private final String ruleId;
    private final Long sellerId;
    private final Long sku;
    private final Long tagId;
    private final Boolean teensMode;
    private final String url;

    public Page() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page2, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10, Boolean bool, int i11, Object obj) {
        Boolean bool2;
        String str11;
        String str12 = (i11 & 1) != 0 ? page.name : str;
        String str13 = (i11 & 2) != 0 ? page.pageId : str2;
        String str14 = (i11 & 4) != 0 ? page.url : str3;
        String str15 = (i11 & 8) != 0 ? page.ruleId : str4;
        String str16 = (i11 & 16) != 0 ? page.layoutId : str5;
        String str17 = (i11 & 32) != 0 ? page.layoutVersion : str6;
        String str18 = (i11 & 64) != 0 ? page.composerPageType : str7;
        Page page3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.previousPage : page2;
        Integer num2 = (i11 & 256) != 0 ? page.categoryId : num;
        String str19 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.nextUrl : str8;
        Long l16 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.tagId : l11;
        Long l17 = (i11 & 2048) != 0 ? page.sku : l12;
        Long l18 = (i11 & 4096) != 0 ? page.highlightId : l13;
        Long l19 = (i11 & 8192) != 0 ? page.sellerId : l14;
        String str20 = str12;
        Long l21 = (i11 & 16384) != 0 ? page.brandId : l15;
        String str21 = (i11 & 32768) != 0 ? page.miniapp : str9;
        String str22 = (i11 & 65536) != 0 ? page.marketplaceId : str10;
        if ((i11 & 131072) != 0) {
            str11 = str22;
            bool2 = page.teensMode;
        } else {
            bool2 = bool;
            str11 = str22;
        }
        return page.copy(str20, str13, str14, str15, str16, str17, str18, page3, num2, str19, l16, l17, l18, l19, l21, str21, str11, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNextUrl() {
        return this.nextUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getTagId() {
        return this.tagId;
    }

    /* renamed from: component12, reason: from getter */
    public final Long getSku() {
        return this.sku;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getHighlightId() {
        return this.highlightId;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getSellerId() {
        return this.sellerId;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getBrandId() {
        return this.brandId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getMiniapp() {
        return this.miniapp;
    }

    /* renamed from: component17, reason: from getter */
    public final String getMarketplaceId() {
        return this.marketplaceId;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getTeensMode() {
        return this.teensMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRuleId() {
        return this.ruleId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLayoutVersion() {
        return this.layoutVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final String getComposerPageType() {
        return this.composerPageType;
    }

    /* renamed from: component8, reason: from getter */
    public final Page getPreviousPage() {
        return this.previousPage;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final Page copy(String name, String pageId, String url, String ruleId, String layoutId, String layoutVersion, String composerPageType, Page previousPage, Integer categoryId, String nextUrl, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId, String miniapp, String marketplaceId, Boolean teensMode) {
        return new Page(name, pageId, url, ruleId, layoutId, layoutVersion, composerPageType, previousPage, categoryId, nextUrl, tagId, sku, highlightId, sellerId, brandId, miniapp, marketplaceId, teensMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return Intrinsics.d(this.name, page.name) && Intrinsics.d(this.pageId, page.pageId) && Intrinsics.d(this.url, page.url) && Intrinsics.d(this.ruleId, page.ruleId) && Intrinsics.d(this.layoutId, page.layoutId) && Intrinsics.d(this.layoutVersion, page.layoutVersion) && Intrinsics.d(this.composerPageType, page.composerPageType) && Intrinsics.d(this.previousPage, page.previousPage) && Intrinsics.d(this.categoryId, page.categoryId) && Intrinsics.d(this.nextUrl, page.nextUrl) && Intrinsics.d(this.tagId, page.tagId) && Intrinsics.d(this.sku, page.sku) && Intrinsics.d(this.highlightId, page.highlightId) && Intrinsics.d(this.sellerId, page.sellerId) && Intrinsics.d(this.brandId, page.brandId) && Intrinsics.d(this.miniapp, page.miniapp) && Intrinsics.d(this.marketplaceId, page.marketplaceId) && Intrinsics.d(this.teensMode, page.teensMode);
    }

    public final Long getBrandId() {
        return this.brandId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getComposerPageType() {
        return this.composerPageType;
    }

    public final Long getHighlightId() {
        return this.highlightId;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getLayoutVersion() {
        return this.layoutVersion;
    }

    public final String getMarketplaceId() {
        return this.marketplaceId;
    }

    public final String getMiniapp() {
        return this.miniapp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Page getPreviousPage() {
        return this.previousPage;
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public final Long getSellerId() {
        return this.sellerId;
    }

    public final Long getSku() {
        return this.sku;
    }

    public final Long getTagId() {
        return this.tagId;
    }

    public final Boolean getTeensMode() {
        return this.teensMode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ruleId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.layoutId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.layoutVersion;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.composerPageType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Page page = this.previousPage;
        int hashCode8 = (hashCode7 + (page == null ? 0 : page.hashCode())) * 31;
        Integer num = this.categoryId;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.nextUrl;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.tagId;
        int hashCode11 = (hashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sku;
        int hashCode12 = (hashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.highlightId;
        int hashCode13 = (hashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.sellerId;
        int hashCode14 = (hashCode13 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.brandId;
        int hashCode15 = (hashCode14 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str9 = this.miniapp;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.marketplaceId;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.teensMode;
        return hashCode17 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.pageId;
        String str3 = this.url;
        String str4 = this.ruleId;
        String str5 = this.layoutId;
        String str6 = this.layoutVersion;
        String str7 = this.composerPageType;
        Page page = this.previousPage;
        Integer num = this.categoryId;
        String str8 = this.nextUrl;
        Long l11 = this.tagId;
        Long l12 = this.sku;
        Long l13 = this.highlightId;
        Long l14 = this.sellerId;
        Long l15 = this.brandId;
        String str9 = this.miniapp;
        String str10 = this.marketplaceId;
        Boolean bool = this.teensMode;
        StringBuilder d11 = C3660k.d("Page(name=", str, ", pageId=", str2, ", url=");
        a.h(d11, str3, ", ruleId=", str4, ", layoutId=");
        a.h(d11, str5, ", layoutVersion=", str6, ", composerPageType=");
        d11.append(str7);
        d11.append(", previousPage=");
        d11.append(page);
        d11.append(", categoryId=");
        V.f(num, ", nextUrl=", str8, ", tagId=", d11);
        TY.a.e(d11, l11, ", sku=", l12, ", highlightId=");
        TY.a.e(d11, l13, ", sellerId=", l14, ", brandId=");
        d11.append(l15);
        d11.append(", miniapp=");
        d11.append(str9);
        d11.append(", marketplaceId=");
        d11.append(str10);
        d11.append(", teensMode=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    public Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10, Boolean bool) {
        this.name = str;
        this.pageId = str2;
        this.url = str3;
        this.ruleId = str4;
        this.layoutId = str5;
        this.layoutVersion = str6;
        this.composerPageType = str7;
        this.previousPage = page;
        this.categoryId = num;
        this.nextUrl = str8;
        this.tagId = l11;
        this.sku = l12;
        this.highlightId = l13;
        this.sellerId = l14;
        this.brandId = l15;
        this.miniapp = str9;
        this.marketplaceId = str10;
        this.teensMode = bool;
    }

    @InterfaceC3999a
    public final /* synthetic */ Page copy(String name, String pageId, String url, String ruleId, String layoutId, String layoutVersion, String composerPageType, Page previousPage, Integer categoryId, String nextUrl, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId) {
        return new Page(name, pageId, url, ruleId, layoutId, layoutVersion, composerPageType, previousPage, categoryId, nextUrl, tagId, sku, highlightId, sellerId, brandId, null, null, this.teensMode, 65536, null);
    }

    @InterfaceC3999a
    public final /* synthetic */ Page copy(String name, String pageId, String url, String ruleId, String layoutId, String layoutVersion, String composerPageType, Page previousPage, Integer categoryId, String nextUrl, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId, String miniapp) {
        return new Page(name, pageId, url, ruleId, layoutId, layoutVersion, composerPageType, previousPage, categoryId, nextUrl, tagId, sku, highlightId, sellerId, brandId, miniapp, (String) null, this.teensMode);
    }

    @InterfaceC3999a
    public final /* synthetic */ Page copy(String name, String pageId, String url, String ruleId, String layoutId, String layoutVersion, String composerPageType, Page previousPage, Integer categoryId, String nextUrl, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId, String miniapp, String marketplaceId) {
        return new Page(name, pageId, url, ruleId, layoutId, layoutVersion, composerPageType, previousPage, categoryId, nextUrl, tagId, sku, highlightId, sellerId, brandId, miniapp, marketplaceId, this.teensMode);
    }

    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l11, (i11 & 2048) != 0 ? null : l12, (i11 & 4096) != 0 ? null : l13, (i11 & 8192) != 0 ? null : l14, (i11 & 16384) != 0 ? null : l15, (i11 & 32768) != 0 ? null : str9, (i11 & 65536) != 0 ? null : str10, (i11 & 131072) != 0 ? null : bool);
    }

    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l11, (i11 & 2048) != 0 ? null : l12, (i11 & 4096) != 0 ? null : l13, (i11 & 8192) != 0 ? null : l14, (i11 & 16384) != 0 ? null : l15);
    }

    @InterfaceC3999a
    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15) {
        this(str, str2, str3, str4, str5, str6, str7, page, num, str8, l11, l12, l13, l14, l15, null, null, null, 65536, null);
    }

    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l11, (i11 & 2048) != 0 ? null : l12, (i11 & 4096) != 0 ? null : l13, (i11 & 8192) != 0 ? null : l14, (i11 & 16384) != 0 ? null : l15, (i11 & 32768) != 0 ? null : str9);
    }

    @InterfaceC3999a
    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9) {
        this(str, str2, str3, str4, str5, str6, str7, page, num, str8, l11, l12, l13, l14, l15, str9, (String) null, (Boolean) null);
    }

    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l11, (i11 & 2048) != 0 ? null : l12, (i11 & 4096) != 0 ? null : l13, (i11 & 8192) != 0 ? null : l14, (i11 & 16384) != 0 ? null : l15, (i11 & 32768) != 0 ? null : str9, (i11 & 65536) != 0 ? null : str10);
    }

    @InterfaceC3999a
    public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10) {
        this(str, str2, str3, str4, str5, str6, str7, page, num, str8, l11, l12, l13, l14, l15, str9, str10, (Boolean) null);
    }

    public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, Page page2, Integer num, String str8, Long l11, Long l12, Long l13, Long l14, Long l15, String str9, String str10, int i11, Object obj) {
        String str11;
        String str12;
        String str13;
        Page page3;
        Long l16;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Page page4;
        Integer num2;
        String str20;
        Long l17;
        Long l18;
        Long l19;
        Long l21;
        String str21 = (i11 & 1) != 0 ? page.name : str;
        String str22 = (i11 & 2) != 0 ? page.pageId : str2;
        String str23 = (i11 & 4) != 0 ? page.url : str3;
        String str24 = (i11 & 8) != 0 ? page.ruleId : str4;
        String str25 = (i11 & 16) != 0 ? page.layoutId : str5;
        String str26 = (i11 & 32) != 0 ? page.layoutVersion : str6;
        String str27 = (i11 & 64) != 0 ? page.composerPageType : str7;
        Page page5 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.previousPage : page2;
        Integer num3 = (i11 & 256) != 0 ? page.categoryId : num;
        String str28 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.nextUrl : str8;
        Long l22 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.tagId : l11;
        Long l23 = (i11 & 2048) != 0 ? page.sku : l12;
        Long l24 = (i11 & 4096) != 0 ? page.highlightId : l13;
        Long l25 = (i11 & 8192) != 0 ? page.sellerId : l14;
        String str29 = str21;
        Long l26 = (i11 & 16384) != 0 ? page.brandId : l15;
        String str30 = (i11 & 32768) != 0 ? page.miniapp : str9;
        if ((i11 & 65536) != 0) {
            str12 = str30;
            str11 = page.marketplaceId;
            l16 = l26;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            str17 = str25;
            str18 = str26;
            str19 = str27;
            page4 = page5;
            num2 = num3;
            str20 = str28;
            l17 = l22;
            l18 = l23;
            l19 = l24;
            l21 = l25;
            str13 = str29;
            page3 = page;
        } else {
            str11 = str10;
            str12 = str30;
            str13 = str29;
            page3 = page;
            l16 = l26;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            str17 = str25;
            str18 = str26;
            str19 = str27;
            page4 = page5;
            num2 = num3;
            str20 = str28;
            l17 = l22;
            l18 = l23;
            l19 = l24;
            l21 = l25;
        }
        return page3.copy(str13, str14, str15, str16, str17, str18, str19, page4, num2, str20, l17, l18, l19, l21, l16, str12, str11);
    }
}
