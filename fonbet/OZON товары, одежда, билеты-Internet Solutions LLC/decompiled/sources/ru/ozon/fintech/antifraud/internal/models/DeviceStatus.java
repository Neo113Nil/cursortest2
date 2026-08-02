package ru.ozon.fintech.antifraud.internal.models;

import Ak.C2436a;
import B0.C2454a;
import Cm.e;
import Ds.C2880a;
import E0.C2942q;
import J0.P;
import Kk.C3532b;
import Lh.a;
import Pk0.c;
import Pk0.f;
import Pk0.g;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bi\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001BÇ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020%\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b1\u00102J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0015\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001aHÆ\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001cHÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010x\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001cHÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020%HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\t\u0010|\u001a\u00020%HÆ\u0003J\t\u0010}\u001a\u00020%HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÐ\u0003\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020%2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0003\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u00020\u00032\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008a\u0001\u001a\u00020%HÖ\u0001J\n\u0010\u008b\u0001\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u00103R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u00103R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00105R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010KR\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u00103R\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00105R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010KR\u0016\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u00103R\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u001a\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u0016\u0010'\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010QR\u0016\u0010(\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010QR\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u001a\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bX\u0010SR\u001a\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bY\u0010SR\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bZ\u0010SR\u001a\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b[\u0010SR\u001a\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b\\\u0010SR\u001a\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\b]\u0010SR\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00105¨\u0006\u008e\u0001"}, d2 = {"Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "", "isActiveCall", "", "isActiveScreenCapture", "phoneNumber", "", "fromContacts", "fromCallLog", "fromCallLogInPeriod", "lastScreenshootTimeTs", "", "lastScreenCaptureTimeTs", "lastActiveCallTimeTs", "currentTime", "vendor", "device", "timezone", "carrierName", "carrierId", "carrierCountry", "carrierRoaming", "emulator", "location", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "ids", "", "foundApps", "", "wifiSsid", "keyboards", "isVpn", "ozonIDSessionId", "cellData", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$CellData;", "isRoot", "battery", "", "screenOn", "displayWidth", "displayHeight", "certHash", "firstLaunch", "permAccessLocation", "permCamera", "permPostNotifications", "permReadContacts", "permUseBiometric", "sessionId", "<init>", "(ZZLjava/lang/String;ZZZJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;ZILjava/lang/Boolean;IILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Z", "getPhoneNumber", "()Ljava/lang/String;", "getFromContacts", "getFromCallLog", "getFromCallLogInPeriod", "getLastScreenshootTimeTs", "()J", "getLastScreenCaptureTimeTs", "getLastActiveCallTimeTs", "getCurrentTime", "getVendor", "getDevice", "getTimezone", "getCarrierName", "getCarrierId", "getCarrierCountry", "getCarrierRoaming", "getEmulator", "getLocation", "()Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "getIds", "()Ljava/util/Map;", "getFoundApps", "()Ljava/util/List;", "getWifiSsid", "getKeyboards", "getOzonIDSessionId", "getCellData", "getBattery", "()I", "getScreenOn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayWidth", "getDisplayHeight", "getCertHash", "getFirstLaunch", "getPermAccessLocation", "getPermCamera", "getPermPostNotifications", "getPermReadContacts", "getPermUseBiometric", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(ZZLjava/lang/String;ZZZJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;ZILjava/lang/Boolean;IILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "equals", "other", "hashCode", "toString", "Location", "CellData", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceStatus {

    @i(name = "battery")
    private final int battery;

    @i(name = "carrier_country")
    @NotNull
    private final String carrierCountry;

    @i(name = "carrier_id")
    private final long carrierId;

    @i(name = "carrier")
    @NotNull
    private final String carrierName;

    @i(name = "carrier_roaming")
    private final boolean carrierRoaming;

    @i(name = "cell_data")
    private final List<CellData> cellData;

    @i(name = "cert_hash")
    private final String certHash;

    @i(name = "device_time_ts")
    private final long currentTime;

    @i(name = "device")
    @NotNull
    private final String device;

    @i(name = "display_height")
    private final int displayHeight;

    @i(name = "display_width")
    private final int displayWidth;

    @i(name = "emulator")
    private final boolean emulator;

    @i(name = "first_launch")
    private final Boolean firstLaunch;

    @i(name = "found_apps")
    @NotNull
    private final List<String> foundApps;

    @i(name = "from_call_log")
    private final boolean fromCallLog;

    @i(name = "from_call_log_in_period")
    private final boolean fromCallLogInPeriod;

    @i(name = "from_contacts")
    private final boolean fromContacts;

    @i(name = "raw_ids")
    @NotNull
    private final Map<String, String> ids;

    @i(name = "call")
    private final boolean isActiveCall;

    @i(name = "capt")
    private final boolean isActiveScreenCapture;

    @i(name = "is_root")
    private final boolean isRoot;

    @i(name = "vpn")
    private final boolean isVpn;

    @i(name = "keyboards")
    private final List<String> keyboards;

    @i(name = "last_call_ts")
    private final long lastActiveCallTimeTs;

    @i(name = "last_capt_ts")
    private final long lastScreenCaptureTimeTs;

    @i(name = "last_shot_ts")
    private final long lastScreenshootTimeTs;

    @i(name = "location")
    private final Location location;

    @i(name = "ozonID_session_id")
    private final String ozonIDSessionId;

    @i(name = "perm_access_location")
    private final Boolean permAccessLocation;

    @i(name = "perm_camera")
    private final Boolean permCamera;

    @i(name = "perm_post_notifications")
    private final Boolean permPostNotifications;

    @i(name = "perm_read_contacts")
    private final Boolean permReadContacts;

    @i(name = "perm_use_biometric")
    private final Boolean permUseBiometric;

    @i(name = "caller")
    @NotNull
    private final String phoneNumber;

    @i(name = "screen_on")
    private final Boolean screenOn;

    @i(name = "session_id")
    private final String sessionId;

    @i(name = "timezone")
    @NotNull
    private final String timezone;

    @i(name = "vendor")
    @NotNull
    private final String vendor;

    @i(name = "wifi_ssid")
    private final String wifiSsid;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$Location;", "", "lat", "", "lon", "accuracy", "", "source", "", "<init>", "(DDILjava/lang/String;)V", "getLat", "()D", "getLon", "getAccuracy", "()I", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Location {

        @i(name = "accuracy")
        private final int accuracy;

        @i(name = "lat")
        private final double lat;

        @i(name = "lon")
        private final double lon;

        @i(name = "geo_source")
        @NotNull
        private final String source;

        public Location(double d11, double d12, int i11, @NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.lat = d11;
            this.lon = d12;
            this.accuracy = i11;
            this.source = source;
        }

        public static /* synthetic */ Location copy$default(Location location, double d11, double d12, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d11 = location.lat;
            }
            double d13 = d11;
            if ((i12 & 2) != 0) {
                d12 = location.lon;
            }
            double d14 = d12;
            if ((i12 & 4) != 0) {
                i11 = location.accuracy;
            }
            int i13 = i11;
            if ((i12 & 8) != 0) {
                str = location.source;
            }
            return location.copy(d13, d14, i13, str);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLon() {
            return this.lon;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAccuracy() {
            return this.accuracy;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final Location copy(double lat, double lon, int accuracy, @NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Location(lat, lon, accuracy, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Location)) {
                return false;
            }
            Location location = (Location) other;
            return Double.compare(this.lat, location.lat) == 0 && Double.compare(this.lon, location.lon) == 0 && this.accuracy == location.accuracy && Intrinsics.d(this.source, location.source);
        }

        public final int getAccuracy() {
            return this.accuracy;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLon() {
            return this.lon;
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + C2454a.a(this.accuracy, g.a(Double.hashCode(this.lat) * 31, 31, this.lon), 31);
        }

        @NotNull
        public String toString() {
            double d11 = this.lat;
            double d12 = this.lon;
            int i11 = this.accuracy;
            String str = this.source;
            StringBuilder e11 = e.e(d11, "Location(lat=", ", lon=");
            e11.append(d12);
            e11.append(", accuracy=");
            e11.append(i11);
            return C6594f.a(", source=", str, ")", e11);
        }
    }

    public DeviceStatus() {
        this(false, false, null, false, false, false, 0L, 0L, 0L, 0L, null, null, null, null, 0L, null, false, false, null, null, null, null, null, false, null, null, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, -1, 127, null);
    }

    public static /* synthetic */ DeviceStatus copy$default(DeviceStatus deviceStatus, boolean z11, boolean z12, String str, boolean z13, boolean z14, boolean z15, long j11, long j12, long j13, long j14, String str2, String str3, String str4, String str5, long j15, String str6, boolean z16, boolean z17, Location location, Map map, List list, String str7, List list2, boolean z18, String str8, List list3, boolean z19, int i11, Boolean bool, int i12, int i13, String str9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str10, int i14, int i15, Object obj) {
        String str11;
        Boolean bool8;
        List list4;
        boolean z21;
        String str12;
        List list5;
        boolean z22;
        int i16;
        Boolean bool9;
        int i17;
        int i18;
        String str13;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        boolean z23;
        long j16;
        String str14;
        String str15;
        String str16;
        String str17;
        long j17;
        String str18;
        boolean z24;
        Location location2;
        Map map2;
        List list6;
        String str19;
        boolean z25;
        String str20;
        boolean z26;
        boolean z27;
        boolean z28;
        long j18;
        long j19;
        long j21;
        boolean z29 = (i14 & 1) != 0 ? deviceStatus.isActiveCall : z11;
        boolean z31 = (i14 & 2) != 0 ? deviceStatus.isActiveScreenCapture : z12;
        String str21 = (i14 & 4) != 0 ? deviceStatus.phoneNumber : str;
        boolean z32 = (i14 & 8) != 0 ? deviceStatus.fromContacts : z13;
        boolean z33 = (i14 & 16) != 0 ? deviceStatus.fromCallLog : z14;
        boolean z34 = (i14 & 32) != 0 ? deviceStatus.fromCallLogInPeriod : z15;
        long j22 = (i14 & 64) != 0 ? deviceStatus.lastScreenshootTimeTs : j11;
        long j23 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? deviceStatus.lastScreenCaptureTimeTs : j12;
        long j24 = (i14 & 256) != 0 ? deviceStatus.lastActiveCallTimeTs : j13;
        long j25 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? deviceStatus.currentTime : j14;
        boolean z35 = z29;
        String str22 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? deviceStatus.vendor : str2;
        String str23 = (i14 & 2048) != 0 ? deviceStatus.device : str3;
        String str24 = (i14 & 4096) != 0 ? deviceStatus.timezone : str4;
        String str25 = (i14 & 8192) != 0 ? deviceStatus.carrierName : str5;
        long j26 = (i14 & 16384) != 0 ? deviceStatus.carrierId : j15;
        String str26 = (i14 & 32768) != 0 ? deviceStatus.carrierCountry : str6;
        boolean z36 = (i14 & 65536) != 0 ? deviceStatus.carrierRoaming : z16;
        String str27 = str26;
        boolean z37 = (i14 & 131072) != 0 ? deviceStatus.emulator : z17;
        Location location3 = (i14 & 262144) != 0 ? deviceStatus.location : location;
        Map map3 = (i14 & 524288) != 0 ? deviceStatus.ids : map;
        List list7 = (i14 & 1048576) != 0 ? deviceStatus.foundApps : list;
        String str28 = (i14 & 2097152) != 0 ? deviceStatus.wifiSsid : str7;
        List list8 = (i14 & 4194304) != 0 ? deviceStatus.keyboards : list2;
        boolean z38 = (i14 & 8388608) != 0 ? deviceStatus.isVpn : z18;
        String str29 = (i14 & 16777216) != 0 ? deviceStatus.ozonIDSessionId : str8;
        List list9 = (i14 & 33554432) != 0 ? deviceStatus.cellData : list3;
        boolean z39 = (i14 & 67108864) != 0 ? deviceStatus.isRoot : z19;
        int i19 = (i14 & 134217728) != 0 ? deviceStatus.battery : i11;
        Boolean bool15 = (i14 & 268435456) != 0 ? deviceStatus.screenOn : bool;
        int i21 = (i14 & 536870912) != 0 ? deviceStatus.displayWidth : i12;
        int i22 = (i14 & 1073741824) != 0 ? deviceStatus.displayHeight : i13;
        String str30 = (i14 & LinearLayoutManager.INVALID_OFFSET) != 0 ? deviceStatus.certHash : str9;
        Boolean bool16 = (i15 & 1) != 0 ? deviceStatus.firstLaunch : bool2;
        Boolean bool17 = (i15 & 2) != 0 ? deviceStatus.permAccessLocation : bool3;
        Boolean bool18 = (i15 & 4) != 0 ? deviceStatus.permCamera : bool4;
        Boolean bool19 = (i15 & 8) != 0 ? deviceStatus.permPostNotifications : bool5;
        Boolean bool20 = (i15 & 16) != 0 ? deviceStatus.permReadContacts : bool6;
        Boolean bool21 = (i15 & 32) != 0 ? deviceStatus.permUseBiometric : bool7;
        if ((i15 & 64) != 0) {
            bool8 = bool21;
            str11 = deviceStatus.sessionId;
            z21 = z38;
            str12 = str29;
            list5 = list9;
            z22 = z39;
            i16 = i19;
            bool9 = bool15;
            i17 = i21;
            i18 = i22;
            str13 = str30;
            bool10 = bool16;
            bool11 = bool17;
            bool12 = bool18;
            bool13 = bool19;
            bool14 = bool20;
            z23 = z36;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            str17 = str25;
            j17 = j26;
            str18 = str27;
            z24 = z37;
            location2 = location3;
            map2 = map3;
            list6 = list7;
            str19 = str28;
            list4 = list8;
            z25 = z31;
            str20 = str21;
            z26 = z32;
            z27 = z33;
            z28 = z34;
            j18 = j22;
            j19 = j23;
            j21 = j24;
            j16 = j25;
        } else {
            str11 = str10;
            bool8 = bool21;
            list4 = list8;
            z21 = z38;
            str12 = str29;
            list5 = list9;
            z22 = z39;
            i16 = i19;
            bool9 = bool15;
            i17 = i21;
            i18 = i22;
            str13 = str30;
            bool10 = bool16;
            bool11 = bool17;
            bool12 = bool18;
            bool13 = bool19;
            bool14 = bool20;
            z23 = z36;
            j16 = j25;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            str17 = str25;
            j17 = j26;
            str18 = str27;
            z24 = z37;
            location2 = location3;
            map2 = map3;
            list6 = list7;
            str19 = str28;
            z25 = z31;
            str20 = str21;
            z26 = z32;
            z27 = z33;
            z28 = z34;
            j18 = j22;
            j19 = j23;
            j21 = j24;
        }
        return deviceStatus.copy(z35, z25, str20, z26, z27, z28, j18, j19, j21, j16, str14, str15, str16, str17, j17, str18, z23, z24, location2, map2, list6, str19, list4, z21, str12, list5, z22, i16, bool9, i17, i18, str13, bool10, bool11, bool12, bool13, bool14, bool8, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsActiveCall() {
        return this.isActiveCall;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getCarrierName() {
        return this.carrierName;
    }

    /* renamed from: component15, reason: from getter */
    public final long getCarrierId() {
        return this.carrierId;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getCarrierCountry() {
        return this.carrierCountry;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getCarrierRoaming() {
        return this.carrierRoaming;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getEmulator() {
        return this.emulator;
    }

    /* renamed from: component19, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActiveScreenCapture() {
        return this.isActiveScreenCapture;
    }

    @NotNull
    public final Map<String, String> component20() {
        return this.ids;
    }

    @NotNull
    public final List<String> component21() {
        return this.foundApps;
    }

    /* renamed from: component22, reason: from getter */
    public final String getWifiSsid() {
        return this.wifiSsid;
    }

    public final List<String> component23() {
        return this.keyboards;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsVpn() {
        return this.isVpn;
    }

    /* renamed from: component25, reason: from getter */
    public final String getOzonIDSessionId() {
        return this.ozonIDSessionId;
    }

    public final List<CellData> component26() {
        return this.cellData;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    /* renamed from: component28, reason: from getter */
    public final int getBattery() {
        return this.battery;
    }

    /* renamed from: component29, reason: from getter */
    public final Boolean getScreenOn() {
        return this.screenOn;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component30, reason: from getter */
    public final int getDisplayWidth() {
        return this.displayWidth;
    }

    /* renamed from: component31, reason: from getter */
    public final int getDisplayHeight() {
        return this.displayHeight;
    }

    /* renamed from: component32, reason: from getter */
    public final String getCertHash() {
        return this.certHash;
    }

    /* renamed from: component33, reason: from getter */
    public final Boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    /* renamed from: component34, reason: from getter */
    public final Boolean getPermAccessLocation() {
        return this.permAccessLocation;
    }

    /* renamed from: component35, reason: from getter */
    public final Boolean getPermCamera() {
        return this.permCamera;
    }

    /* renamed from: component36, reason: from getter */
    public final Boolean getPermPostNotifications() {
        return this.permPostNotifications;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getPermReadContacts() {
        return this.permReadContacts;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getPermUseBiometric() {
        return this.permUseBiometric;
    }

    /* renamed from: component39, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFromContacts() {
        return this.fromContacts;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFromCallLog() {
        return this.fromCallLog;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFromCallLogInPeriod() {
        return this.fromCallLogInPeriod;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastScreenshootTimeTs() {
        return this.lastScreenshootTimeTs;
    }

    /* renamed from: component8, reason: from getter */
    public final long getLastScreenCaptureTimeTs() {
        return this.lastScreenCaptureTimeTs;
    }

    /* renamed from: component9, reason: from getter */
    public final long getLastActiveCallTimeTs() {
        return this.lastActiveCallTimeTs;
    }

    @NotNull
    public final DeviceStatus copy(boolean isActiveCall, boolean isActiveScreenCapture, @NotNull String phoneNumber, boolean fromContacts, boolean fromCallLog, boolean fromCallLogInPeriod, long lastScreenshootTimeTs, long lastScreenCaptureTimeTs, long lastActiveCallTimeTs, long currentTime, @NotNull String vendor, @NotNull String device, @NotNull String timezone, @NotNull String carrierName, long carrierId, @NotNull String carrierCountry, boolean carrierRoaming, boolean emulator, Location location, @NotNull Map<String, String> ids, @NotNull List<String> foundApps, String wifiSsid, List<String> keyboards, boolean isVpn, String ozonIDSessionId, List<CellData> cellData, boolean isRoot, int battery, Boolean screenOn, int displayWidth, int displayHeight, String certHash, Boolean firstLaunch, Boolean permAccessLocation, Boolean permCamera, Boolean permPostNotifications, Boolean permReadContacts, Boolean permUseBiometric, String sessionId) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(carrierCountry, "carrierCountry");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(foundApps, "foundApps");
        return new DeviceStatus(isActiveCall, isActiveScreenCapture, phoneNumber, fromContacts, fromCallLog, fromCallLogInPeriod, lastScreenshootTimeTs, lastScreenCaptureTimeTs, lastActiveCallTimeTs, currentTime, vendor, device, timezone, carrierName, carrierId, carrierCountry, carrierRoaming, emulator, location, ids, foundApps, wifiSsid, keyboards, isVpn, ozonIDSessionId, cellData, isRoot, battery, screenOn, displayWidth, displayHeight, certHash, firstLaunch, permAccessLocation, permCamera, permPostNotifications, permReadContacts, permUseBiometric, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) other;
        return this.isActiveCall == deviceStatus.isActiveCall && this.isActiveScreenCapture == deviceStatus.isActiveScreenCapture && Intrinsics.d(this.phoneNumber, deviceStatus.phoneNumber) && this.fromContacts == deviceStatus.fromContacts && this.fromCallLog == deviceStatus.fromCallLog && this.fromCallLogInPeriod == deviceStatus.fromCallLogInPeriod && this.lastScreenshootTimeTs == deviceStatus.lastScreenshootTimeTs && this.lastScreenCaptureTimeTs == deviceStatus.lastScreenCaptureTimeTs && this.lastActiveCallTimeTs == deviceStatus.lastActiveCallTimeTs && this.currentTime == deviceStatus.currentTime && Intrinsics.d(this.vendor, deviceStatus.vendor) && Intrinsics.d(this.device, deviceStatus.device) && Intrinsics.d(this.timezone, deviceStatus.timezone) && Intrinsics.d(this.carrierName, deviceStatus.carrierName) && this.carrierId == deviceStatus.carrierId && Intrinsics.d(this.carrierCountry, deviceStatus.carrierCountry) && this.carrierRoaming == deviceStatus.carrierRoaming && this.emulator == deviceStatus.emulator && Intrinsics.d(this.location, deviceStatus.location) && Intrinsics.d(this.ids, deviceStatus.ids) && Intrinsics.d(this.foundApps, deviceStatus.foundApps) && Intrinsics.d(this.wifiSsid, deviceStatus.wifiSsid) && Intrinsics.d(this.keyboards, deviceStatus.keyboards) && this.isVpn == deviceStatus.isVpn && Intrinsics.d(this.ozonIDSessionId, deviceStatus.ozonIDSessionId) && Intrinsics.d(this.cellData, deviceStatus.cellData) && this.isRoot == deviceStatus.isRoot && this.battery == deviceStatus.battery && Intrinsics.d(this.screenOn, deviceStatus.screenOn) && this.displayWidth == deviceStatus.displayWidth && this.displayHeight == deviceStatus.displayHeight && Intrinsics.d(this.certHash, deviceStatus.certHash) && Intrinsics.d(this.firstLaunch, deviceStatus.firstLaunch) && Intrinsics.d(this.permAccessLocation, deviceStatus.permAccessLocation) && Intrinsics.d(this.permCamera, deviceStatus.permCamera) && Intrinsics.d(this.permPostNotifications, deviceStatus.permPostNotifications) && Intrinsics.d(this.permReadContacts, deviceStatus.permReadContacts) && Intrinsics.d(this.permUseBiometric, deviceStatus.permUseBiometric) && Intrinsics.d(this.sessionId, deviceStatus.sessionId);
    }

    public final int getBattery() {
        return this.battery;
    }

    @NotNull
    public final String getCarrierCountry() {
        return this.carrierCountry;
    }

    public final long getCarrierId() {
        return this.carrierId;
    }

    @NotNull
    public final String getCarrierName() {
        return this.carrierName;
    }

    public final boolean getCarrierRoaming() {
        return this.carrierRoaming;
    }

    public final List<CellData> getCellData() {
        return this.cellData;
    }

    public final String getCertHash() {
        return this.certHash;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    public final String getDevice() {
        return this.device;
    }

    public final int getDisplayHeight() {
        return this.displayHeight;
    }

    public final int getDisplayWidth() {
        return this.displayWidth;
    }

    public final boolean getEmulator() {
        return this.emulator;
    }

    public final Boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    @NotNull
    public final List<String> getFoundApps() {
        return this.foundApps;
    }

    public final boolean getFromCallLog() {
        return this.fromCallLog;
    }

    public final boolean getFromCallLogInPeriod() {
        return this.fromCallLogInPeriod;
    }

    public final boolean getFromContacts() {
        return this.fromContacts;
    }

    @NotNull
    public final Map<String, String> getIds() {
        return this.ids;
    }

    public final List<String> getKeyboards() {
        return this.keyboards;
    }

    public final long getLastActiveCallTimeTs() {
        return this.lastActiveCallTimeTs;
    }

    public final long getLastScreenCaptureTimeTs() {
        return this.lastScreenCaptureTimeTs;
    }

    public final long getLastScreenshootTimeTs() {
        return this.lastScreenshootTimeTs;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final String getOzonIDSessionId() {
        return this.ozonIDSessionId;
    }

    public final Boolean getPermAccessLocation() {
        return this.permAccessLocation;
    }

    public final Boolean getPermCamera() {
        return this.permCamera;
    }

    public final Boolean getPermPostNotifications() {
        return this.permPostNotifications;
    }

    public final Boolean getPermReadContacts() {
        return this.permReadContacts;
    }

    public final Boolean getPermUseBiometric() {
        return this.permUseBiometric;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Boolean getScreenOn() {
        return this.screenOn;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    @NotNull
    public final String getVendor() {
        return this.vendor;
    }

    public final String getWifiSsid() {
        return this.wifiSsid;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a(G.g.a(c.a(G.g.a(G.g.a(G.g.a(G.g.a(c.a(c.a(c.a(c.a(C3532b.a(C3532b.a(C3532b.a(G.g.a(C3532b.a(Boolean.hashCode(this.isActiveCall) * 31, 31, this.isActiveScreenCapture), 31, this.phoneNumber), 31, this.fromContacts), 31, this.fromCallLog), 31, this.fromCallLogInPeriod), 31, this.lastScreenshootTimeTs), 31, this.lastScreenCaptureTimeTs), 31, this.lastActiveCallTimeTs), 31, this.currentTime), 31, this.vendor), 31, this.device), 31, this.timezone), 31, this.carrierName), 31, this.carrierId), 31, this.carrierCountry), 31, this.carrierRoaming), 31, this.emulator);
        Location location = this.location;
        int b11 = G.g.b(D40.c.a(this.ids, (a11 + (location == null ? 0 : location.hashCode())) * 31, 31), 31, this.foundApps);
        String str = this.wifiSsid;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.keyboards;
        int a12 = C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.isVpn);
        String str2 = this.ozonIDSessionId;
        int hashCode2 = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CellData> list2 = this.cellData;
        int a13 = C2454a.a(this.battery, C3532b.a((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isRoot), 31);
        Boolean bool = this.screenOn;
        int a14 = C2454a.a(this.displayHeight, C2454a.a(this.displayWidth, (a13 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
        String str3 = this.certHash;
        int hashCode3 = (a14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.firstLaunch;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.permAccessLocation;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.permCamera;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.permPostNotifications;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.permReadContacts;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.permUseBiometric;
        int hashCode9 = (hashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str4 = this.sessionId;
        return hashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isActiveCall() {
        return this.isActiveCall;
    }

    public final boolean isActiveScreenCapture() {
        return this.isActiveScreenCapture;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final boolean isVpn() {
        return this.isVpn;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isActiveCall;
        boolean z12 = this.isActiveScreenCapture;
        String str = this.phoneNumber;
        boolean z13 = this.fromContacts;
        boolean z14 = this.fromCallLog;
        boolean z15 = this.fromCallLogInPeriod;
        long j11 = this.lastScreenshootTimeTs;
        long j12 = this.lastScreenCaptureTimeTs;
        long j13 = this.lastActiveCallTimeTs;
        long j14 = this.currentTime;
        String str2 = this.vendor;
        String str3 = this.device;
        String str4 = this.timezone;
        String str5 = this.carrierName;
        long j15 = this.carrierId;
        String str6 = this.carrierCountry;
        boolean z16 = this.carrierRoaming;
        boolean z17 = this.emulator;
        Location location = this.location;
        Map<String, String> map = this.ids;
        List<String> list = this.foundApps;
        String str7 = this.wifiSsid;
        List<String> list2 = this.keyboards;
        boolean z18 = this.isVpn;
        String str8 = this.ozonIDSessionId;
        List<CellData> list3 = this.cellData;
        boolean z19 = this.isRoot;
        int i11 = this.battery;
        Boolean bool = this.screenOn;
        int i12 = this.displayWidth;
        int i13 = this.displayHeight;
        String str9 = this.certHash;
        Boolean bool2 = this.firstLaunch;
        Boolean bool3 = this.permAccessLocation;
        Boolean bool4 = this.permCamera;
        Boolean bool5 = this.permPostNotifications;
        Boolean bool6 = this.permReadContacts;
        Boolean bool7 = this.permUseBiometric;
        String str10 = this.sessionId;
        StringBuilder d11 = a.d("DeviceStatus(isActiveCall=", ", isActiveScreenCapture=", ", phoneNumber=", z11, z12);
        C2880a.c(str, ", fromContacts=", ", fromCallLog=", d11, z13);
        f.c(", fromCallLogInPeriod=", ", lastScreenshootTimeTs=", d11, z14, z15);
        d11.append(j11);
        C2942q.f(d11, ", lastScreenCaptureTimeTs=", j12, ", lastActiveCallTimeTs=");
        d11.append(j13);
        C2942q.f(d11, ", currentTime=", j14, ", vendor=");
        Nh.a.h(d11, str2, ", device=", str3, ", timezone=");
        Nh.a.h(d11, str4, ", carrierName=", str5, ", carrierId=");
        d11.append(j15);
        d11.append(", carrierCountry=");
        d11.append(str6);
        C2436a.e(", carrierRoaming=", ", emulator=", d11, z16, z17);
        d11.append(", location=");
        d11.append(location);
        d11.append(", ids=");
        d11.append(map);
        d11.append(", foundApps=");
        d11.append(list);
        d11.append(", wifiSsid=");
        d11.append(str7);
        AZ.c.c(d11, ", keyboards=", list2, ", isVpn=", z18);
        Nh.a.g(", ozonIDSessionId=", str8, ", cellData=", d11, list3);
        d11.append(", isRoot=");
        d11.append(z19);
        d11.append(", battery=");
        d11.append(i11);
        d11.append(", screenOn=");
        d11.append(bool);
        d11.append(", displayWidth=");
        d11.append(i12);
        d11.append(", displayHeight=");
        d11.append(i13);
        d11.append(", certHash=");
        d11.append(str9);
        d11.append(", firstLaunch=");
        d11.append(bool2);
        d11.append(", permAccessLocation=");
        d11.append(bool3);
        d11.append(", permCamera=");
        d11.append(bool4);
        d11.append(", permPostNotifications=");
        d11.append(bool5);
        d11.append(", permReadContacts=");
        d11.append(bool6);
        d11.append(", permUseBiometric=");
        d11.append(bool7);
        return C6594f.a(", sessionId=", str10, ")", d11);
    }

    public DeviceStatus(boolean z11, boolean z12, @NotNull String phoneNumber, boolean z13, boolean z14, boolean z15, long j11, long j12, long j13, long j14, @NotNull String vendor, @NotNull String device, @NotNull String timezone, @NotNull String carrierName, long j15, @NotNull String carrierCountry, boolean z16, boolean z17, Location location, @NotNull Map<String, String> ids, @NotNull List<String> foundApps, String str, List<String> list, boolean z18, String str2, List<CellData> list2, boolean z19, int i11, Boolean bool, int i12, int i13, String str3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str4) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(carrierCountry, "carrierCountry");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(foundApps, "foundApps");
        this.isActiveCall = z11;
        this.isActiveScreenCapture = z12;
        this.phoneNumber = phoneNumber;
        this.fromContacts = z13;
        this.fromCallLog = z14;
        this.fromCallLogInPeriod = z15;
        this.lastScreenshootTimeTs = j11;
        this.lastScreenCaptureTimeTs = j12;
        this.lastActiveCallTimeTs = j13;
        this.currentTime = j14;
        this.vendor = vendor;
        this.device = device;
        this.timezone = timezone;
        this.carrierName = carrierName;
        this.carrierId = j15;
        this.carrierCountry = carrierCountry;
        this.carrierRoaming = z16;
        this.emulator = z17;
        this.location = location;
        this.ids = ids;
        this.foundApps = foundApps;
        this.wifiSsid = str;
        this.keyboards = list;
        this.isVpn = z18;
        this.ozonIDSessionId = str2;
        this.cellData = list2;
        this.isRoot = z19;
        this.battery = i11;
        this.screenOn = bool;
        this.displayWidth = i12;
        this.displayHeight = i13;
        this.certHash = str3;
        this.firstLaunch = bool2;
        this.permAccessLocation = bool3;
        this.permCamera = bool4;
        this.permPostNotifications = bool5;
        this.permReadContacts = bool6;
        this.permUseBiometric = bool7;
        this.sessionId = str4;
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$CellData;", "", "type", "", "id", "", "lat", "lon", "networkId", "tac", "lac", "pci", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLat", "getLon", "getNetworkId", "getTac", "getLac", "getPci", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/antifraud/internal/models/DeviceStatus$CellData;", "equals", "", "other", "hashCode", "toString", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellData {

        @i(name = "id")
        private final Integer id;

        @i(name = "lac")
        private final String lac;

        @i(name = "lat")
        private final Integer lat;

        @i(name = "lon")
        private final Integer lon;

        @i(name = "network_id")
        private final String networkId;

        @i(name = "pci")
        private final Integer pci;

        @i(name = "tac")
        private final String tac;

        @i(name = "type")
        @NotNull
        private final String type;

        public CellData(@NotNull String type, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Integer num4) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.id = num;
            this.lat = num2;
            this.lon = num3;
            this.networkId = str;
            this.tac = str2;
            this.lac = str3;
            this.pci = num4;
        }

        public static /* synthetic */ CellData copy$default(CellData cellData, String str, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellData.type;
            }
            if ((i11 & 2) != 0) {
                num = cellData.id;
            }
            if ((i11 & 4) != 0) {
                num2 = cellData.lat;
            }
            if ((i11 & 8) != 0) {
                num3 = cellData.lon;
            }
            if ((i11 & 16) != 0) {
                str2 = cellData.networkId;
            }
            if ((i11 & 32) != 0) {
                str3 = cellData.tac;
            }
            if ((i11 & 64) != 0) {
                str4 = cellData.lac;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                num4 = cellData.pci;
            }
            String str5 = str4;
            Integer num5 = num4;
            String str6 = str2;
            String str7 = str3;
            return cellData.copy(str, num, num2, num3, str6, str7, str5, num5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getLat() {
            return this.lat;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getLon() {
            return this.lon;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNetworkId() {
            return this.networkId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTac() {
            return this.tac;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLac() {
            return this.lac;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getPci() {
            return this.pci;
        }

        @NotNull
        public final CellData copy(@NotNull String type, Integer id2, Integer lat, Integer lon, String networkId, String tac, String lac, Integer pci) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new CellData(type, id2, lat, lon, networkId, tac, lac, pci);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellData)) {
                return false;
            }
            CellData cellData = (CellData) other;
            return Intrinsics.d(this.type, cellData.type) && Intrinsics.d(this.id, cellData.id) && Intrinsics.d(this.lat, cellData.lat) && Intrinsics.d(this.lon, cellData.lon) && Intrinsics.d(this.networkId, cellData.networkId) && Intrinsics.d(this.tac, cellData.tac) && Intrinsics.d(this.lac, cellData.lac) && Intrinsics.d(this.pci, cellData.pci);
        }

        public final Integer getId() {
            return this.id;
        }

        public final String getLac() {
            return this.lac;
        }

        public final Integer getLat() {
            return this.lat;
        }

        public final Integer getLon() {
            return this.lon;
        }

        public final String getNetworkId() {
            return this.networkId;
        }

        public final Integer getPci() {
            return this.pci;
        }

        public final String getTac() {
            return this.tac;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Integer num = this.id;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lat;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.lon;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str = this.networkId;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tac;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lac;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num4 = this.pci;
            return hashCode7 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            Integer num = this.id;
            Integer num2 = this.lat;
            Integer num3 = this.lon;
            String str2 = this.networkId;
            String str3 = this.tac;
            String str4 = this.lac;
            Integer num4 = this.pci;
            StringBuilder b11 = P.b("CellData(type=", str, num, ", id=", ", lat=");
            Ef0.c.e(b11, num2, ", lon=", num3, ", networkId=");
            Nh.a.h(b11, str2, ", tac=", str3, ", lac=");
            b11.append(str4);
            b11.append(", pci=");
            b11.append(num4);
            b11.append(")");
            return b11.toString();
        }

        public /* synthetic */ CellData(String str, Integer num, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, num2, num3, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num4);
        }
    }

    public DeviceStatus(boolean z11, boolean z12, String str, boolean z13, boolean z14, boolean z15, long j11, long j12, long j13, long j14, String str2, String str3, String str4, String str5, long j15, String str6, boolean z16, boolean z17, Location location, Map map, List list, String str7, List list2, boolean z18, String str8, List list3, boolean z19, int i11, Boolean bool, int i12, int i13, String str9, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str10, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? false : z12, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? 0L : j11, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j12, (i14 & 256) != 0 ? 0L : j13, (i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? j14 : 0L, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? Build.MANUFACTURER : str2, (i14 & 2048) != 0 ? Build.MODEL : str3, (i14 & 4096) != 0 ? "" : str4, (i14 & 8192) != 0 ? "" : str5, (i14 & 16384) != 0 ? -1L : j15, (32768 & i14) == 0 ? str6 : "", (65536 & i14) != 0 ? false : z16, (i14 & 131072) != 0 ? false : z17, (i14 & 262144) != 0 ? null : location, (i14 & 524288) != 0 ? U.c() : map, (i14 & 1048576) != 0 ? K.f71697a : list, (i14 & 2097152) != 0 ? null : str7, (i14 & 4194304) != 0 ? null : list2, (i14 & 8388608) != 0 ? false : z18, (i14 & 16777216) != 0 ? null : str8, (i14 & 33554432) != 0 ? null : list3, (i14 & 67108864) != 0 ? false : z19, (i14 & 134217728) != 0 ? -1 : i11, (i14 & 268435456) != 0 ? null : bool, (i14 & 536870912) != 0 ? 0 : i12, (i14 & 1073741824) != 0 ? 0 : i13, (i14 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str9, (i15 & 1) != 0 ? null : bool2, (i15 & 2) != 0 ? null : bool3, (i15 & 4) != 0 ? null : bool4, (i15 & 8) != 0 ? null : bool5, (i15 & 16) != 0 ? null : bool6, (i15 & 32) != 0 ? null : bool7, (i15 & 64) != 0 ? null : str10);
    }
}
