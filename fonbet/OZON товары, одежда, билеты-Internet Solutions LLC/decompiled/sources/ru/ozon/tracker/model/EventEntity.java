package ru.ozon.tracker.model;

import Ak.b;
import B0.A0;
import B0.C2454a;
import B4.V;
import B90.C2618u;
import C.J;
import C.o0;
import Cm.e;
import De.C2860c;
import Ek.a;
import Fj.c;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Pk0.i;
import Sc.InterfaceC3999a;
import T7.Z;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.network.serializing.date.DateTimeWithMs;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Namespace;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0015{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001B\u0085\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*Bñ\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b)\u0010+Bù\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b)\u0010,Jù\u0001\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010]J\u0083\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010^J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0002\u0010OJ\u0010\u0010r\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0002\u0010OJ\t\u0010s\u001a\u00020\u0006HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010(HÆ\u0003J\u0090\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020w2\b\u0010x\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010y\u001a\u00020$HÖ\u0001J\t\u0010z\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0015\u0010#\u001a\u0004\u0018\u00010$¢\u0006\n\n\u0002\u0010P\u001a\u0004\bN\u0010OR\u0015\u0010%\u001a\u0004\u0018\u00010$¢\u0006\n\n\u0002\u0010P\u001a\u0004\bQ\u0010OR\u001c\u0010&\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010S\u001a\u0004\bT\u00101R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR&\u0010W\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bX\u0010S\u001a\u0004\bY\u0010.\"\u0004\bZ\u0010[¨\u0006\u0088\u0001"}, d2 = {"Lru/ozon/tracker/model/EventEntity;", "", "uuid", "", "number", "timestamp", "Lorg/joda/time/DateTime;", "version", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "attributes", "Lru/ozon/tracker/model/EventEntity$Attributes;", "user", "Lru/ozon/tracker/model/EventEntity$User;", "page", "Lru/ozon/tracker/model/EventEntity$Page;", "object", "Lru/ozon/tracker/model/EventEntity$Obj;", "properties", "Lru/ozon/tracker/model/EventEntity$Properties;", "widget", "Lru/ozon/tracker/model/EventEntity$Widget;", DynamicElementDTO.FORM, "Lru/ozon/tracker/model/EventEntity$Form;", "eventError", "Lru/ozon/tracker/model/EventEntity$EventError;", "posting", "Lru/ozon/tracker/model/EventEntity$Posting;", "custom", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "filter", "Lru/ozon/tracker/model/EventEntity$Filter;", "sale", "Lru/ozon/tracker/model/EventEntity$Sale;", "review", "Lru/ozon/tracker/model/EventEntity$Review;", "discountRequestId", "", "advertisementCampaignId", "timestampMs", "courier", "Lru/ozon/tracker/model/EventEntity$Courier;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lru/ozon/tracker/model/EventEntity$Courier;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;)V", "getUuid", "()Ljava/lang/String;", "getNumber", "getTimestamp", "()Lorg/joda/time/DateTime;", "getVersion", "getActionType", "getAttributes", "()Lru/ozon/tracker/model/EventEntity$Attributes;", "getUser", "()Lru/ozon/tracker/model/EventEntity$User;", "getPage", "()Lru/ozon/tracker/model/EventEntity$Page;", "getObject", "()Lru/ozon/tracker/model/EventEntity$Obj;", "getProperties", "()Lru/ozon/tracker/model/EventEntity$Properties;", "getWidget", "()Lru/ozon/tracker/model/EventEntity$Widget;", "getForm", "()Lru/ozon/tracker/model/EventEntity$Form;", "getEventError", "()Lru/ozon/tracker/model/EventEntity$EventError;", "getPosting", "()Lru/ozon/tracker/model/EventEntity$Posting;", "getCustom", "()Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "getFilter", "()Lru/ozon/tracker/model/EventEntity$Filter;", "getSale", "()Lru/ozon/tracker/model/EventEntity$Sale;", "getReview", "()Lru/ozon/tracker/model/EventEntity$Review;", "getDiscountRequestId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdvertisementCampaignId", "getTimestampMs$annotations", "()V", "getTimestampMs", "getCourier", "()Lru/ozon/tracker/model/EventEntity$Courier;", "trackCampaignUuid", "getTrackCampaignUuid$annotations", "getTrackCampaignUuid", "setTrackCampaignUuid", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/tracker/model/EventEntity;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;)Lru/ozon/tracker/model/EventEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Attributes;Lru/ozon/tracker/model/EventEntity$User;Lru/ozon/tracker/model/EventEntity$Page;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lru/ozon/tracker/model/EventEntity$Courier;)Lru/ozon/tracker/model/EventEntity;", "equals", "", "other", "hashCode", "toString", "Page", "Attributes", "Obj", "Properties", "Widget", "User", "EventError", "Form", "Posting", "Filter", "Sale", "Review", "Courier", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EventEntity {
    private final String actionType;
    private final Integer advertisementCampaignId;
    private final Attributes attributes;
    private final Courier courier;
    private final Cell.CustomCell custom;
    private final Integer discountRequestId;
    private final EventError eventError;
    private final Filter filter;
    private final Form form;
    private final String number;
    private final Obj object;
    private final Page page;
    private final Posting posting;
    private final Properties properties;
    private final Review review;
    private final Sale sale;

    @NotNull
    private final DateTime timestamp;

    @NotNull
    private final DateTime timestampMs;
    private String trackCampaignUuid;
    private final User user;
    private final String uuid;

    @NotNull
    private final String version;
    private final Widget widget;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016B\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0017B}\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0018Bq\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0019J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007J\u008e\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007J\u009f\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¬\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\u0007J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0007HÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001d¨\u0006L"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Attributes;", "Landroid/os/Parcelable;", "namespace", "Lru/ozon/tracker/sendEvent/Namespace;", "appVersion", "", "buildNumber", "", "screenResolutionX", "screenResolutionY", "domainName", "platform", "deviceType", "osVersion", "deviceModel", "mobileDeviceModel", "platformStore", "theme", "screenDensity", "", "userAgent", "<init>", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)V", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Lru/ozon/tracker/sendEvent/Namespace;", "getAppVersion", "()Ljava/lang/String;", "getBuildNumber", "()I", "getScreenResolutionX", "getScreenResolutionY", "getDomainName", "getPlatform", "getDeviceType", "getOsVersion", "getDeviceModel", "getMobileDeviceModel", "getPlatformStore", "getTheme", "getScreenDensity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getUserAgent", "copy", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/tracker/model/EventEntity$Attributes;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Attributes;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Attributes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @NotNull
        private final String appVersion;
        private final int buildNumber;

        @NotNull
        private final String deviceModel;

        @NotNull
        private final String deviceType;

        @NotNull
        private final String domainName;

        @NotNull
        private final String mobileDeviceModel;

        @NotNull
        private final Namespace namespace;

        @NotNull
        private final String osVersion;

        @NotNull
        private final String platform;
        private final String platformStore;
        private final Float screenDensity;
        private final int screenResolutionX;
        private final int screenResolutionY;
        private final String theme;
        private final String userAgent;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(Namespace.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(@NotNull Namespace namespace, @NotNull String appVersion, int i11, int i12, int i13, @NotNull String domainName, @NotNull String platform, @NotNull String deviceType, @NotNull String osVersion, @NotNull String deviceModel, @NotNull String mobileDeviceModel, String str, String str2, Float f7, String str3) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
            this.namespace = namespace;
            this.appVersion = appVersion;
            this.buildNumber = i11;
            this.screenResolutionX = i12;
            this.screenResolutionY = i13;
            this.domainName = domainName;
            this.platform = platform;
            this.deviceType = deviceType;
            this.osVersion = osVersion;
            this.deviceModel = deviceModel;
            this.mobileDeviceModel = mobileDeviceModel;
            this.platformStore = str;
            this.theme = str2;
            this.screenDensity = f7;
            this.userAgent = str3;
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Namespace getNamespace() {
            return this.namespace;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        /* renamed from: component11, reason: from getter */
        public final String getMobileDeviceModel() {
            return this.mobileDeviceModel;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPlatformStore() {
            return this.platformStore;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTheme() {
            return this.theme;
        }

        /* renamed from: component14, reason: from getter */
        public final Float getScreenDensity() {
            return this.screenDensity;
        }

        /* renamed from: component15, reason: from getter */
        public final String getUserAgent() {
            return this.userAgent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBuildNumber() {
            return this.buildNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final int getScreenResolutionX() {
            return this.screenResolutionX;
        }

        /* renamed from: component5, reason: from getter */
        public final int getScreenResolutionY() {
            return this.screenResolutionY;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getDomainName() {
            return this.domainName;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final String getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final String getOsVersion() {
            return this.osVersion;
        }

        @NotNull
        public final Attributes copy(@NotNull Namespace namespace, @NotNull String appVersion, int buildNumber, int screenResolutionX, int screenResolutionY, @NotNull String domainName, @NotNull String platform, @NotNull String deviceType, @NotNull String osVersion, @NotNull String deviceModel, @NotNull String mobileDeviceModel, String platformStore, String theme, Float screenDensity, String userAgent) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
            return new Attributes(namespace, appVersion, buildNumber, screenResolutionX, screenResolutionY, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, platformStore, theme, screenDensity, userAgent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) other;
            return this.namespace == attributes.namespace && Intrinsics.d(this.appVersion, attributes.appVersion) && this.buildNumber == attributes.buildNumber && this.screenResolutionX == attributes.screenResolutionX && this.screenResolutionY == attributes.screenResolutionY && Intrinsics.d(this.domainName, attributes.domainName) && Intrinsics.d(this.platform, attributes.platform) && Intrinsics.d(this.deviceType, attributes.deviceType) && Intrinsics.d(this.osVersion, attributes.osVersion) && Intrinsics.d(this.deviceModel, attributes.deviceModel) && Intrinsics.d(this.mobileDeviceModel, attributes.mobileDeviceModel) && Intrinsics.d(this.platformStore, attributes.platformStore) && Intrinsics.d(this.theme, attributes.theme) && Intrinsics.d(this.screenDensity, attributes.screenDensity) && Intrinsics.d(this.userAgent, attributes.userAgent);
        }

        @NotNull
        public final String getAppVersion() {
            return this.appVersion;
        }

        public final int getBuildNumber() {
            return this.buildNumber;
        }

        @NotNull
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        public final String getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public final String getDomainName() {
            return this.domainName;
        }

        @NotNull
        public final String getMobileDeviceModel() {
            return this.mobileDeviceModel;
        }

        @NotNull
        public final Namespace getNamespace() {
            return this.namespace;
        }

        @NotNull
        public final String getOsVersion() {
            return this.osVersion;
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }

        public final String getPlatformStore() {
            return this.platformStore;
        }

        public final Float getScreenDensity() {
            return this.screenDensity;
        }

        public final int getScreenResolutionX() {
            return this.screenResolutionX;
        }

        public final int getScreenResolutionY() {
            return this.screenResolutionY;
        }

        public final String getTheme() {
            return this.theme;
        }

        public final String getUserAgent() {
            return this.userAgent;
        }

        public int hashCode() {
            int a11 = g.a(g.a(g.a(g.a(g.a(g.a(C2454a.a(this.screenResolutionY, C2454a.a(this.screenResolutionX, C2454a.a(this.buildNumber, g.a(this.namespace.hashCode() * 31, 31, this.appVersion), 31), 31), 31), 31, this.domainName), 31, this.platform), 31, this.deviceType), 31, this.osVersion), 31, this.deviceModel), 31, this.mobileDeviceModel);
            String str = this.platformStore;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.theme;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Float f7 = this.screenDensity;
            int hashCode3 = (hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
            String str3 = this.userAgent;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Namespace namespace = this.namespace;
            String str = this.appVersion;
            int i11 = this.buildNumber;
            int i12 = this.screenResolutionX;
            int i13 = this.screenResolutionY;
            String str2 = this.domainName;
            String str3 = this.platform;
            String str4 = this.deviceType;
            String str5 = this.osVersion;
            String str6 = this.deviceModel;
            String str7 = this.mobileDeviceModel;
            String str8 = this.platformStore;
            String str9 = this.theme;
            Float f7 = this.screenDensity;
            String str10 = this.userAgent;
            StringBuilder sb2 = new StringBuilder("Attributes(namespace=");
            sb2.append(namespace);
            sb2.append(", appVersion=");
            sb2.append(str);
            sb2.append(", buildNumber=");
            a.f(i11, i12, ", screenResolutionX=", ", screenResolutionY=", sb2);
            i.c(i13, ", domainName=", str2, ", platform=", sb2);
            Nh.a.h(sb2, str3, ", deviceType=", str4, ", osVersion=");
            Nh.a.h(sb2, str5, ", deviceModel=", str6, ", mobileDeviceModel=");
            Nh.a.h(sb2, str7, ", platformStore=", str8, ", theme=");
            sb2.append(str9);
            sb2.append(", screenDensity=");
            sb2.append(f7);
            sb2.append(", userAgent=");
            return o0.c(sb2, str10, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.namespace.name());
            dest.writeString(this.appVersion);
            dest.writeInt(this.buildNumber);
            dest.writeInt(this.screenResolutionX);
            dest.writeInt(this.screenResolutionY);
            dest.writeString(this.domainName);
            dest.writeString(this.platform);
            dest.writeString(this.deviceType);
            dest.writeString(this.osVersion);
            dest.writeString(this.deviceModel);
            dest.writeString(this.mobileDeviceModel);
            dest.writeString(this.platformStore);
            dest.writeString(this.theme);
            Float f7 = this.screenDensity;
            if (f7 == null) {
                dest.writeInt(0);
            } else {
                Om.b(dest, 1, f7);
            }
            dest.writeString(this.userAgent);
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                namespace = attributes.namespace;
            }
            if ((i14 & 2) != 0) {
                str = attributes.appVersion;
            }
            if ((i14 & 4) != 0) {
                i11 = attributes.buildNumber;
            }
            if ((i14 & 8) != 0) {
                i12 = attributes.screenResolutionX;
            }
            if ((i14 & 16) != 0) {
                i13 = attributes.screenResolutionY;
            }
            if ((i14 & 32) != 0) {
                str2 = attributes.domainName;
            }
            if ((i14 & 64) != 0) {
                str3 = attributes.platform;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = attributes.deviceType;
            }
            if ((i14 & 256) != 0) {
                str5 = attributes.osVersion;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str6 = attributes.deviceModel;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str7 = attributes.mobileDeviceModel;
            }
            if ((i14 & 2048) != 0) {
                str8 = attributes.platformStore;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            String str13 = str3;
            String str14 = str4;
            int i15 = i13;
            String str15 = str2;
            return attributes.copy(namespace, str, i11, i12, i15, str15, str13, str14, str11, str12, str9, str10);
        }

        @InterfaceC3999a
        public final /* synthetic */ Attributes copy(Namespace namespace, String appVersion, int buildNumber, int screenResolutionX, int screenResolutionY, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String platformStore) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
            return new Attributes(namespace, appVersion, buildNumber, screenResolutionX, screenResolutionY, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, platformStore, null, null, null, 28672, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ Attributes copy(Namespace namespace, String appVersion, int buildNumber, int screenResolutionX, int screenResolutionY, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String platformStore, String theme) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
            return new Attributes(namespace, appVersion, buildNumber, screenResolutionX, screenResolutionY, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, platformStore, theme, null, null, 24576, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ Attributes copy(Namespace namespace, String appVersion, int buildNumber, int screenResolutionX, int screenResolutionY, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String platformStore, String theme, Float screenDensity) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
            return new Attributes(namespace, appVersion, buildNumber, screenResolutionX, screenResolutionY, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, platformStore, theme, screenDensity, null, 16384, null);
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                namespace = attributes.namespace;
            }
            return attributes.copy(namespace, (i14 & 2) != 0 ? attributes.appVersion : str, (i14 & 4) != 0 ? attributes.buildNumber : i11, (i14 & 8) != 0 ? attributes.screenResolutionX : i12, (i14 & 16) != 0 ? attributes.screenResolutionY : i13, (i14 & 32) != 0 ? attributes.domainName : str2, (i14 & 64) != 0 ? attributes.platform : str3, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? attributes.deviceType : str4, (i14 & 256) != 0 ? attributes.osVersion : str5, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? attributes.deviceModel : str6, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? attributes.mobileDeviceModel : str7, (i14 & 2048) != 0 ? attributes.platformStore : str8, (i14 & 4096) != 0 ? attributes.theme : str9);
        }

        public /* synthetic */ Attributes(Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Float f7, String str10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(namespace, str, i11, i12, i13, (i14 & 32) != 0 ? "ozon.ru" : str2, (i14 & 64) != 0 ? "android" : str3, str4, str5, str6, str7, (i14 & 2048) != 0 ? null : str8, (i14 & 4096) != 0 ? null : str9, (i14 & 8192) != 0 ? null : f7, (i14 & 16384) != 0 ? "" : str10);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Attributes(ru.ozon.tracker.sendEvent.Namespace r18, java.lang.String r19, int r20, int r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Float r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
            /*
                r17 = this;
                r0 = r32
                r1 = r0 & 32
                if (r1 == 0) goto La
                java.lang.String r1 = "ozon.ru"
                r8 = r1
                goto Lc
            La:
                r8 = r23
            Lc:
                r1 = r0 & 64
                if (r1 == 0) goto L14
                java.lang.String r1 = "android"
                r9 = r1
                goto L16
            L14:
                r9 = r24
            L16:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                r2 = 0
                if (r1 == 0) goto L1d
                r14 = r2
                goto L1f
            L1d:
                r14 = r29
            L1f:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L25
                r15 = r2
                goto L27
            L25:
                r15 = r30
            L27:
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L42
                r16 = r2
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r10 = r25
                r11 = r26
                r12 = r27
                r13 = r28
                r2 = r17
                goto L58
            L42:
                r16 = r31
                r2 = r17
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r10 = r25
                r11 = r26
                r12 = r27
                r13 = r28
            L58:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.tracker.model.EventEntity.Attributes.<init>(ru.ozon.tracker.sendEvent.Namespace, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC3999a
        public /* synthetic */ Attributes(Namespace namespace, String appVersion, int i11, int i12, int i13, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String str, String str2, Float f7) {
            this(namespace, appVersion, i11, i12, i13, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, str, str2, f7, null, 16384, null);
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Attributes(ru.ozon.tracker.sendEvent.Namespace r17, java.lang.String r18, int r19, int r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 32
                if (r1 == 0) goto La
                java.lang.String r1 = "ozon.ru"
                r8 = r1
                goto Lc
            La:
                r8 = r22
            Lc:
                r1 = r0 & 64
                if (r1 == 0) goto L14
                java.lang.String r1 = "android"
                r9 = r1
                goto L16
            L14:
                r9 = r23
            L16:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                r2 = 0
                if (r1 == 0) goto L1d
                r14 = r2
                goto L1f
            L1d:
                r14 = r28
            L1f:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L39
                r15 = r2
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
                r2 = r16
                goto L4f
            L39:
                r15 = r29
                r2 = r16
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
            L4f:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.tracker.model.EventEntity.Attributes.<init>(ru.ozon.tracker.sendEvent.Namespace, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC3999a
        public /* synthetic */ Attributes(Namespace namespace, String appVersion, int i11, int i12, int i13, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String str, String str2) {
            this(namespace, appVersion, i11, i12, i13, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, str, str2, null, null, 16384, null);
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
        }

        public /* synthetic */ Attributes(Namespace namespace, String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(namespace, str, i11, i12, i13, (i14 & 32) != 0 ? "ozon.ru" : str2, (i14 & 64) != 0 ? "android" : str3, str4, str5, str6, str7, (i14 & 2048) != 0 ? null : str8);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC3999a
        public /* synthetic */ Attributes(Namespace namespace, String appVersion, int i11, int i12, int i13, String domainName, String platform, String deviceType, String osVersion, String deviceModel, String mobileDeviceModel, String str) {
            this(namespace, appVersion, i11, i12, i13, domainName, platform, deviceType, osVersion, deviceModel, mobileDeviceModel, str, null, null, null, 16384, null);
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(mobileDeviceModel, "mobileDeviceModel");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Courier;", "Landroid/os/Parcelable;", "accountId", "", "<init>", "(Ljava/lang/Long;)V", "getAccountId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Courier implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Courier> CREATOR = new Creator();
        private final Long accountId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Courier> {
            @Override // android.os.Parcelable.Creator
            public final Courier createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Courier(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Courier[] newArray(int i11) {
                return new Courier[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Courier() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Long getAccountId() {
            return this.accountId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l11 = this.accountId;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
        }

        public Courier(Long l11) {
            this.accountId = l11;
        }

        public /* synthetic */ Courier(Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : l11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/tracker/model/EventEntity$EventError;", "Landroid/os/Parcelable;", "type", "", "code", SelectionItemFormDTO.TITLE_FIELD_NAME, "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCode", "getTitle", "getContext", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EventError implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EventError> CREATOR = new Creator();
        private final String code;
        private final String context;
        private final String title;
        private final String type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<EventError> {
            @Override // android.os.Parcelable.Creator
            public final EventError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EventError(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EventError[] newArray(int i11) {
                return new EventError[i11];
            }
        }

        public EventError() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ EventError copy$default(EventError eventError, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = eventError.type;
            }
            if ((i11 & 2) != 0) {
                str2 = eventError.code;
            }
            if ((i11 & 4) != 0) {
                str3 = eventError.title;
            }
            if ((i11 & 8) != 0) {
                str4 = eventError.context;
            }
            return eventError.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @NotNull
        public final EventError copy(String type, String code, String title, String context) {
            return new EventError(type, code, title, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventError)) {
                return false;
            }
            EventError eventError = (EventError) other;
            return Intrinsics.d(this.type, eventError.type) && Intrinsics.d(this.code, eventError.code) && Intrinsics.d(this.title, eventError.title) && Intrinsics.d(this.context, eventError.context);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.context;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.code;
            return C3173b.c(C3660k.d("EventError(type=", str, ", code=", str2, ", title="), this.title, ", context=", this.context, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.code);
            dest.writeString(this.title);
            dest.writeString(this.context);
        }

        public EventError(String str, String str2, String str3, String str4) {
            this.type = str;
            this.code = str2;
            this.title = str3;
            this.context = str4;
        }

        public /* synthetic */ EventError(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0004J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Filter;", "Landroid/os/Parcelable;", "ids", "", "", "names", "", "values", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "getNames", "getValues", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Filter implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Filter> CREATOR = new Creator();
        private final List<Integer> ids;
        private final List<String> names;
        private final List<List<String>> values;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Filter> {
            @Override // android.os.Parcelable.Creator
            public final Filter createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Sh.a.a(parcel, arrayList, i11, 1);
                    }
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    for (int i12 = 0; i12 != readInt2; i12++) {
                        arrayList3.add(parcel.createStringArrayList());
                    }
                    arrayList2 = arrayList3;
                }
                return new Filter(arrayList, createStringArrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Filter[] newArray(int i11) {
                return new Filter[i11];
            }
        }

        public Filter() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Filter copy$default(Filter filter, List list, List list2, List list3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = filter.ids;
            }
            if ((i11 & 2) != 0) {
                list2 = filter.names;
            }
            if ((i11 & 4) != 0) {
                list3 = filter.values;
            }
            return filter.copy(list, list2, list3);
        }

        public final List<Integer> component1() {
            return this.ids;
        }

        public final List<String> component2() {
            return this.names;
        }

        public final List<List<String>> component3() {
            return this.values;
        }

        @NotNull
        public final Filter copy(List<Integer> ids, List<String> names, List<? extends List<String>> values) {
            return new Filter(ids, names, values);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return Intrinsics.d(this.ids, filter.ids) && Intrinsics.d(this.names, filter.names) && Intrinsics.d(this.values, filter.values);
        }

        public final List<Integer> getIds() {
            return this.ids;
        }

        public final List<String> getNames() {
            return this.names;
        }

        public final List<List<String>> getValues() {
            return this.values;
        }

        public int hashCode() {
            List<Integer> list = this.ids;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.names;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<List<String>> list3 = this.values;
            return hashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<Integer> list = this.ids;
            List<String> list2 = this.names;
            return C2618u.h(c.d("Filter(ids=", list, ", names=", ", values=", list2), this.values, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Integer> list = this.ids;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeInt(((Number) c11.next()).intValue());
                }
            }
            dest.writeStringList(this.names);
            List<List<String>> list2 = this.values;
            if (list2 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c12 = J.c(dest, 1, list2);
            while (c12.hasNext()) {
                dest.writeStringList((List) c12.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Filter(List<Integer> list, List<String> list2, List<? extends List<String>> list3) {
            this.ids = list;
            this.names = list2;
            this.values = list3;
        }

        public /* synthetic */ Filter(List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : list3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Form;", "Landroid/os/Parcelable;", "errorType", "", "<init>", "(Ljava/lang/String;)V", "getErrorType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Form implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new Creator();
        private final String errorType;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Form> {
            @Override // android.os.Parcelable.Creator
            public final Form createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Form[] newArray(int i11) {
                return new Form[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Form() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Form copy$default(Form form, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = form.errorType;
            }
            return form.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorType() {
            return this.errorType;
        }

        @NotNull
        public final Form copy(String errorType) {
            return new Form(errorType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Form) && Intrinsics.d(this.errorType, ((Form) other).errorType);
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            String str = this.errorType;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Form(errorType=", this.errorType, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.errorType);
        }

        public Form(String str) {
            this.errorType = str;
        }

        public /* synthetic */ Form(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\bN\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010]\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010^\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010_\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010`\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010c\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010CJ\u0010\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0082\u0003\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010jJ\u0006\u0010k\u001a\u00020\u001eJ\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oHÖ\u0003J\t\u0010p\u001a\u00020\u001eHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b/\u0010*R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b0\u0010*R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b1\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b3\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b8\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b;\u0010*R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b<\u0010*R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b=\u0010*R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b>\u0010*R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b?\u0010*R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b@\u0010*R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\bA\u0010*R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\bE\u0010*R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010'¨\u0006w"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Obj;", "Landroid/os/Parcelable;", "type", "", "id", "sku", "", "bannerId", "brandId", "brandName", "sellerId", "regionId", "reviewId", "searchString", "categoryId", "filterId", "sortId", "suggestType", "orderId", "messageId", "promocode", "postingId", "merchantId", "timeslotId", "imageId", "image3dId", "arId", "marketingActionId", "shipmentId", "paymentType", "", "deliveryPointId", "menuId", "deliveryType", "deliveryService", "virtualPostingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBannerId", "getBrandId", "getBrandName", "getSellerId", "getRegionId", "getReviewId", "getSearchString", "getCategoryId", "getFilterId", "getSortId", "getSuggestType", "getOrderId", "getMessageId", "getPromocode", "getPostingId", "getMerchantId", "getTimeslotId", "getImageId", "getImage3dId", "getArId", "getMarketingActionId", "getShipmentId", "getPaymentType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeliveryPointId", "getMenuId", "getDeliveryType", "getDeliveryService", "getVirtualPostingId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Obj;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Obj implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Obj> CREATOR = new Creator();
        private final Long arId;
        private final String bannerId;
        private final Long brandId;
        private final String brandName;
        private final Long categoryId;
        private final Long deliveryPointId;
        private final String deliveryService;
        private final String deliveryType;
        private final String filterId;
        private final String id;
        private final Long image3dId;
        private final Long imageId;
        private final Long marketingActionId;
        private final String menuId;
        private final Long merchantId;
        private final Long messageId;
        private final String orderId;
        private final Integer paymentType;
        private final String postingId;
        private final String promocode;
        private final Long regionId;
        private final Long reviewId;
        private final String searchString;
        private final Long sellerId;
        private final Long shipmentId;
        private final Long sku;
        private final String sortId;
        private final String suggestType;
        private final Long timeslotId;
        private final String type;
        private final String virtualPostingId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Obj> {
            @Override // android.os.Parcelable.Creator
            public final Obj createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Obj(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Obj[] newArray(int i11) {
                return new Obj[i11];
            }
        }

        public Obj() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
        }

        public static /* synthetic */ Obj copy$default(Obj obj, String str, String str2, Long l11, String str3, Long l12, String str4, Long l13, Long l14, Long l15, String str5, Long l16, String str6, String str7, String str8, String str9, Long l17, String str10, String str11, Long l18, Long l19, Long l21, Long l22, Long l23, Long l24, Long l25, Integer num, Long l26, String str12, String str13, String str14, String str15, int i11, Object obj2) {
            String str16;
            String str17;
            String str18 = (i11 & 1) != 0 ? obj.type : str;
            String str19 = (i11 & 2) != 0 ? obj.id : str2;
            Long l27 = (i11 & 4) != 0 ? obj.sku : l11;
            String str20 = (i11 & 8) != 0 ? obj.bannerId : str3;
            Long l28 = (i11 & 16) != 0 ? obj.brandId : l12;
            String str21 = (i11 & 32) != 0 ? obj.brandName : str4;
            Long l29 = (i11 & 64) != 0 ? obj.sellerId : l13;
            Long l31 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? obj.regionId : l14;
            Long l32 = (i11 & 256) != 0 ? obj.reviewId : l15;
            String str22 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? obj.searchString : str5;
            Long l33 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? obj.categoryId : l16;
            String str23 = (i11 & 2048) != 0 ? obj.filterId : str6;
            String str24 = (i11 & 4096) != 0 ? obj.sortId : str7;
            String str25 = (i11 & 8192) != 0 ? obj.suggestType : str8;
            String str26 = str18;
            String str27 = (i11 & 16384) != 0 ? obj.orderId : str9;
            Long l34 = (i11 & 32768) != 0 ? obj.messageId : l17;
            String str28 = (i11 & 65536) != 0 ? obj.promocode : str10;
            String str29 = (i11 & 131072) != 0 ? obj.postingId : str11;
            Long l35 = (i11 & 262144) != 0 ? obj.merchantId : l18;
            Long l36 = (i11 & 524288) != 0 ? obj.timeslotId : l19;
            Long l37 = (i11 & 1048576) != 0 ? obj.imageId : l21;
            Long l38 = (i11 & 2097152) != 0 ? obj.image3dId : l22;
            Long l39 = (i11 & 4194304) != 0 ? obj.arId : l23;
            Long l41 = (i11 & 8388608) != 0 ? obj.marketingActionId : l24;
            Long l42 = (i11 & 16777216) != 0 ? obj.shipmentId : l25;
            Integer num2 = (i11 & 33554432) != 0 ? obj.paymentType : num;
            Long l43 = (i11 & 67108864) != 0 ? obj.deliveryPointId : l26;
            String str30 = (i11 & 134217728) != 0 ? obj.menuId : str12;
            String str31 = (i11 & 268435456) != 0 ? obj.deliveryType : str13;
            String str32 = (i11 & 536870912) != 0 ? obj.deliveryService : str14;
            if ((i11 & 1073741824) != 0) {
                str17 = str32;
                str16 = obj.virtualPostingId;
            } else {
                str16 = str15;
                str17 = str32;
            }
            return obj.copy(str26, str19, l27, str20, l28, str21, l29, l31, l32, str22, l33, str23, str24, str25, str27, l34, str28, str29, l35, l36, l37, l38, l39, l41, l42, num2, l43, str30, str31, str17, str16);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSearchString() {
            return this.searchString;
        }

        /* renamed from: component11, reason: from getter */
        public final Long getCategoryId() {
            return this.categoryId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getFilterId() {
            return this.filterId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSortId() {
            return this.sortId;
        }

        /* renamed from: component14, reason: from getter */
        public final String getSuggestType() {
            return this.suggestType;
        }

        /* renamed from: component15, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: component16, reason: from getter */
        public final Long getMessageId() {
            return this.messageId;
        }

        /* renamed from: component17, reason: from getter */
        public final String getPromocode() {
            return this.promocode;
        }

        /* renamed from: component18, reason: from getter */
        public final String getPostingId() {
            return this.postingId;
        }

        /* renamed from: component19, reason: from getter */
        public final Long getMerchantId() {
            return this.merchantId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component20, reason: from getter */
        public final Long getTimeslotId() {
            return this.timeslotId;
        }

        /* renamed from: component21, reason: from getter */
        public final Long getImageId() {
            return this.imageId;
        }

        /* renamed from: component22, reason: from getter */
        public final Long getImage3dId() {
            return this.image3dId;
        }

        /* renamed from: component23, reason: from getter */
        public final Long getArId() {
            return this.arId;
        }

        /* renamed from: component24, reason: from getter */
        public final Long getMarketingActionId() {
            return this.marketingActionId;
        }

        /* renamed from: component25, reason: from getter */
        public final Long getShipmentId() {
            return this.shipmentId;
        }

        /* renamed from: component26, reason: from getter */
        public final Integer getPaymentType() {
            return this.paymentType;
        }

        /* renamed from: component27, reason: from getter */
        public final Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

        /* renamed from: component28, reason: from getter */
        public final String getMenuId() {
            return this.menuId;
        }

        /* renamed from: component29, reason: from getter */
        public final String getDeliveryType() {
            return this.deliveryType;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getSku() {
            return this.sku;
        }

        /* renamed from: component30, reason: from getter */
        public final String getDeliveryService() {
            return this.deliveryService;
        }

        /* renamed from: component31, reason: from getter */
        public final String getVirtualPostingId() {
            return this.virtualPostingId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBannerId() {
            return this.bannerId;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getBrandId() {
            return this.brandId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getSellerId() {
            return this.sellerId;
        }

        /* renamed from: component8, reason: from getter */
        public final Long getRegionId() {
            return this.regionId;
        }

        /* renamed from: component9, reason: from getter */
        public final Long getReviewId() {
            return this.reviewId;
        }

        @NotNull
        public final Obj copy(String type, String id2, Long sku, String bannerId, Long brandId, String brandName, Long sellerId, Long regionId, Long reviewId, String searchString, Long categoryId, String filterId, String sortId, String suggestType, String orderId, Long messageId, String promocode, String postingId, Long merchantId, Long timeslotId, Long imageId, @com.squareup.moshi.i(name = "3dId") Long image3dId, Long arId, Long marketingActionId, Long shipmentId, Integer paymentType, Long deliveryPointId, String menuId, String deliveryType, String deliveryService, String virtualPostingId) {
            return new Obj(type, id2, sku, bannerId, brandId, brandName, sellerId, regionId, reviewId, searchString, categoryId, filterId, sortId, suggestType, orderId, messageId, promocode, postingId, merchantId, timeslotId, imageId, image3dId, arId, marketingActionId, shipmentId, paymentType, deliveryPointId, menuId, deliveryType, deliveryService, virtualPostingId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Obj)) {
                return false;
            }
            Obj obj = (Obj) other;
            return Intrinsics.d(this.type, obj.type) && Intrinsics.d(this.id, obj.id) && Intrinsics.d(this.sku, obj.sku) && Intrinsics.d(this.bannerId, obj.bannerId) && Intrinsics.d(this.brandId, obj.brandId) && Intrinsics.d(this.brandName, obj.brandName) && Intrinsics.d(this.sellerId, obj.sellerId) && Intrinsics.d(this.regionId, obj.regionId) && Intrinsics.d(this.reviewId, obj.reviewId) && Intrinsics.d(this.searchString, obj.searchString) && Intrinsics.d(this.categoryId, obj.categoryId) && Intrinsics.d(this.filterId, obj.filterId) && Intrinsics.d(this.sortId, obj.sortId) && Intrinsics.d(this.suggestType, obj.suggestType) && Intrinsics.d(this.orderId, obj.orderId) && Intrinsics.d(this.messageId, obj.messageId) && Intrinsics.d(this.promocode, obj.promocode) && Intrinsics.d(this.postingId, obj.postingId) && Intrinsics.d(this.merchantId, obj.merchantId) && Intrinsics.d(this.timeslotId, obj.timeslotId) && Intrinsics.d(this.imageId, obj.imageId) && Intrinsics.d(this.image3dId, obj.image3dId) && Intrinsics.d(this.arId, obj.arId) && Intrinsics.d(this.marketingActionId, obj.marketingActionId) && Intrinsics.d(this.shipmentId, obj.shipmentId) && Intrinsics.d(this.paymentType, obj.paymentType) && Intrinsics.d(this.deliveryPointId, obj.deliveryPointId) && Intrinsics.d(this.menuId, obj.menuId) && Intrinsics.d(this.deliveryType, obj.deliveryType) && Intrinsics.d(this.deliveryService, obj.deliveryService) && Intrinsics.d(this.virtualPostingId, obj.virtualPostingId);
        }

        public final Long getArId() {
            return this.arId;
        }

        public final String getBannerId() {
            return this.bannerId;
        }

        public final Long getBrandId() {
            return this.brandId;
        }

        public final String getBrandName() {
            return this.brandName;
        }

        public final Long getCategoryId() {
            return this.categoryId;
        }

        public final Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

        public final String getDeliveryService() {
            return this.deliveryService;
        }

        public final String getDeliveryType() {
            return this.deliveryType;
        }

        public final String getFilterId() {
            return this.filterId;
        }

        public final String getId() {
            return this.id;
        }

        public final Long getImage3dId() {
            return this.image3dId;
        }

        public final Long getImageId() {
            return this.imageId;
        }

        public final Long getMarketingActionId() {
            return this.marketingActionId;
        }

        public final String getMenuId() {
            return this.menuId;
        }

        public final Long getMerchantId() {
            return this.merchantId;
        }

        public final Long getMessageId() {
            return this.messageId;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final Integer getPaymentType() {
            return this.paymentType;
        }

        public final String getPostingId() {
            return this.postingId;
        }

        public final String getPromocode() {
            return this.promocode;
        }

        public final Long getRegionId() {
            return this.regionId;
        }

        public final Long getReviewId() {
            return this.reviewId;
        }

        public final String getSearchString() {
            return this.searchString;
        }

        public final Long getSellerId() {
            return this.sellerId;
        }

        public final Long getShipmentId() {
            return this.shipmentId;
        }

        public final Long getSku() {
            return this.sku;
        }

        public final String getSortId() {
            return this.sortId;
        }

        public final String getSuggestType() {
            return this.suggestType;
        }

        public final Long getTimeslotId() {
            return this.timeslotId;
        }

        public final String getType() {
            return this.type;
        }

        public final String getVirtualPostingId() {
            return this.virtualPostingId;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l11 = this.sku;
            int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str3 = this.bannerId;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l12 = this.brandId;
            int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str4 = this.brandName;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l13 = this.sellerId;
            int hashCode7 = (hashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.regionId;
            int hashCode8 = (hashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.reviewId;
            int hashCode9 = (hashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
            String str5 = this.searchString;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l16 = this.categoryId;
            int hashCode11 = (hashCode10 + (l16 == null ? 0 : l16.hashCode())) * 31;
            String str6 = this.filterId;
            int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.sortId;
            int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.suggestType;
            int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.orderId;
            int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l17 = this.messageId;
            int hashCode16 = (hashCode15 + (l17 == null ? 0 : l17.hashCode())) * 31;
            String str10 = this.promocode;
            int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.postingId;
            int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Long l18 = this.merchantId;
            int hashCode19 = (hashCode18 + (l18 == null ? 0 : l18.hashCode())) * 31;
            Long l19 = this.timeslotId;
            int hashCode20 = (hashCode19 + (l19 == null ? 0 : l19.hashCode())) * 31;
            Long l21 = this.imageId;
            int hashCode21 = (hashCode20 + (l21 == null ? 0 : l21.hashCode())) * 31;
            Long l22 = this.image3dId;
            int hashCode22 = (hashCode21 + (l22 == null ? 0 : l22.hashCode())) * 31;
            Long l23 = this.arId;
            int hashCode23 = (hashCode22 + (l23 == null ? 0 : l23.hashCode())) * 31;
            Long l24 = this.marketingActionId;
            int hashCode24 = (hashCode23 + (l24 == null ? 0 : l24.hashCode())) * 31;
            Long l25 = this.shipmentId;
            int hashCode25 = (hashCode24 + (l25 == null ? 0 : l25.hashCode())) * 31;
            Integer num = this.paymentType;
            int hashCode26 = (hashCode25 + (num == null ? 0 : num.hashCode())) * 31;
            Long l26 = this.deliveryPointId;
            int hashCode27 = (hashCode26 + (l26 == null ? 0 : l26.hashCode())) * 31;
            String str12 = this.menuId;
            int hashCode28 = (hashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.deliveryType;
            int hashCode29 = (hashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.deliveryService;
            int hashCode30 = (hashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.virtualPostingId;
            return hashCode30 + (str15 != null ? str15.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            Long l11 = this.sku;
            String str3 = this.bannerId;
            Long l12 = this.brandId;
            String str4 = this.brandName;
            Long l13 = this.sellerId;
            Long l14 = this.regionId;
            Long l15 = this.reviewId;
            String str5 = this.searchString;
            Long l16 = this.categoryId;
            String str6 = this.filterId;
            String str7 = this.sortId;
            String str8 = this.suggestType;
            String str9 = this.orderId;
            Long l17 = this.messageId;
            String str10 = this.promocode;
            String str11 = this.postingId;
            Long l18 = this.merchantId;
            Long l19 = this.timeslotId;
            Long l21 = this.imageId;
            Long l22 = this.image3dId;
            Long l23 = this.arId;
            Long l24 = this.marketingActionId;
            Long l25 = this.shipmentId;
            Integer num = this.paymentType;
            Long l26 = this.deliveryPointId;
            String str12 = this.menuId;
            String str13 = this.deliveryType;
            String str14 = this.deliveryService;
            String str15 = this.virtualPostingId;
            StringBuilder d11 = C3660k.d("Obj(type=", str, ", id=", str2, ", sku=");
            d11.append(l11);
            d11.append(", bannerId=");
            d11.append(str3);
            d11.append(", brandId=");
            d11.append(l12);
            d11.append(", brandName=");
            d11.append(str4);
            d11.append(", sellerId=");
            TY.a.e(d11, l13, ", regionId=", l14, ", reviewId=");
            d11.append(l15);
            d11.append(", searchString=");
            d11.append(str5);
            d11.append(", categoryId=");
            d11.append(l16);
            d11.append(", filterId=");
            d11.append(str6);
            d11.append(", sortId=");
            Nh.a.h(d11, str7, ", suggestType=", str8, ", orderId=");
            d11.append(str9);
            d11.append(", messageId=");
            d11.append(l17);
            d11.append(", promocode=");
            Nh.a.h(d11, str10, ", postingId=", str11, ", merchantId=");
            TY.a.e(d11, l18, ", timeslotId=", l19, ", imageId=");
            TY.a.e(d11, l21, ", image3dId=", l22, ", arId=");
            TY.a.e(d11, l23, ", marketingActionId=", l24, ", shipmentId=");
            d11.append(l25);
            d11.append(", paymentType=");
            d11.append(num);
            d11.append(", deliveryPointId=");
            d11.append(l26);
            d11.append(", menuId=");
            d11.append(str12);
            d11.append(", deliveryType=");
            Nh.a.h(d11, str13, ", deliveryService=", str14, ", virtualPostingId=");
            return o0.c(d11, str15, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.id);
            Long l11 = this.sku;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.bannerId);
            Long l12 = this.brandId;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l12);
            }
            dest.writeString(this.brandName);
            Long l13 = this.sellerId;
            if (l13 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l13);
            }
            Long l14 = this.regionId;
            if (l14 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l14);
            }
            Long l15 = this.reviewId;
            if (l15 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l15);
            }
            dest.writeString(this.searchString);
            Long l16 = this.categoryId;
            if (l16 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l16);
            }
            dest.writeString(this.filterId);
            dest.writeString(this.sortId);
            dest.writeString(this.suggestType);
            dest.writeString(this.orderId);
            Long l17 = this.messageId;
            if (l17 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l17);
            }
            dest.writeString(this.promocode);
            dest.writeString(this.postingId);
            Long l18 = this.merchantId;
            if (l18 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l18);
            }
            Long l19 = this.timeslotId;
            if (l19 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l19);
            }
            Long l21 = this.imageId;
            if (l21 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l21);
            }
            Long l22 = this.image3dId;
            if (l22 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l22);
            }
            Long l23 = this.arId;
            if (l23 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l23);
            }
            Long l24 = this.marketingActionId;
            if (l24 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l24);
            }
            Long l25 = this.shipmentId;
            if (l25 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l25);
            }
            Integer num = this.paymentType;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Long l26 = this.deliveryPointId;
            if (l26 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l26);
            }
            dest.writeString(this.menuId);
            dest.writeString(this.deliveryType);
            dest.writeString(this.deliveryService);
            dest.writeString(this.virtualPostingId);
        }

        public Obj(String str, String str2, Long l11, String str3, Long l12, String str4, Long l13, Long l14, Long l15, String str5, Long l16, String str6, String str7, String str8, String str9, Long l17, String str10, String str11, Long l18, Long l19, Long l21, @com.squareup.moshi.i(name = "3dId") Long l22, Long l23, Long l24, Long l25, Integer num, Long l26, String str12, String str13, String str14, String str15) {
            this.type = str;
            this.id = str2;
            this.sku = l11;
            this.bannerId = str3;
            this.brandId = l12;
            this.brandName = str4;
            this.sellerId = l13;
            this.regionId = l14;
            this.reviewId = l15;
            this.searchString = str5;
            this.categoryId = l16;
            this.filterId = str6;
            this.sortId = str7;
            this.suggestType = str8;
            this.orderId = str9;
            this.messageId = l17;
            this.promocode = str10;
            this.postingId = str11;
            this.merchantId = l18;
            this.timeslotId = l19;
            this.imageId = l21;
            this.image3dId = l22;
            this.arId = l23;
            this.marketingActionId = l24;
            this.shipmentId = l25;
            this.paymentType = num;
            this.deliveryPointId = l26;
            this.menuId = str12;
            this.deliveryType = str13;
            this.deliveryService = str14;
            this.virtualPostingId = str15;
        }

        public /* synthetic */ Obj(String str, String str2, Long l11, String str3, Long l12, String str4, Long l13, Long l14, Long l15, String str5, Long l16, String str6, String str7, String str8, String str9, Long l17, String str10, String str11, Long l18, Long l19, Long l21, Long l22, Long l23, Long l24, Long l25, Integer num, Long l26, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : l13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l14, (i11 & 256) != 0 ? null : l15, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l16, (i11 & 2048) != 0 ? null : str6, (i11 & 4096) != 0 ? null : str7, (i11 & 8192) != 0 ? null : str8, (i11 & 16384) != 0 ? null : str9, (i11 & 32768) != 0 ? null : l17, (i11 & 65536) != 0 ? null : str10, (i11 & 131072) != 0 ? null : str11, (i11 & 262144) != 0 ? null : l18, (i11 & 524288) != 0 ? null : l19, (i11 & 1048576) != 0 ? null : l21, (i11 & 2097152) != 0 ? null : l22, (i11 & 4194304) != 0 ? null : l23, (i11 & 8388608) != 0 ? null : l24, (i11 & 16777216) != 0 ? null : l25, (i11 & 33554432) != 0 ? null : num, (i11 & 67108864) != 0 ? null : l26, (i11 & 134217728) != 0 ? null : str12, (i11 & 268435456) != 0 ? null : str13, (i11 & 536870912) != 0 ? null : str14, (i11 & 1073741824) != 0 ? null : str15);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aBÕ\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001bBá\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001cJÙ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u00108Jå\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u00109J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010I\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010J\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00105Jò\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010MJ\u0006\u0010N\u001a\u00020\u000fJ\u0013\u0010O\u001a\u00020\u00182\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u000fHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b0\u0010-R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b1\u0010-R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105¨\u0006Y"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Page;", "Landroid/os/Parcelable;", "current", "", "previous", "currentUrl", "referralUrl", "nextUrl", "ruleId", "layoutId", "layoutVersion", "pageViewId", "previousPageViewId", "composerPageType", "categoryId", "", "tagId", "", "sku", "highlightId", "sellerId", "brandId", "miniapp", "teensMode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getCurrent", "()Ljava/lang/String;", "getPrevious", "getCurrentUrl", "getReferralUrl", "getNextUrl", "getRuleId", "getLayoutId", "getLayoutVersion", "getPageViewId", "getPreviousPageViewId", "getComposerPageType", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTagId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSku", "getHighlightId", "getSellerId", "getBrandId", "getMiniapp", "getTeensMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/tracker/model/EventEntity$Page;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Page;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/tracker/model/EventEntity$Page;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Page implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Page> CREATOR = new Creator();
        private final Long brandId;
        private final Integer categoryId;
        private final String composerPageType;
        private final String current;
        private final String currentUrl;
        private final Long highlightId;
        private final String layoutId;
        private final String layoutVersion;
        private final String miniapp;
        private final String nextUrl;
        private final String pageViewId;
        private final String previous;
        private final String previousPageViewId;
        private final String referralUrl;
        private final String ruleId;
        private final Long sellerId;
        private final Long sku;
        private final Long tagId;
        private final Boolean teensMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Page> {
            @Override // android.os.Parcelable.Creator
            public final Page createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                Boolean bool = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString12 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Page(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, readString12, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final Page[] newArray(int i11) {
                return new Page[i11];
            }
        }

        public Page() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        }

        public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12, Boolean bool, int i11, Object obj) {
            Boolean bool2;
            String str13;
            String str14 = (i11 & 1) != 0 ? page.current : str;
            String str15 = (i11 & 2) != 0 ? page.previous : str2;
            String str16 = (i11 & 4) != 0 ? page.currentUrl : str3;
            String str17 = (i11 & 8) != 0 ? page.referralUrl : str4;
            String str18 = (i11 & 16) != 0 ? page.nextUrl : str5;
            String str19 = (i11 & 32) != 0 ? page.ruleId : str6;
            String str20 = (i11 & 64) != 0 ? page.layoutId : str7;
            String str21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.layoutVersion : str8;
            String str22 = (i11 & 256) != 0 ? page.pageViewId : str9;
            String str23 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.previousPageViewId : str10;
            String str24 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.composerPageType : str11;
            Integer num2 = (i11 & 2048) != 0 ? page.categoryId : num;
            Long l16 = (i11 & 4096) != 0 ? page.tagId : l11;
            Long l17 = (i11 & 8192) != 0 ? page.sku : l12;
            String str25 = str14;
            Long l18 = (i11 & 16384) != 0 ? page.highlightId : l13;
            Long l19 = (i11 & 32768) != 0 ? page.sellerId : l14;
            Long l21 = (i11 & 65536) != 0 ? page.brandId : l15;
            String str26 = (i11 & 131072) != 0 ? page.miniapp : str12;
            if ((i11 & 262144) != 0) {
                str13 = str26;
                bool2 = page.teensMode;
            } else {
                bool2 = bool;
                str13 = str26;
            }
            return page.copy(str25, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, num2, l16, l17, l18, l19, l21, str13, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrent() {
            return this.current;
        }

        /* renamed from: component10, reason: from getter */
        public final String getPreviousPageViewId() {
            return this.previousPageViewId;
        }

        /* renamed from: component11, reason: from getter */
        public final String getComposerPageType() {
            return this.composerPageType;
        }

        /* renamed from: component12, reason: from getter */
        public final Integer getCategoryId() {
            return this.categoryId;
        }

        /* renamed from: component13, reason: from getter */
        public final Long getTagId() {
            return this.tagId;
        }

        /* renamed from: component14, reason: from getter */
        public final Long getSku() {
            return this.sku;
        }

        /* renamed from: component15, reason: from getter */
        public final Long getHighlightId() {
            return this.highlightId;
        }

        /* renamed from: component16, reason: from getter */
        public final Long getSellerId() {
            return this.sellerId;
        }

        /* renamed from: component17, reason: from getter */
        public final Long getBrandId() {
            return this.brandId;
        }

        /* renamed from: component18, reason: from getter */
        public final String getMiniapp() {
            return this.miniapp;
        }

        /* renamed from: component19, reason: from getter */
        public final Boolean getTeensMode() {
            return this.teensMode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrevious() {
            return this.previous;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrentUrl() {
            return this.currentUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReferralUrl() {
            return this.referralUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNextUrl() {
            return this.nextUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRuleId() {
            return this.ruleId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLayoutId() {
            return this.layoutId;
        }

        /* renamed from: component8, reason: from getter */
        public final String getLayoutVersion() {
            return this.layoutVersion;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPageViewId() {
            return this.pageViewId;
        }

        @NotNull
        public final Page copy(String current, String previous, String currentUrl, String referralUrl, String nextUrl, String ruleId, String layoutId, String layoutVersion, String pageViewId, String previousPageViewId, String composerPageType, Integer categoryId, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId, String miniapp, Boolean teensMode) {
            return new Page(current, previous, currentUrl, referralUrl, nextUrl, ruleId, layoutId, layoutVersion, pageViewId, previousPageViewId, composerPageType, categoryId, tagId, sku, highlightId, sellerId, brandId, miniapp, teensMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return Intrinsics.d(this.current, page.current) && Intrinsics.d(this.previous, page.previous) && Intrinsics.d(this.currentUrl, page.currentUrl) && Intrinsics.d(this.referralUrl, page.referralUrl) && Intrinsics.d(this.nextUrl, page.nextUrl) && Intrinsics.d(this.ruleId, page.ruleId) && Intrinsics.d(this.layoutId, page.layoutId) && Intrinsics.d(this.layoutVersion, page.layoutVersion) && Intrinsics.d(this.pageViewId, page.pageViewId) && Intrinsics.d(this.previousPageViewId, page.previousPageViewId) && Intrinsics.d(this.composerPageType, page.composerPageType) && Intrinsics.d(this.categoryId, page.categoryId) && Intrinsics.d(this.tagId, page.tagId) && Intrinsics.d(this.sku, page.sku) && Intrinsics.d(this.highlightId, page.highlightId) && Intrinsics.d(this.sellerId, page.sellerId) && Intrinsics.d(this.brandId, page.brandId) && Intrinsics.d(this.miniapp, page.miniapp) && Intrinsics.d(this.teensMode, page.teensMode);
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

        public final String getCurrent() {
            return this.current;
        }

        public final String getCurrentUrl() {
            return this.currentUrl;
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

        public final String getMiniapp() {
            return this.miniapp;
        }

        public final String getNextUrl() {
            return this.nextUrl;
        }

        public final String getPageViewId() {
            return this.pageViewId;
        }

        public final String getPrevious() {
            return this.previous;
        }

        public final String getPreviousPageViewId() {
            return this.previousPageViewId;
        }

        public final String getReferralUrl() {
            return this.referralUrl;
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

        public int hashCode() {
            String str = this.current;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.previous;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currentUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.referralUrl;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.nextUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.ruleId;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.layoutId;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.layoutVersion;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.pageViewId;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.previousPageViewId;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.composerPageType;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Integer num = this.categoryId;
            int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Long l11 = this.tagId;
            int hashCode13 = (hashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.sku;
            int hashCode14 = (hashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.highlightId;
            int hashCode15 = (hashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.sellerId;
            int hashCode16 = (hashCode15 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.brandId;
            int hashCode17 = (hashCode16 + (l15 == null ? 0 : l15.hashCode())) * 31;
            String str12 = this.miniapp;
            int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Boolean bool = this.teensMode;
            return hashCode18 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.current;
            String str2 = this.previous;
            String str3 = this.currentUrl;
            String str4 = this.referralUrl;
            String str5 = this.nextUrl;
            String str6 = this.ruleId;
            String str7 = this.layoutId;
            String str8 = this.layoutVersion;
            String str9 = this.pageViewId;
            String str10 = this.previousPageViewId;
            String str11 = this.composerPageType;
            Integer num = this.categoryId;
            Long l11 = this.tagId;
            Long l12 = this.sku;
            Long l13 = this.highlightId;
            Long l14 = this.sellerId;
            Long l15 = this.brandId;
            String str12 = this.miniapp;
            Boolean bool = this.teensMode;
            StringBuilder d11 = C3660k.d("Page(current=", str, ", previous=", str2, ", currentUrl=");
            Nh.a.h(d11, str3, ", referralUrl=", str4, ", nextUrl=");
            Nh.a.h(d11, str5, ", ruleId=", str6, ", layoutId=");
            Nh.a.h(d11, str7, ", layoutVersion=", str8, ", pageViewId=");
            Nh.a.h(d11, str9, ", previousPageViewId=", str10, ", composerPageType=");
            C2454a.f(num, str11, ", categoryId=", ", tagId=", d11);
            TY.a.e(d11, l11, ", sku=", l12, ", highlightId=");
            TY.a.e(d11, l13, ", sellerId=", l14, ", brandId=");
            d11.append(l15);
            d11.append(", miniapp=");
            d11.append(str12);
            d11.append(", teensMode=");
            return D3.g.d(d11, bool, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.current);
            dest.writeString(this.previous);
            dest.writeString(this.currentUrl);
            dest.writeString(this.referralUrl);
            dest.writeString(this.nextUrl);
            dest.writeString(this.ruleId);
            dest.writeString(this.layoutId);
            dest.writeString(this.layoutVersion);
            dest.writeString(this.pageViewId);
            dest.writeString(this.previousPageViewId);
            dest.writeString(this.composerPageType);
            Integer num = this.categoryId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Long l11 = this.tagId;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            Long l12 = this.sku;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l12);
            }
            Long l13 = this.highlightId;
            if (l13 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l13);
            }
            Long l14 = this.sellerId;
            if (l14 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l14);
            }
            Long l15 = this.brandId;
            if (l15 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l15);
            }
            dest.writeString(this.miniapp);
            Boolean bool = this.teensMode;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
            }
        }

        public Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12, Boolean bool) {
            this.current = str;
            this.previous = str2;
            this.currentUrl = str3;
            this.referralUrl = str4;
            this.nextUrl = str5;
            this.ruleId = str6;
            this.layoutId = str7;
            this.layoutVersion = str8;
            this.pageViewId = str9;
            this.previousPageViewId = str10;
            this.composerPageType = str11;
            this.categoryId = num;
            this.tagId = l11;
            this.sku = l12;
            this.highlightId = l13;
            this.sellerId = l14;
            this.brandId = l15;
            this.miniapp = str12;
            this.teensMode = bool;
        }

        public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, int i11, Object obj) {
            Long l16;
            Long l17;
            String str12;
            Page page2;
            Long l18;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            Integer num2;
            Long l19;
            Long l21;
            String str23 = (i11 & 1) != 0 ? page.current : str;
            String str24 = (i11 & 2) != 0 ? page.previous : str2;
            String str25 = (i11 & 4) != 0 ? page.currentUrl : str3;
            String str26 = (i11 & 8) != 0 ? page.referralUrl : str4;
            String str27 = (i11 & 16) != 0 ? page.nextUrl : str5;
            String str28 = (i11 & 32) != 0 ? page.ruleId : str6;
            String str29 = (i11 & 64) != 0 ? page.layoutId : str7;
            String str30 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.layoutVersion : str8;
            String str31 = (i11 & 256) != 0 ? page.pageViewId : str9;
            String str32 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.previousPageViewId : str10;
            String str33 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.composerPageType : str11;
            Integer num3 = (i11 & 2048) != 0 ? page.categoryId : num;
            Long l22 = (i11 & 4096) != 0 ? page.tagId : l11;
            Long l23 = (i11 & 8192) != 0 ? page.sku : l12;
            String str34 = str23;
            Long l24 = (i11 & 16384) != 0 ? page.highlightId : l13;
            Long l25 = (i11 & 32768) != 0 ? page.sellerId : l14;
            if ((i11 & 65536) != 0) {
                l17 = l25;
                l16 = page.brandId;
                l18 = l24;
                str13 = str24;
                str14 = str25;
                str15 = str26;
                str16 = str27;
                str17 = str28;
                str18 = str29;
                str19 = str30;
                str20 = str31;
                str21 = str32;
                str22 = str33;
                num2 = num3;
                l19 = l22;
                l21 = l23;
                str12 = str34;
                page2 = page;
            } else {
                l16 = l15;
                l17 = l25;
                str12 = str34;
                page2 = page;
                l18 = l24;
                str13 = str24;
                str14 = str25;
                str15 = str26;
                str16 = str27;
                str17 = str28;
                str18 = str29;
                str19 = str30;
                str20 = str31;
                str21 = str32;
                str22 = str33;
                num2 = num3;
                l19 = l22;
                l21 = l23;
            }
            return page2.copy(str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, num2, l19, l21, l18, l17, l16);
        }

        @InterfaceC3999a
        @NotNull
        public final Page copy(String current, String previous, String currentUrl, String referralUrl, String nextUrl, String ruleId, String layoutId, String layoutVersion, String pageViewId, String previousPageViewId, String composerPageType, Integer categoryId, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId) {
            return copy(current, previous, currentUrl, referralUrl, nextUrl, ruleId, layoutId, layoutVersion, pageViewId, previousPageViewId, composerPageType, categoryId, tagId, sku, highlightId, sellerId, brandId, null, this.teensMode);
        }

        @InterfaceC3999a
        @NotNull
        public final Page copy(String current, String previous, String currentUrl, String referralUrl, String nextUrl, String ruleId, String layoutId, String layoutVersion, String pageViewId, String previousPageViewId, String composerPageType, Integer categoryId, Long tagId, Long sku, Long highlightId, Long sellerId, Long brandId, String miniapp) {
            return copy(current, previous, currentUrl, referralUrl, nextUrl, ruleId, layoutId, layoutVersion, pageViewId, previousPageViewId, composerPageType, categoryId, tagId, sku, highlightId, sellerId, brandId, miniapp, this.teensMode);
        }

        public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12, int i11, Object obj) {
            String str13;
            Long l16;
            String str14 = (i11 & 1) != 0 ? page.current : str;
            String str15 = (i11 & 2) != 0 ? page.previous : str2;
            String str16 = (i11 & 4) != 0 ? page.currentUrl : str3;
            String str17 = (i11 & 8) != 0 ? page.referralUrl : str4;
            String str18 = (i11 & 16) != 0 ? page.nextUrl : str5;
            String str19 = (i11 & 32) != 0 ? page.ruleId : str6;
            String str20 = (i11 & 64) != 0 ? page.layoutId : str7;
            String str21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? page.layoutVersion : str8;
            String str22 = (i11 & 256) != 0 ? page.pageViewId : str9;
            String str23 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? page.previousPageViewId : str10;
            String str24 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? page.composerPageType : str11;
            Integer num2 = (i11 & 2048) != 0 ? page.categoryId : num;
            Long l17 = (i11 & 4096) != 0 ? page.tagId : l11;
            Long l18 = (i11 & 8192) != 0 ? page.sku : l12;
            String str25 = str14;
            Long l19 = (i11 & 16384) != 0 ? page.highlightId : l13;
            Long l21 = (i11 & 32768) != 0 ? page.sellerId : l14;
            Long l22 = (i11 & 65536) != 0 ? page.brandId : l15;
            if ((i11 & 131072) != 0) {
                l16 = l22;
                str13 = page.miniapp;
            } else {
                str13 = str12;
                l16 = l22;
            }
            return page.copy(str25, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, num2, l17, l18, l19, l21, l16, str13);
        }

        public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : l11, (i11 & 8192) != 0 ? null : l12, (i11 & 16384) != 0 ? null : l13, (i11 & 32768) != 0 ? null : l14, (i11 & 65536) != 0 ? null : l15, (i11 & 131072) != 0 ? null : str12, (i11 & 262144) != 0 ? null : bool);
        }

        public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : l11, (i11 & 8192) != 0 ? null : l12, (i11 & 16384) != 0 ? null : l13, (i11 & 32768) != 0 ? null : l14, (i11 & 65536) != 0 ? null : l15);
        }

        @InterfaceC3999a
        public Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, l11, l12, l13, l14, l15, (String) null, (Boolean) null);
        }

        public /* synthetic */ Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str10, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str11, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : l11, (i11 & 8192) != 0 ? null : l12, (i11 & 16384) != 0 ? null : l13, (i11 & 32768) != 0 ? null : l14, (i11 & 65536) != 0 ? null : l15, (i11 & 131072) != 0 ? null : str12);
        }

        @InterfaceC3999a
        public Page(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Long l11, Long l12, Long l13, Long l14, Long l15, String str12) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, l11, l12, l13, l14, l15, str12, (Boolean) null);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Posting;", "Landroid/os/Parcelable;", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Posting implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Posting> CREATOR = new Creator();
        private final String number;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Posting> {
            @Override // android.os.Parcelable.Creator
            public final Posting createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Posting(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Posting[] newArray(int i11) {
                return new Posting[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Posting() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Posting copy$default(Posting posting, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = posting.number;
            }
            return posting.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        public final Posting copy(String number) {
            return new Posting(number);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Posting) && Intrinsics.d(this.number, ((Posting) other).number);
        }

        public final String getNumber() {
            return this.number;
        }

        public int hashCode() {
            String str = this.number;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Posting(number=", this.number, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.number);
        }

        public Posting(String str) {
            this.number = str;
        }

        public /* synthetic */ Posting(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\bÆ\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u009a\u0002Bµ\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bY\u0010ZBã\u0006\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bY\u0010[Bï\u0006\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bY\u0010\\Bû\u0006\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bY\u0010]B\u0093\u0007\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bY\u0010^B\u009f\u0007\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bY\u0010_Jé\u0006\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0003\u0010»\u0001Jõ\u0006\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0003\u0010¼\u0001J\u0081\u0007\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0003\u0010½\u0001J\u0099\u0007\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0003\u0010¾\u0001J¥\u0007\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0003\u0010¿\u0001J\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\u0011\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010Û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010â\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010å\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010ï\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0012\u0010ð\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010ó\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010õ\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0003\u0010\u009e\u0001J\u0012\u0010ö\u0001\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0003\u0010\u009e\u0001J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010ø\u0001\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0003\u0010\u0089\u0001J\f\u0010ù\u0001\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010û\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010ü\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010ý\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010þ\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0080\u0002\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JHÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010aJ¾\u0007\u0010º\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00107\u001a\u0004\u0018\u00010)2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u008e\u0002J\u0007\u0010\u008f\u0002\u001a\u00020\u000eJ\u0016\u0010\u0090\u0002\u001a\u00020)2\n\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u0092\u0002HÖ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u000eHÖ\u0001J\n\u0010\u0094\u0002\u001a\u00020\u0005HÖ\u0001J\u001b\u0010\u0095\u0002\u001a\u00030\u0096\u00022\b\u0010\u0097\u0002\u001a\u00030\u0098\u00022\u0007\u0010\u0099\u0002\u001a\u00020\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bf\u0010aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bj\u0010iR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bk\u0010aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010n\u001a\u0004\bl\u0010mR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010n\u001a\u0004\bo\u0010mR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bp\u0010aR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bq\u0010aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010dR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010n\u001a\u0004\bs\u0010mR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bu\u0010dR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010n\u001a\u0004\bv\u0010mR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bw\u0010aR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\bx\u0010aR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\by\u0010dR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bz\u0010dR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\b{\u0010aR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\b|\u0010aR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\b}\u0010aR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010b\u001a\u0004\b~\u0010aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010dR\u0014\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010dR\u0016\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u0081\u0001\u0010aR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010dR\u0014\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010dR\u0014\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010dR\u0014\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010dR\u0014\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010dR\u0014\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010dR\u0018\u0010(\u001a\u0004\u0018\u00010)¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0014\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010dR\u0016\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u008c\u0001\u0010aR\u0014\u0010,\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010dR\u0014\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010iR\u0014\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010dR\u0016\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u0090\u0001\u0010aR\u0014\u00100\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010dR\u0014\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010dR\u0014\u00102\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010iR\u0014\u00103\u001a\u0004\u0018\u00010\n¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010iR\u0014\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010dR\u0014\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010dR\u0016\u00106\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b\u0097\u0001\u0010mR\u0018\u00107\u001a\u0004\u0018\u00010)¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0098\u0001\u0010\u0089\u0001R\u0014\u00108\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010dR\u0014\u00109\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010dR\u0018\u0010:\u001a\u0004\u0018\u00010)¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u009b\u0001\u0010\u0089\u0001R\u0014\u0010;\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010dR\u0018\u0010<\u001a\u0004\u0018\u00010=¢\u0006\r\n\u0003\u0010\u009f\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010>\u001a\u0004\u0018\u00010=¢\u0006\r\n\u0003\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010\u009e\u0001R\u0014\u0010?\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010dR\u0018\u0010@\u001a\u0004\u0018\u00010)¢\u0006\r\n\u0003\u0010\u008a\u0001\u001a\u0006\b¢\u0001\u0010\u0089\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u0014\u0010C\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010dR\u0016\u0010D\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b¦\u0001\u0010mR\u0016\u0010E\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b§\u0001\u0010mR\u0016\u0010F\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b¨\u0001\u0010mR\u0016\u0010G\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b©\u0001\u0010mR\u0014\u0010H\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\bª\u0001\u0010dR\u001b\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001R\u0014\u0010L\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010dR\u0014\u0010M\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010dR\u0014\u0010N\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010dR\u0014\u0010O\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010dR\u0014\u0010P\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010dR\u0014\u0010Q\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010dR\u0014\u0010R\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010dR\u0016\u0010S\u001a\u0004\u0018\u00010\u000e¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b´\u0001\u0010mR\u0014\u0010T\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010dR\u0014\u0010U\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010dR\u0014\u0010V\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010dR\u0014\u0010W\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010dR\u0016\u0010X\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010b\u001a\u0005\b¹\u0001\u0010a¨\u0006\u009b\u0002"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Properties;", "Landroid/os/Parcelable;", "regionId", "", "promocode", "", "availability", "paymentType", "orderId", "finalPrice", "Ljava/math/BigDecimal;", "originalPrice", "discount", "number", "", "stock", "sku", "categoryId", "phoneNumber", "quantity", "suggestType", "suggestValue", "countItems", "sellerId", "brandId", "errorCode", "brandName", "merchantId", "marketingActionId", "deliveryMarketingActionId", "flashsaleSlotId", "advId", "algo", "storehouseId", "postingId", "status", "unavailableReason", "filterValue", "cartType", "cardType", "checked", "", "due", "timeslotId", "deliveryService", "weight", "reason", "shipmentId", "date", "splitReason", "finalDeliveryPrice", "originalDeliveryPrice", "menuId", "deliveryType", "countPostings", "fromAbroad", "searchString", SelectionItemFormDTO.TITLE_FIELD_NAME, "cardIsRemember", "cardId", "longitude", "", "latitude", "virtualPostingId", "addressUid", "connectionType", "Lru/ozon/android/networkinfo/models/ConnectionType;", "contentType", "imageHeight", "imageWidth", "priority", "statusCode", ImagesContract.URL, "items", "", "Lru/ozon/tracker/model/EventEntity$Properties$Item;", "elementType", "cache", "stateId", "chatType", "language", "language_discarded", "courierTask", "turboPvzStaffId", "id", "type", "system_language", "context", "deliveryPointId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPromocode", "()Ljava/lang/String;", "getAvailability", "getPaymentType", "getOrderId", "getFinalPrice", "()Ljava/math/BigDecimal;", "getOriginalPrice", "getDiscount", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStock", "getSku", "getCategoryId", "getPhoneNumber", "getQuantity", "getSuggestType", "getSuggestValue", "getCountItems", "getSellerId", "getBrandId", "getErrorCode", "getBrandName", "getMerchantId", "getMarketingActionId", "getDeliveryMarketingActionId", "getFlashsaleSlotId", "getAdvId", "getAlgo", "getStorehouseId", "getPostingId", "getStatus", "getUnavailableReason", "getFilterValue", "getCartType", "getCardType", "getChecked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDue", "getTimeslotId", "getDeliveryService", "getWeight", "getReason", "getShipmentId", "getDate", "getSplitReason", "getFinalDeliveryPrice", "getOriginalDeliveryPrice", "getMenuId", "getDeliveryType", "getCountPostings", "getFromAbroad", "getSearchString", "getTitle", "getCardIsRemember", "getCardId", "getLongitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLatitude", "getVirtualPostingId", "getAddressUid", "getConnectionType", "()Lru/ozon/android/networkinfo/models/ConnectionType;", "getContentType", "getImageHeight", "getImageWidth", "getPriority", "getStatusCode", "getUrl", "getItems", "()Ljava/util/List;", "getElementType", "getCache", "getStateId", "getChatType", "getLanguage", "getLanguage_discarded", "getCourierTask", "getTurboPvzStaffId", "getId", "getType", "getSystem_language", "getContext", "getDeliveryPointId", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Properties;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Properties;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/tracker/model/EventEntity$Properties;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Properties;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$Properties;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/tracker/model/EventEntity$Properties;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Item", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Properties implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Properties> CREATOR = new Creator();
        private final Boolean addressUid;
        private final String advId;
        private final String algo;
        private final String availability;
        private final Long brandId;
        private final String brandName;
        private final String cache;
        private final String cardId;
        private final Boolean cardIsRemember;
        private final String cardType;
        private final String cartType;
        private final Long categoryId;
        private final String chatType;
        private final Boolean checked;
        private final ConnectionType connectionType;
        private final String contentType;
        private final String context;
        private final Integer countItems;
        private final Integer countPostings;
        private final String courierTask;
        private final String date;
        private final Long deliveryMarketingActionId;
        private final Long deliveryPointId;
        private final String deliveryService;
        private final String deliveryType;
        private final Long discount;
        private final String due;
        private final String elementType;
        private final String errorCode;
        private final String filterValue;
        private final BigDecimal finalDeliveryPrice;
        private final BigDecimal finalPrice;
        private final Long flashsaleSlotId;
        private final Boolean fromAbroad;
        private final String id;
        private final Integer imageHeight;
        private final Integer imageWidth;
        private final List<Item> items;
        private final String language;
        private final String language_discarded;
        private final Double latitude;
        private final Double longitude;
        private final Long marketingActionId;
        private final String menuId;
        private final Long merchantId;
        private final Integer number;
        private final String orderId;
        private final BigDecimal originalDeliveryPrice;
        private final BigDecimal originalPrice;
        private final Long paymentType;
        private final String phoneNumber;
        private final String postingId;
        private final Integer priority;
        private final String promocode;
        private final Integer quantity;
        private final String reason;
        private final Long regionId;
        private final String searchString;
        private final Long sellerId;
        private final Long shipmentId;
        private final Long sku;
        private final String splitReason;
        private final String stateId;
        private final String status;
        private final Integer statusCode;
        private final Integer stock;
        private final Long storehouseId;
        private final String suggestType;
        private final String suggestValue;
        private final String system_language;
        private final Long timeslotId;
        private final String title;
        private final Integer turboPvzStaffId;
        private final String type;
        private final String unavailableReason;
        private final String url;
        private final String virtualPostingId;
        private final BigDecimal weight;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Properties> {
            @Override // android.os.Parcelable.Creator
            public final Properties createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean bool;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Long valueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString3 = parcel.readString();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long valueOf10 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf11 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString4 = parcel.readString();
                Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Long valueOf14 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf15 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                Long valueOf16 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf17 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf18 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long valueOf19 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                Long valueOf20 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString17 = parcel.readString();
                Long valueOf21 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString18 = parcel.readString();
                BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                String readString19 = parcel.readString();
                Long valueOf22 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString26 = parcel.readString();
                Double valueOf24 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Double valueOf25 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                String readString27 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                ConnectionType connectionType = (ConnectionType) parcel.readParcelable(Properties.class.getClassLoader());
                String readString28 = parcel.readString();
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString29 = parcel.readString();
                if (parcel.readInt() == 0) {
                    bool = valueOf;
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    bool = valueOf;
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = b.b(Item.CREATOR, parcel, arrayList, i11, 1);
                        readInt = readInt;
                        valueOf5 = valueOf5;
                    }
                    connectionType = connectionType;
                }
                return new Properties(valueOf5, readString, readString2, valueOf6, readString3, bigDecimal, bigDecimal2, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, readString4, valueOf12, readString5, readString6, valueOf13, valueOf14, valueOf15, readString7, readString8, valueOf16, valueOf17, valueOf18, valueOf19, readString9, readString10, valueOf20, readString11, readString12, readString13, readString14, readString15, readString16, bool, readString17, valueOf21, readString18, bigDecimal3, readString19, valueOf22, readString20, readString21, bigDecimal4, bigDecimal5, readString22, readString23, valueOf23, valueOf2, readString24, readString25, valueOf3, readString26, valueOf24, valueOf25, readString27, valueOf4, connectionType, readString28, valueOf26, valueOf27, valueOf28, valueOf29, readString29, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Properties[] newArray(int i11) {
                return new Properties[i11];
            }
        }

        public Properties() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16383, null);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39, String str40, Long l26, int i11, int i12, int i13, Object obj) {
            Long l27 = (i11 & 1) != 0 ? properties.regionId : l11;
            return properties.copy(l27, (i11 & 2) != 0 ? properties.promocode : str, (i11 & 4) != 0 ? properties.availability : str2, (i11 & 8) != 0 ? properties.paymentType : l12, (i11 & 16) != 0 ? properties.orderId : str3, (i11 & 32) != 0 ? properties.finalPrice : bigDecimal, (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13, (i11 & 256) != 0 ? properties.number : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14, (i11 & 2048) != 0 ? properties.categoryId : l15, (i11 & 4096) != 0 ? properties.phoneNumber : str4, (i11 & 8192) != 0 ? properties.quantity : num3, (i11 & 16384) != 0 ? properties.suggestType : str5, (i11 & 32768) != 0 ? properties.suggestValue : str6, (i11 & 65536) != 0 ? properties.countItems : num4, (i11 & 131072) != 0 ? properties.sellerId : l16, (i11 & 262144) != 0 ? properties.brandId : l17, (i11 & 524288) != 0 ? properties.errorCode : str7, (i11 & 1048576) != 0 ? properties.brandName : str8, (i11 & 2097152) != 0 ? properties.merchantId : l18, (i11 & 4194304) != 0 ? properties.marketingActionId : l19, (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21, (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22, (i11 & 33554432) != 0 ? properties.advId : str9, (i11 & 67108864) != 0 ? properties.algo : str10, (i11 & 134217728) != 0 ? properties.storehouseId : l23, (i11 & 268435456) != 0 ? properties.postingId : str11, (i11 & 536870912) != 0 ? properties.status : str12, (i11 & 1073741824) != 0 ? properties.unavailableReason : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14, (i12 & 1) != 0 ? properties.cartType : str15, (i12 & 2) != 0 ? properties.cardType : str16, (i12 & 4) != 0 ? properties.checked : bool, (i12 & 8) != 0 ? properties.due : str17, (i12 & 16) != 0 ? properties.timeslotId : l24, (i12 & 32) != 0 ? properties.deliveryService : str18, (i12 & 64) != 0 ? properties.weight : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19, (i12 & 256) != 0 ? properties.shipmentId : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21, (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4, (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5, (i12 & 8192) != 0 ? properties.menuId : str22, (i12 & 16384) != 0 ? properties.deliveryType : str23, (i12 & 32768) != 0 ? properties.countPostings : num5, (i12 & 65536) != 0 ? properties.fromAbroad : bool2, (i12 & 131072) != 0 ? properties.searchString : str24, (i12 & 262144) != 0 ? properties.title : str25, (i12 & 524288) != 0 ? properties.cardIsRemember : bool3, (i12 & 1048576) != 0 ? properties.cardId : str26, (i12 & 2097152) != 0 ? properties.longitude : d11, (i12 & 4194304) != 0 ? properties.latitude : d12, (i12 & 8388608) != 0 ? properties.virtualPostingId : str27, (i12 & 16777216) != 0 ? properties.addressUid : bool4, (i12 & 33554432) != 0 ? properties.connectionType : connectionType, (i12 & 67108864) != 0 ? properties.contentType : str28, (i12 & 134217728) != 0 ? properties.imageHeight : num6, (i12 & 268435456) != 0 ? properties.imageWidth : num7, (i12 & 536870912) != 0 ? properties.priority : num8, (i12 & 1073741824) != 0 ? properties.statusCode : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29, (i13 & 1) != 0 ? properties.items : list, (i13 & 2) != 0 ? properties.elementType : str30, (i13 & 4) != 0 ? properties.cache : str31, (i13 & 8) != 0 ? properties.stateId : str32, (i13 & 16) != 0 ? properties.chatType : str33, (i13 & 32) != 0 ? properties.language : str34, (i13 & 64) != 0 ? properties.language_discarded : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.courierTask : str36, (i13 & 256) != 0 ? properties.turboPvzStaffId : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.id : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.type : str38, (i13 & 2048) != 0 ? properties.system_language : str39, (i13 & 4096) != 0 ? properties.context : str40, (i13 & 8192) != 0 ? properties.deliveryPointId : l26);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getRegionId() {
            return this.regionId;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getStock() {
            return this.stock;
        }

        /* renamed from: component11, reason: from getter */
        public final Long getSku() {
            return this.sku;
        }

        /* renamed from: component12, reason: from getter */
        public final Long getCategoryId() {
            return this.categoryId;
        }

        /* renamed from: component13, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component14, reason: from getter */
        public final Integer getQuantity() {
            return this.quantity;
        }

        /* renamed from: component15, reason: from getter */
        public final String getSuggestType() {
            return this.suggestType;
        }

        /* renamed from: component16, reason: from getter */
        public final String getSuggestValue() {
            return this.suggestValue;
        }

        /* renamed from: component17, reason: from getter */
        public final Integer getCountItems() {
            return this.countItems;
        }

        /* renamed from: component18, reason: from getter */
        public final Long getSellerId() {
            return this.sellerId;
        }

        /* renamed from: component19, reason: from getter */
        public final Long getBrandId() {
            return this.brandId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPromocode() {
            return this.promocode;
        }

        /* renamed from: component20, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component21, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        /* renamed from: component22, reason: from getter */
        public final Long getMerchantId() {
            return this.merchantId;
        }

        /* renamed from: component23, reason: from getter */
        public final Long getMarketingActionId() {
            return this.marketingActionId;
        }

        /* renamed from: component24, reason: from getter */
        public final Long getDeliveryMarketingActionId() {
            return this.deliveryMarketingActionId;
        }

        /* renamed from: component25, reason: from getter */
        public final Long getFlashsaleSlotId() {
            return this.flashsaleSlotId;
        }

        /* renamed from: component26, reason: from getter */
        public final String getAdvId() {
            return this.advId;
        }

        /* renamed from: component27, reason: from getter */
        public final String getAlgo() {
            return this.algo;
        }

        /* renamed from: component28, reason: from getter */
        public final Long getStorehouseId() {
            return this.storehouseId;
        }

        /* renamed from: component29, reason: from getter */
        public final String getPostingId() {
            return this.postingId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAvailability() {
            return this.availability;
        }

        /* renamed from: component30, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component31, reason: from getter */
        public final String getUnavailableReason() {
            return this.unavailableReason;
        }

        /* renamed from: component32, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        /* renamed from: component33, reason: from getter */
        public final String getCartType() {
            return this.cartType;
        }

        /* renamed from: component34, reason: from getter */
        public final String getCardType() {
            return this.cardType;
        }

        /* renamed from: component35, reason: from getter */
        public final Boolean getChecked() {
            return this.checked;
        }

        /* renamed from: component36, reason: from getter */
        public final String getDue() {
            return this.due;
        }

        /* renamed from: component37, reason: from getter */
        public final Long getTimeslotId() {
            return this.timeslotId;
        }

        /* renamed from: component38, reason: from getter */
        public final String getDeliveryService() {
            return this.deliveryService;
        }

        /* renamed from: component39, reason: from getter */
        public final BigDecimal getWeight() {
            return this.weight;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getPaymentType() {
            return this.paymentType;
        }

        /* renamed from: component40, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component41, reason: from getter */
        public final Long getShipmentId() {
            return this.shipmentId;
        }

        /* renamed from: component42, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* renamed from: component43, reason: from getter */
        public final String getSplitReason() {
            return this.splitReason;
        }

        /* renamed from: component44, reason: from getter */
        public final BigDecimal getFinalDeliveryPrice() {
            return this.finalDeliveryPrice;
        }

        /* renamed from: component45, reason: from getter */
        public final BigDecimal getOriginalDeliveryPrice() {
            return this.originalDeliveryPrice;
        }

        /* renamed from: component46, reason: from getter */
        public final String getMenuId() {
            return this.menuId;
        }

        /* renamed from: component47, reason: from getter */
        public final String getDeliveryType() {
            return this.deliveryType;
        }

        /* renamed from: component48, reason: from getter */
        public final Integer getCountPostings() {
            return this.countPostings;
        }

        /* renamed from: component49, reason: from getter */
        public final Boolean getFromAbroad() {
            return this.fromAbroad;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: component50, reason: from getter */
        public final String getSearchString() {
            return this.searchString;
        }

        /* renamed from: component51, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component52, reason: from getter */
        public final Boolean getCardIsRemember() {
            return this.cardIsRemember;
        }

        /* renamed from: component53, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        /* renamed from: component54, reason: from getter */
        public final Double getLongitude() {
            return this.longitude;
        }

        /* renamed from: component55, reason: from getter */
        public final Double getLatitude() {
            return this.latitude;
        }

        /* renamed from: component56, reason: from getter */
        public final String getVirtualPostingId() {
            return this.virtualPostingId;
        }

        /* renamed from: component57, reason: from getter */
        public final Boolean getAddressUid() {
            return this.addressUid;
        }

        /* renamed from: component58, reason: from getter */
        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        /* renamed from: component59, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getFinalPrice() {
            return this.finalPrice;
        }

        /* renamed from: component60, reason: from getter */
        public final Integer getImageHeight() {
            return this.imageHeight;
        }

        /* renamed from: component61, reason: from getter */
        public final Integer getImageWidth() {
            return this.imageWidth;
        }

        /* renamed from: component62, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        /* renamed from: component63, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component64, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final List<Item> component65() {
            return this.items;
        }

        /* renamed from: component66, reason: from getter */
        public final String getElementType() {
            return this.elementType;
        }

        /* renamed from: component67, reason: from getter */
        public final String getCache() {
            return this.cache;
        }

        /* renamed from: component68, reason: from getter */
        public final String getStateId() {
            return this.stateId;
        }

        /* renamed from: component69, reason: from getter */
        public final String getChatType() {
            return this.chatType;
        }

        /* renamed from: component7, reason: from getter */
        public final BigDecimal getOriginalPrice() {
            return this.originalPrice;
        }

        /* renamed from: component70, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* renamed from: component71, reason: from getter */
        public final String getLanguage_discarded() {
            return this.language_discarded;
        }

        /* renamed from: component72, reason: from getter */
        public final String getCourierTask() {
            return this.courierTask;
        }

        /* renamed from: component73, reason: from getter */
        public final Integer getTurboPvzStaffId() {
            return this.turboPvzStaffId;
        }

        /* renamed from: component74, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component75, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component76, reason: from getter */
        public final String getSystem_language() {
            return this.system_language;
        }

        /* renamed from: component77, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component78, reason: from getter */
        public final Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

        /* renamed from: component8, reason: from getter */
        public final Long getDiscount() {
            return this.discount;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getNumber() {
            return this.number;
        }

        @NotNull
        public final Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List<Item> items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded, String courierTask, Integer turboPvzStaffId, String id2, String type, String system_language, String context, Long deliveryPointId) {
            return new Properties(regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, courierTask, turboPvzStaffId, id2, type, system_language, context, deliveryPointId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) other;
            return Intrinsics.d(this.regionId, properties.regionId) && Intrinsics.d(this.promocode, properties.promocode) && Intrinsics.d(this.availability, properties.availability) && Intrinsics.d(this.paymentType, properties.paymentType) && Intrinsics.d(this.orderId, properties.orderId) && Intrinsics.d(this.finalPrice, properties.finalPrice) && Intrinsics.d(this.originalPrice, properties.originalPrice) && Intrinsics.d(this.discount, properties.discount) && Intrinsics.d(this.number, properties.number) && Intrinsics.d(this.stock, properties.stock) && Intrinsics.d(this.sku, properties.sku) && Intrinsics.d(this.categoryId, properties.categoryId) && Intrinsics.d(this.phoneNumber, properties.phoneNumber) && Intrinsics.d(this.quantity, properties.quantity) && Intrinsics.d(this.suggestType, properties.suggestType) && Intrinsics.d(this.suggestValue, properties.suggestValue) && Intrinsics.d(this.countItems, properties.countItems) && Intrinsics.d(this.sellerId, properties.sellerId) && Intrinsics.d(this.brandId, properties.brandId) && Intrinsics.d(this.errorCode, properties.errorCode) && Intrinsics.d(this.brandName, properties.brandName) && Intrinsics.d(this.merchantId, properties.merchantId) && Intrinsics.d(this.marketingActionId, properties.marketingActionId) && Intrinsics.d(this.deliveryMarketingActionId, properties.deliveryMarketingActionId) && Intrinsics.d(this.flashsaleSlotId, properties.flashsaleSlotId) && Intrinsics.d(this.advId, properties.advId) && Intrinsics.d(this.algo, properties.algo) && Intrinsics.d(this.storehouseId, properties.storehouseId) && Intrinsics.d(this.postingId, properties.postingId) && Intrinsics.d(this.status, properties.status) && Intrinsics.d(this.unavailableReason, properties.unavailableReason) && Intrinsics.d(this.filterValue, properties.filterValue) && Intrinsics.d(this.cartType, properties.cartType) && Intrinsics.d(this.cardType, properties.cardType) && Intrinsics.d(this.checked, properties.checked) && Intrinsics.d(this.due, properties.due) && Intrinsics.d(this.timeslotId, properties.timeslotId) && Intrinsics.d(this.deliveryService, properties.deliveryService) && Intrinsics.d(this.weight, properties.weight) && Intrinsics.d(this.reason, properties.reason) && Intrinsics.d(this.shipmentId, properties.shipmentId) && Intrinsics.d(this.date, properties.date) && Intrinsics.d(this.splitReason, properties.splitReason) && Intrinsics.d(this.finalDeliveryPrice, properties.finalDeliveryPrice) && Intrinsics.d(this.originalDeliveryPrice, properties.originalDeliveryPrice) && Intrinsics.d(this.menuId, properties.menuId) && Intrinsics.d(this.deliveryType, properties.deliveryType) && Intrinsics.d(this.countPostings, properties.countPostings) && Intrinsics.d(this.fromAbroad, properties.fromAbroad) && Intrinsics.d(this.searchString, properties.searchString) && Intrinsics.d(this.title, properties.title) && Intrinsics.d(this.cardIsRemember, properties.cardIsRemember) && Intrinsics.d(this.cardId, properties.cardId) && Intrinsics.d(this.longitude, properties.longitude) && Intrinsics.d(this.latitude, properties.latitude) && Intrinsics.d(this.virtualPostingId, properties.virtualPostingId) && Intrinsics.d(this.addressUid, properties.addressUid) && this.connectionType == properties.connectionType && Intrinsics.d(this.contentType, properties.contentType) && Intrinsics.d(this.imageHeight, properties.imageHeight) && Intrinsics.d(this.imageWidth, properties.imageWidth) && Intrinsics.d(this.priority, properties.priority) && Intrinsics.d(this.statusCode, properties.statusCode) && Intrinsics.d(this.url, properties.url) && Intrinsics.d(this.items, properties.items) && Intrinsics.d(this.elementType, properties.elementType) && Intrinsics.d(this.cache, properties.cache) && Intrinsics.d(this.stateId, properties.stateId) && Intrinsics.d(this.chatType, properties.chatType) && Intrinsics.d(this.language, properties.language) && Intrinsics.d(this.language_discarded, properties.language_discarded) && Intrinsics.d(this.courierTask, properties.courierTask) && Intrinsics.d(this.turboPvzStaffId, properties.turboPvzStaffId) && Intrinsics.d(this.id, properties.id) && Intrinsics.d(this.type, properties.type) && Intrinsics.d(this.system_language, properties.system_language) && Intrinsics.d(this.context, properties.context) && Intrinsics.d(this.deliveryPointId, properties.deliveryPointId);
        }

        public final Boolean getAddressUid() {
            return this.addressUid;
        }

        public final String getAdvId() {
            return this.advId;
        }

        public final String getAlgo() {
            return this.algo;
        }

        public final String getAvailability() {
            return this.availability;
        }

        public final Long getBrandId() {
            return this.brandId;
        }

        public final String getBrandName() {
            return this.brandName;
        }

        public final String getCache() {
            return this.cache;
        }

        public final String getCardId() {
            return this.cardId;
        }

        public final Boolean getCardIsRemember() {
            return this.cardIsRemember;
        }

        public final String getCardType() {
            return this.cardType;
        }

        public final String getCartType() {
            return this.cartType;
        }

        public final Long getCategoryId() {
            return this.categoryId;
        }

        public final String getChatType() {
            return this.chatType;
        }

        public final Boolean getChecked() {
            return this.checked;
        }

        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getContext() {
            return this.context;
        }

        public final Integer getCountItems() {
            return this.countItems;
        }

        public final Integer getCountPostings() {
            return this.countPostings;
        }

        public final String getCourierTask() {
            return this.courierTask;
        }

        public final String getDate() {
            return this.date;
        }

        public final Long getDeliveryMarketingActionId() {
            return this.deliveryMarketingActionId;
        }

        public final Long getDeliveryPointId() {
            return this.deliveryPointId;
        }

        public final String getDeliveryService() {
            return this.deliveryService;
        }

        public final String getDeliveryType() {
            return this.deliveryType;
        }

        public final Long getDiscount() {
            return this.discount;
        }

        public final String getDue() {
            return this.due;
        }

        public final String getElementType() {
            return this.elementType;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public final BigDecimal getFinalDeliveryPrice() {
            return this.finalDeliveryPrice;
        }

        public final BigDecimal getFinalPrice() {
            return this.finalPrice;
        }

        public final Long getFlashsaleSlotId() {
            return this.flashsaleSlotId;
        }

        public final Boolean getFromAbroad() {
            return this.fromAbroad;
        }

        public final String getId() {
            return this.id;
        }

        public final Integer getImageHeight() {
            return this.imageHeight;
        }

        public final Integer getImageWidth() {
            return this.imageWidth;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLanguage_discarded() {
            return this.language_discarded;
        }

        public final Double getLatitude() {
            return this.latitude;
        }

        public final Double getLongitude() {
            return this.longitude;
        }

        public final Long getMarketingActionId() {
            return this.marketingActionId;
        }

        public final String getMenuId() {
            return this.menuId;
        }

        public final Long getMerchantId() {
            return this.merchantId;
        }

        public final Integer getNumber() {
            return this.number;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final BigDecimal getOriginalDeliveryPrice() {
            return this.originalDeliveryPrice;
        }

        public final BigDecimal getOriginalPrice() {
            return this.originalPrice;
        }

        public final Long getPaymentType() {
            return this.paymentType;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getPostingId() {
            return this.postingId;
        }

        public final Integer getPriority() {
            return this.priority;
        }

        public final String getPromocode() {
            return this.promocode;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final String getReason() {
            return this.reason;
        }

        public final Long getRegionId() {
            return this.regionId;
        }

        public final String getSearchString() {
            return this.searchString;
        }

        public final Long getSellerId() {
            return this.sellerId;
        }

        public final Long getShipmentId() {
            return this.shipmentId;
        }

        public final Long getSku() {
            return this.sku;
        }

        public final String getSplitReason() {
            return this.splitReason;
        }

        public final String getStateId() {
            return this.stateId;
        }

        public final String getStatus() {
            return this.status;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final Integer getStock() {
            return this.stock;
        }

        public final Long getStorehouseId() {
            return this.storehouseId;
        }

        public final String getSuggestType() {
            return this.suggestType;
        }

        public final String getSuggestValue() {
            return this.suggestValue;
        }

        public final String getSystem_language() {
            return this.system_language;
        }

        public final Long getTimeslotId() {
            return this.timeslotId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Integer getTurboPvzStaffId() {
            return this.turboPvzStaffId;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUnavailableReason() {
            return this.unavailableReason;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getVirtualPostingId() {
            return this.virtualPostingId;
        }

        public final BigDecimal getWeight() {
            return this.weight;
        }

        public int hashCode() {
            Long l11 = this.regionId;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.promocode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.availability;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l12 = this.paymentType;
            int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str3 = this.orderId;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BigDecimal bigDecimal = this.finalPrice;
            int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.originalPrice;
            int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            Long l13 = this.discount;
            int hashCode8 = (hashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Integer num = this.number;
            int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.stock;
            int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l14 = this.sku;
            int hashCode11 = (hashCode10 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.categoryId;
            int hashCode12 = (hashCode11 + (l15 == null ? 0 : l15.hashCode())) * 31;
            String str4 = this.phoneNumber;
            int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num3 = this.quantity;
            int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str5 = this.suggestType;
            int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.suggestValue;
            int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num4 = this.countItems;
            int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Long l16 = this.sellerId;
            int hashCode18 = (hashCode17 + (l16 == null ? 0 : l16.hashCode())) * 31;
            Long l17 = this.brandId;
            int hashCode19 = (hashCode18 + (l17 == null ? 0 : l17.hashCode())) * 31;
            String str7 = this.errorCode;
            int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.brandName;
            int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Long l18 = this.merchantId;
            int hashCode22 = (hashCode21 + (l18 == null ? 0 : l18.hashCode())) * 31;
            Long l19 = this.marketingActionId;
            int hashCode23 = (hashCode22 + (l19 == null ? 0 : l19.hashCode())) * 31;
            Long l21 = this.deliveryMarketingActionId;
            int hashCode24 = (hashCode23 + (l21 == null ? 0 : l21.hashCode())) * 31;
            Long l22 = this.flashsaleSlotId;
            int hashCode25 = (hashCode24 + (l22 == null ? 0 : l22.hashCode())) * 31;
            String str9 = this.advId;
            int hashCode26 = (hashCode25 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.algo;
            int hashCode27 = (hashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Long l23 = this.storehouseId;
            int hashCode28 = (hashCode27 + (l23 == null ? 0 : l23.hashCode())) * 31;
            String str11 = this.postingId;
            int hashCode29 = (hashCode28 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.status;
            int hashCode30 = (hashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.unavailableReason;
            int hashCode31 = (hashCode30 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.filterValue;
            int hashCode32 = (hashCode31 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.cartType;
            int hashCode33 = (hashCode32 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.cardType;
            int hashCode34 = (hashCode33 + (str16 == null ? 0 : str16.hashCode())) * 31;
            Boolean bool = this.checked;
            int hashCode35 = (hashCode34 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str17 = this.due;
            int hashCode36 = (hashCode35 + (str17 == null ? 0 : str17.hashCode())) * 31;
            Long l24 = this.timeslotId;
            int hashCode37 = (hashCode36 + (l24 == null ? 0 : l24.hashCode())) * 31;
            String str18 = this.deliveryService;
            int hashCode38 = (hashCode37 + (str18 == null ? 0 : str18.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.weight;
            int hashCode39 = (hashCode38 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            String str19 = this.reason;
            int hashCode40 = (hashCode39 + (str19 == null ? 0 : str19.hashCode())) * 31;
            Long l25 = this.shipmentId;
            int hashCode41 = (hashCode40 + (l25 == null ? 0 : l25.hashCode())) * 31;
            String str20 = this.date;
            int hashCode42 = (hashCode41 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.splitReason;
            int hashCode43 = (hashCode42 + (str21 == null ? 0 : str21.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.finalDeliveryPrice;
            int hashCode44 = (hashCode43 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.originalDeliveryPrice;
            int hashCode45 = (hashCode44 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            String str22 = this.menuId;
            int hashCode46 = (hashCode45 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.deliveryType;
            int hashCode47 = (hashCode46 + (str23 == null ? 0 : str23.hashCode())) * 31;
            Integer num5 = this.countPostings;
            int hashCode48 = (hashCode47 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool2 = this.fromAbroad;
            int hashCode49 = (hashCode48 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str24 = this.searchString;
            int hashCode50 = (hashCode49 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.title;
            int hashCode51 = (hashCode50 + (str25 == null ? 0 : str25.hashCode())) * 31;
            Boolean bool3 = this.cardIsRemember;
            int hashCode52 = (hashCode51 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str26 = this.cardId;
            int hashCode53 = (hashCode52 + (str26 == null ? 0 : str26.hashCode())) * 31;
            Double d11 = this.longitude;
            int hashCode54 = (hashCode53 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.latitude;
            int hashCode55 = (hashCode54 + (d12 == null ? 0 : d12.hashCode())) * 31;
            String str27 = this.virtualPostingId;
            int hashCode56 = (hashCode55 + (str27 == null ? 0 : str27.hashCode())) * 31;
            Boolean bool4 = this.addressUid;
            int hashCode57 = (hashCode56 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            ConnectionType connectionType = this.connectionType;
            int hashCode58 = (hashCode57 + (connectionType == null ? 0 : connectionType.hashCode())) * 31;
            String str28 = this.contentType;
            int hashCode59 = (hashCode58 + (str28 == null ? 0 : str28.hashCode())) * 31;
            Integer num6 = this.imageHeight;
            int hashCode60 = (hashCode59 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.imageWidth;
            int hashCode61 = (hashCode60 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.priority;
            int hashCode62 = (hashCode61 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.statusCode;
            int hashCode63 = (hashCode62 + (num9 == null ? 0 : num9.hashCode())) * 31;
            String str29 = this.url;
            int hashCode64 = (hashCode63 + (str29 == null ? 0 : str29.hashCode())) * 31;
            List<Item> list = this.items;
            int hashCode65 = (hashCode64 + (list == null ? 0 : list.hashCode())) * 31;
            String str30 = this.elementType;
            int hashCode66 = (hashCode65 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.cache;
            int hashCode67 = (hashCode66 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.stateId;
            int hashCode68 = (hashCode67 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.chatType;
            int hashCode69 = (hashCode68 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.language;
            int hashCode70 = (hashCode69 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.language_discarded;
            int hashCode71 = (hashCode70 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.courierTask;
            int hashCode72 = (hashCode71 + (str36 == null ? 0 : str36.hashCode())) * 31;
            Integer num10 = this.turboPvzStaffId;
            int hashCode73 = (hashCode72 + (num10 == null ? 0 : num10.hashCode())) * 31;
            String str37 = this.id;
            int hashCode74 = (hashCode73 + (str37 == null ? 0 : str37.hashCode())) * 31;
            String str38 = this.type;
            int hashCode75 = (hashCode74 + (str38 == null ? 0 : str38.hashCode())) * 31;
            String str39 = this.system_language;
            int hashCode76 = (hashCode75 + (str39 == null ? 0 : str39.hashCode())) * 31;
            String str40 = this.context;
            int hashCode77 = (hashCode76 + (str40 == null ? 0 : str40.hashCode())) * 31;
            Long l26 = this.deliveryPointId;
            return hashCode77 + (l26 != null ? l26.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.regionId;
            String str = this.promocode;
            String str2 = this.availability;
            Long l12 = this.paymentType;
            String str3 = this.orderId;
            BigDecimal bigDecimal = this.finalPrice;
            BigDecimal bigDecimal2 = this.originalPrice;
            Long l13 = this.discount;
            Integer num = this.number;
            Integer num2 = this.stock;
            Long l14 = this.sku;
            Long l15 = this.categoryId;
            String str4 = this.phoneNumber;
            Integer num3 = this.quantity;
            String str5 = this.suggestType;
            String str6 = this.suggestValue;
            Integer num4 = this.countItems;
            Long l16 = this.sellerId;
            Long l17 = this.brandId;
            String str7 = this.errorCode;
            String str8 = this.brandName;
            Long l18 = this.merchantId;
            Long l19 = this.marketingActionId;
            Long l21 = this.deliveryMarketingActionId;
            Long l22 = this.flashsaleSlotId;
            String str9 = this.advId;
            String str10 = this.algo;
            Long l23 = this.storehouseId;
            String str11 = this.postingId;
            String str12 = this.status;
            String str13 = this.unavailableReason;
            String str14 = this.filterValue;
            String str15 = this.cartType;
            String str16 = this.cardType;
            Boolean bool = this.checked;
            String str17 = this.due;
            Long l24 = this.timeslotId;
            String str18 = this.deliveryService;
            BigDecimal bigDecimal3 = this.weight;
            String str19 = this.reason;
            Long l25 = this.shipmentId;
            String str20 = this.date;
            String str21 = this.splitReason;
            BigDecimal bigDecimal4 = this.finalDeliveryPrice;
            BigDecimal bigDecimal5 = this.originalDeliveryPrice;
            String str22 = this.menuId;
            String str23 = this.deliveryType;
            Integer num5 = this.countPostings;
            Boolean bool2 = this.fromAbroad;
            String str24 = this.searchString;
            String str25 = this.title;
            Boolean bool3 = this.cardIsRemember;
            String str26 = this.cardId;
            Double d11 = this.longitude;
            Double d12 = this.latitude;
            String str27 = this.virtualPostingId;
            Boolean bool4 = this.addressUid;
            ConnectionType connectionType = this.connectionType;
            String str28 = this.contentType;
            Integer num6 = this.imageHeight;
            Integer num7 = this.imageWidth;
            Integer num8 = this.priority;
            Integer num9 = this.statusCode;
            String str29 = this.url;
            List<Item> list = this.items;
            String str30 = this.elementType;
            String str31 = this.cache;
            String str32 = this.stateId;
            String str33 = this.chatType;
            String str34 = this.language;
            String str35 = this.language_discarded;
            String str36 = this.courierTask;
            Integer num10 = this.turboPvzStaffId;
            String str37 = this.id;
            String str38 = this.type;
            String str39 = this.system_language;
            String str40 = this.context;
            Long l26 = this.deliveryPointId;
            StringBuilder sb2 = new StringBuilder("Properties(regionId=");
            sb2.append(l11);
            sb2.append(", promocode=");
            sb2.append(str);
            sb2.append(", availability=");
            sb2.append(str2);
            sb2.append(", paymentType=");
            sb2.append(l12);
            sb2.append(", orderId=");
            sb2.append(str3);
            sb2.append(", finalPrice=");
            sb2.append(bigDecimal);
            sb2.append(", originalPrice=");
            sb2.append(bigDecimal2);
            sb2.append(", discount=");
            sb2.append(l13);
            sb2.append(", number=");
            Ef0.c.e(sb2, num, ", stock=", num2, ", sku=");
            TY.a.e(sb2, l14, ", categoryId=", l15, ", phoneNumber=");
            C2454a.f(num3, str4, ", quantity=", ", suggestType=", sb2);
            Nh.a.h(sb2, str5, ", suggestValue=", str6, ", countItems=");
            sb2.append(num4);
            sb2.append(", sellerId=");
            sb2.append(l16);
            sb2.append(", brandId=");
            sb2.append(l17);
            sb2.append(", errorCode=");
            sb2.append(str7);
            sb2.append(", brandName=");
            sb2.append(str8);
            sb2.append(", merchantId=");
            sb2.append(l18);
            sb2.append(", marketingActionId=");
            TY.a.e(sb2, l19, ", deliveryMarketingActionId=", l21, ", flashsaleSlotId=");
            sb2.append(l22);
            sb2.append(", advId=");
            sb2.append(str9);
            sb2.append(", algo=");
            sb2.append(str10);
            sb2.append(", storehouseId=");
            sb2.append(l23);
            sb2.append(", postingId=");
            Nh.a.h(sb2, str11, ", status=", str12, ", unavailableReason=");
            Nh.a.h(sb2, str13, ", filterValue=", str14, ", cartType=");
            Nh.a.h(sb2, str15, ", cardType=", str16, ", checked=");
            HY.b.c(bool, ", due=", str17, ", timeslotId=", sb2);
            sb2.append(l24);
            sb2.append(", deliveryService=");
            sb2.append(str18);
            sb2.append(", weight=");
            sb2.append(bigDecimal3);
            sb2.append(", reason=");
            sb2.append(str19);
            sb2.append(", shipmentId=");
            sb2.append(l25);
            sb2.append(", date=");
            sb2.append(str20);
            sb2.append(", splitReason=");
            sb2.append(str21);
            sb2.append(", finalDeliveryPrice=");
            sb2.append(bigDecimal4);
            sb2.append(", originalDeliveryPrice=");
            sb2.append(bigDecimal5);
            sb2.append(", menuId=");
            sb2.append(str22);
            sb2.append(", deliveryType=");
            C2454a.f(num5, str23, ", countPostings=", ", fromAbroad=", sb2);
            HY.b.c(bool2, ", searchString=", str24, ", title=", sb2);
            Sh.a.d(bool3, str25, ", cardIsRemember=", ", cardId=", sb2);
            sb2.append(str26);
            sb2.append(", longitude=");
            sb2.append(d11);
            sb2.append(", latitude=");
            sb2.append(d12);
            sb2.append(", virtualPostingId=");
            sb2.append(str27);
            sb2.append(", addressUid=");
            sb2.append(bool4);
            sb2.append(", connectionType=");
            sb2.append(connectionType);
            sb2.append(", contentType=");
            C2454a.f(num6, str28, ", imageHeight=", ", imageWidth=", sb2);
            Ef0.c.e(sb2, num7, ", priority=", num8, ", statusCode=");
            V.f(num9, ", url=", str29, ", items=", sb2);
            e.i(", elementType=", str30, ", cache=", sb2, list);
            Nh.a.h(sb2, str31, ", stateId=", str32, ", chatType=");
            Nh.a.h(sb2, str33, ", language=", str34, ", language_discarded=");
            Nh.a.h(sb2, str35, ", courierTask=", str36, ", turboPvzStaffId=");
            V.f(num10, ", id=", str37, ", type=", sb2);
            Nh.a.h(sb2, str38, ", system_language=", str39, ", context=");
            sb2.append(str40);
            sb2.append(", deliveryPointId=");
            sb2.append(l26);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l11 = this.regionId;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.promocode);
            dest.writeString(this.availability);
            Long l12 = this.paymentType;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l12);
            }
            dest.writeString(this.orderId);
            dest.writeSerializable(this.finalPrice);
            dest.writeSerializable(this.originalPrice);
            Long l13 = this.discount;
            if (l13 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l13);
            }
            Integer num = this.number;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Integer num2 = this.stock;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Long l14 = this.sku;
            if (l14 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l14);
            }
            Long l15 = this.categoryId;
            if (l15 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l15);
            }
            dest.writeString(this.phoneNumber);
            Integer num3 = this.quantity;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            dest.writeString(this.suggestType);
            dest.writeString(this.suggestValue);
            Integer num4 = this.countItems;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
            Long l16 = this.sellerId;
            if (l16 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l16);
            }
            Long l17 = this.brandId;
            if (l17 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l17);
            }
            dest.writeString(this.errorCode);
            dest.writeString(this.brandName);
            Long l18 = this.merchantId;
            if (l18 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l18);
            }
            Long l19 = this.marketingActionId;
            if (l19 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l19);
            }
            Long l21 = this.deliveryMarketingActionId;
            if (l21 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l21);
            }
            Long l22 = this.flashsaleSlotId;
            if (l22 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l22);
            }
            dest.writeString(this.advId);
            dest.writeString(this.algo);
            Long l23 = this.storehouseId;
            if (l23 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l23);
            }
            dest.writeString(this.postingId);
            dest.writeString(this.status);
            dest.writeString(this.unavailableReason);
            dest.writeString(this.filterValue);
            dest.writeString(this.cartType);
            dest.writeString(this.cardType);
            Boolean bool = this.checked;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
            }
            dest.writeString(this.due);
            Long l24 = this.timeslotId;
            if (l24 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l24);
            }
            dest.writeString(this.deliveryService);
            dest.writeSerializable(this.weight);
            dest.writeString(this.reason);
            Long l25 = this.shipmentId;
            if (l25 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l25);
            }
            dest.writeString(this.date);
            dest.writeString(this.splitReason);
            dest.writeSerializable(this.finalDeliveryPrice);
            dest.writeSerializable(this.originalDeliveryPrice);
            dest.writeString(this.menuId);
            dest.writeString(this.deliveryType);
            Integer num5 = this.countPostings;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num5);
            }
            Boolean bool2 = this.fromAbroad;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool2);
            }
            dest.writeString(this.searchString);
            dest.writeString(this.title);
            Boolean bool3 = this.cardIsRemember;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool3);
            }
            dest.writeString(this.cardId);
            Double d11 = this.longitude;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d11);
            }
            Double d12 = this.latitude;
            if (d12 == null) {
                dest.writeInt(0);
            } else {
                TY.a.d(dest, 1, d12);
            }
            dest.writeString(this.virtualPostingId);
            Boolean bool4 = this.addressUid;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool4);
            }
            dest.writeParcelable(this.connectionType, flags);
            dest.writeString(this.contentType);
            Integer num6 = this.imageHeight;
            if (num6 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num6);
            }
            Integer num7 = this.imageWidth;
            if (num7 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num7);
            }
            Integer num8 = this.priority;
            if (num8 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num8);
            }
            Integer num9 = this.statusCode;
            if (num9 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num9);
            }
            dest.writeString(this.url);
            List<Item> list = this.items;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    ((Item) c11.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.elementType);
            dest.writeString(this.cache);
            dest.writeString(this.stateId);
            dest.writeString(this.chatType);
            dest.writeString(this.language);
            dest.writeString(this.language_discarded);
            dest.writeString(this.courierTask);
            Integer num10 = this.turboPvzStaffId;
            if (num10 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num10);
            }
            dest.writeString(this.id);
            dest.writeString(this.type);
            dest.writeString(this.system_language);
            dest.writeString(this.context);
            Long l26 = this.deliveryPointId;
            if (l26 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l26);
            }
        }

        public Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List<Item> list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39, String str40, Long l26) {
            this.regionId = l11;
            this.promocode = str;
            this.availability = str2;
            this.paymentType = l12;
            this.orderId = str3;
            this.finalPrice = bigDecimal;
            this.originalPrice = bigDecimal2;
            this.discount = l13;
            this.number = num;
            this.stock = num2;
            this.sku = l14;
            this.categoryId = l15;
            this.phoneNumber = str4;
            this.quantity = num3;
            this.suggestType = str5;
            this.suggestValue = str6;
            this.countItems = num4;
            this.sellerId = l16;
            this.brandId = l17;
            this.errorCode = str7;
            this.brandName = str8;
            this.merchantId = l18;
            this.marketingActionId = l19;
            this.deliveryMarketingActionId = l21;
            this.flashsaleSlotId = l22;
            this.advId = str9;
            this.algo = str10;
            this.storehouseId = l23;
            this.postingId = str11;
            this.status = str12;
            this.unavailableReason = str13;
            this.filterValue = str14;
            this.cartType = str15;
            this.cardType = str16;
            this.checked = bool;
            this.due = str17;
            this.timeslotId = l24;
            this.deliveryService = str18;
            this.weight = bigDecimal3;
            this.reason = str19;
            this.shipmentId = l25;
            this.date = str20;
            this.splitReason = str21;
            this.finalDeliveryPrice = bigDecimal4;
            this.originalDeliveryPrice = bigDecimal5;
            this.menuId = str22;
            this.deliveryType = str23;
            this.countPostings = num5;
            this.fromAbroad = bool2;
            this.searchString = str24;
            this.title = str25;
            this.cardIsRemember = bool3;
            this.cardId = str26;
            this.longitude = d11;
            this.latitude = d12;
            this.virtualPostingId = str27;
            this.addressUid = bool4;
            this.connectionType = connectionType;
            this.contentType = str28;
            this.imageHeight = num6;
            this.imageWidth = num7;
            this.priority = num8;
            this.statusCode = num9;
            this.url = str29;
            this.items = list;
            this.elementType = str30;
            this.cache = str31;
            this.stateId = str32;
            this.chatType = str33;
            this.language = str34;
            this.language_discarded = str35;
            this.courierTask = str36;
            this.turboPvzStaffId = num10;
            this.id = str37;
            this.type = str38;
            this.system_language = str39;
            this.context = str40;
            this.deliveryPointId = l26;
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, int i11, int i12, int i13, Object obj) {
            String str36;
            String str37;
            Double d13;
            String str38;
            Boolean bool5;
            ConnectionType connectionType2;
            String str39;
            Integer num10;
            Integer num11;
            Integer num12;
            Integer num13;
            List list2;
            String str40;
            String str41;
            String str42;
            String str43;
            String str44;
            Long l26;
            String str45;
            String str46;
            BigDecimal bigDecimal6;
            BigDecimal bigDecimal7;
            String str47;
            String str48;
            Integer num14;
            Boolean bool6;
            String str49;
            String str50;
            Boolean bool7;
            String str51;
            Double d14;
            String str52;
            Long l27;
            String str53;
            String str54;
            String str55;
            String str56;
            String str57;
            String str58;
            Boolean bool8;
            String str59;
            Long l28;
            String str60;
            BigDecimal bigDecimal8;
            String str61;
            String str62;
            String str63;
            Integer num15;
            String str64;
            Integer num16;
            Long l29;
            Long l31;
            String str65;
            String str66;
            Long l32;
            Long l33;
            Long l34;
            Long l35;
            String str67;
            String str68;
            String str69;
            Long l36;
            String str70;
            BigDecimal bigDecimal9;
            BigDecimal bigDecimal10;
            Long l37;
            Integer num17;
            Integer num18;
            Long l38;
            Long l39;
            Long l41 = (i11 & 1) != 0 ? properties.regionId : l11;
            String str71 = (i11 & 2) != 0 ? properties.promocode : str;
            String str72 = (i11 & 4) != 0 ? properties.availability : str2;
            Long l42 = (i11 & 8) != 0 ? properties.paymentType : l12;
            String str73 = (i11 & 16) != 0 ? properties.orderId : str3;
            BigDecimal bigDecimal11 = (i11 & 32) != 0 ? properties.finalPrice : bigDecimal;
            BigDecimal bigDecimal12 = (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2;
            Long l43 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13;
            Integer num19 = (i11 & 256) != 0 ? properties.number : num;
            Integer num20 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2;
            Long l44 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14;
            Long l45 = (i11 & 2048) != 0 ? properties.categoryId : l15;
            String str74 = (i11 & 4096) != 0 ? properties.phoneNumber : str4;
            Long l46 = l41;
            Integer num21 = (i11 & 8192) != 0 ? properties.quantity : num3;
            String str75 = (i11 & 16384) != 0 ? properties.suggestType : str5;
            String str76 = (i11 & 32768) != 0 ? properties.suggestValue : str6;
            Integer num22 = (i11 & 65536) != 0 ? properties.countItems : num4;
            Long l47 = (i11 & 131072) != 0 ? properties.sellerId : l16;
            Long l48 = (i11 & 262144) != 0 ? properties.brandId : l17;
            String str77 = (i11 & 524288) != 0 ? properties.errorCode : str7;
            String str78 = (i11 & 1048576) != 0 ? properties.brandName : str8;
            Long l49 = (i11 & 2097152) != 0 ? properties.merchantId : l18;
            Long l51 = (i11 & 4194304) != 0 ? properties.marketingActionId : l19;
            Long l52 = (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21;
            Long l53 = (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22;
            String str79 = (i11 & 33554432) != 0 ? properties.advId : str9;
            String str80 = (i11 & 67108864) != 0 ? properties.algo : str10;
            Long l54 = (i11 & 134217728) != 0 ? properties.storehouseId : l23;
            String str81 = (i11 & 268435456) != 0 ? properties.postingId : str11;
            String str82 = (i11 & 536870912) != 0 ? properties.status : str12;
            String str83 = (i11 & 1073741824) != 0 ? properties.unavailableReason : str13;
            String str84 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14;
            String str85 = (i12 & 1) != 0 ? properties.cartType : str15;
            String str86 = (i12 & 2) != 0 ? properties.cardType : str16;
            Boolean bool9 = (i12 & 4) != 0 ? properties.checked : bool;
            String str87 = (i12 & 8) != 0 ? properties.due : str17;
            Long l55 = (i12 & 16) != 0 ? properties.timeslotId : l24;
            String str88 = (i12 & 32) != 0 ? properties.deliveryService : str18;
            BigDecimal bigDecimal13 = (i12 & 64) != 0 ? properties.weight : bigDecimal3;
            String str89 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19;
            Long l56 = (i12 & 256) != 0 ? properties.shipmentId : l25;
            String str90 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20;
            String str91 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21;
            BigDecimal bigDecimal14 = (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4;
            BigDecimal bigDecimal15 = (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5;
            String str92 = (i12 & 8192) != 0 ? properties.menuId : str22;
            String str93 = (i12 & 16384) != 0 ? properties.deliveryType : str23;
            Integer num23 = (i12 & 32768) != 0 ? properties.countPostings : num5;
            Boolean bool10 = (i12 & 65536) != 0 ? properties.fromAbroad : bool2;
            String str94 = (i12 & 131072) != 0 ? properties.searchString : str24;
            String str95 = (i12 & 262144) != 0 ? properties.title : str25;
            Boolean bool11 = (i12 & 524288) != 0 ? properties.cardIsRemember : bool3;
            String str96 = (i12 & 1048576) != 0 ? properties.cardId : str26;
            Double d15 = (i12 & 2097152) != 0 ? properties.longitude : d11;
            Double d16 = (i12 & 4194304) != 0 ? properties.latitude : d12;
            String str97 = (i12 & 8388608) != 0 ? properties.virtualPostingId : str27;
            Boolean bool12 = (i12 & 16777216) != 0 ? properties.addressUid : bool4;
            ConnectionType connectionType3 = (i12 & 33554432) != 0 ? properties.connectionType : connectionType;
            String str98 = (i12 & 67108864) != 0 ? properties.contentType : str28;
            Integer num24 = (i12 & 134217728) != 0 ? properties.imageHeight : num6;
            Integer num25 = (i12 & 268435456) != 0 ? properties.imageWidth : num7;
            Integer num26 = (i12 & 536870912) != 0 ? properties.priority : num8;
            Integer num27 = (i12 & 1073741824) != 0 ? properties.statusCode : num9;
            String str99 = (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29;
            Integer num28 = num27;
            List list3 = (i13 & 1) != 0 ? properties.items : list;
            String str100 = (i13 & 2) != 0 ? properties.elementType : str30;
            String str101 = (i13 & 4) != 0 ? properties.cache : str31;
            String str102 = (i13 & 8) != 0 ? properties.stateId : str32;
            String str103 = (i13 & 16) != 0 ? properties.chatType : str33;
            String str104 = (i13 & 32) != 0 ? properties.language : str34;
            if ((i13 & 64) != 0) {
                str37 = str104;
                str36 = properties.language_discarded;
                str38 = str97;
                bool5 = bool12;
                connectionType2 = connectionType3;
                str39 = str98;
                num10 = num24;
                num11 = num25;
                num12 = num26;
                num13 = num28;
                list2 = list3;
                str40 = str100;
                str41 = str101;
                str42 = str102;
                str43 = str103;
                str44 = str99;
                str45 = str90;
                str46 = str91;
                bigDecimal6 = bigDecimal14;
                bigDecimal7 = bigDecimal15;
                str47 = str92;
                str48 = str93;
                num14 = num23;
                bool6 = bool10;
                str49 = str94;
                str50 = str95;
                bool7 = bool11;
                str51 = str96;
                d14 = d15;
                d13 = d16;
                l27 = l54;
                str53 = str81;
                str54 = str82;
                str55 = str83;
                str56 = str84;
                str57 = str85;
                str58 = str86;
                bool8 = bool9;
                str59 = str87;
                l28 = l55;
                str60 = str88;
                bigDecimal8 = bigDecimal13;
                str61 = str89;
                l26 = l56;
                str62 = str75;
                num15 = num21;
                str64 = str76;
                num16 = num22;
                l29 = l47;
                l31 = l48;
                str65 = str77;
                str66 = str78;
                l32 = l49;
                l33 = l51;
                l34 = l52;
                l35 = l53;
                str67 = str79;
                str52 = str80;
                str68 = str71;
                str69 = str72;
                l36 = l42;
                str70 = str73;
                bigDecimal9 = bigDecimal11;
                bigDecimal10 = bigDecimal12;
                l37 = l43;
                num17 = num19;
                num18 = num20;
                l38 = l44;
                l39 = l45;
                str63 = str74;
            } else {
                str36 = str35;
                str37 = str104;
                d13 = d16;
                str38 = str97;
                bool5 = bool12;
                connectionType2 = connectionType3;
                str39 = str98;
                num10 = num24;
                num11 = num25;
                num12 = num26;
                num13 = num28;
                list2 = list3;
                str40 = str100;
                str41 = str101;
                str42 = str102;
                str43 = str103;
                str44 = str99;
                l26 = l56;
                str45 = str90;
                str46 = str91;
                bigDecimal6 = bigDecimal14;
                bigDecimal7 = bigDecimal15;
                str47 = str92;
                str48 = str93;
                num14 = num23;
                bool6 = bool10;
                str49 = str94;
                str50 = str95;
                bool7 = bool11;
                str51 = str96;
                d14 = d15;
                str52 = str80;
                l27 = l54;
                str53 = str81;
                str54 = str82;
                str55 = str83;
                str56 = str84;
                str57 = str85;
                str58 = str86;
                bool8 = bool9;
                str59 = str87;
                l28 = l55;
                str60 = str88;
                bigDecimal8 = bigDecimal13;
                str61 = str89;
                str62 = str75;
                str63 = str74;
                num15 = num21;
                str64 = str76;
                num16 = num22;
                l29 = l47;
                l31 = l48;
                str65 = str77;
                str66 = str78;
                l32 = l49;
                l33 = l51;
                l34 = l52;
                l35 = l53;
                str67 = str79;
                str68 = str71;
                str69 = str72;
                l36 = l42;
                str70 = str73;
                bigDecimal9 = bigDecimal11;
                bigDecimal10 = bigDecimal12;
                l37 = l43;
                num17 = num19;
                num18 = num20;
                l38 = l44;
                l39 = l45;
            }
            return properties.copy(l46, str68, str69, l36, str70, bigDecimal9, bigDecimal10, l37, num17, num18, l38, l39, str63, num15, str62, str64, num16, l29, l31, str65, str66, l32, l33, l34, l35, str67, str52, l27, str53, str54, str55, str56, str57, str58, bool8, str59, l28, str60, bigDecimal8, str61, l26, str45, str46, bigDecimal6, bigDecimal7, str47, str48, num14, bool6, str49, str50, bool7, str51, d14, d13, str38, bool5, connectionType2, str39, num10, num11, num12, num13, str44, list2, str40, str41, str42, str43, str37, str36);
        }

        @InterfaceC3999a
        public final /* synthetic */ Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded) {
            return copy$default(this, regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, this.courierTask, null, null, null, null, null, null, 0, 0, 16128, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded, String courierTask) {
            return copy$default(this, regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, courierTask, this.turboPvzStaffId, null, null, null, null, null, 0, 0, 15872, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded, String courierTask, Integer turboPvzStaffId) {
            return copy$default(this, regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, courierTask, turboPvzStaffId, this.id, this.type, null, null, null, 0, 0, 14336, null);
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\bJ\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\nHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000b\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/tracker/model/EventEntity$Properties$Item;", "Landroid/os/Parcelable;", "sku", "", "finalPrice", "Ljava/math/BigDecimal;", "originalPrice", "quantity", "", "deliveryType", "", "isSupermarket", "", "<init>", "(JLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getSku", "()J", "getFinalPrice", "()Ljava/math/BigDecimal;", "getOriginalPrice", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeliveryType", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/tracker/model/EventEntity$Properties$Item;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new Creator();
            private final String deliveryType;
            private final BigDecimal finalPrice;
            private final Boolean isSupermarket;
            private final BigDecimal originalPrice;
            private final Integer quantity;
            private final long sku;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Creator implements Parcelable.Creator<Item> {
                @Override // android.os.Parcelable.Creator
                public final Item createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    long readLong = parcel.readLong();
                    BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                    BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                    Boolean bool = null;
                    Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Item(readLong, bigDecimal, bigDecimal2, valueOf, readString, bool);
                }

                @Override // android.os.Parcelable.Creator
                public final Item[] newArray(int i11) {
                    return new Item[i11];
                }
            }

            public Item(long j11, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, String str, Boolean bool) {
                this.sku = j11;
                this.finalPrice = bigDecimal;
                this.originalPrice = bigDecimal2;
                this.quantity = num;
                this.deliveryType = str;
                this.isSupermarket = bool;
            }

            public static /* synthetic */ Item copy$default(Item item, long j11, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, String str, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    j11 = item.sku;
                }
                long j12 = j11;
                if ((i11 & 2) != 0) {
                    bigDecimal = item.finalPrice;
                }
                BigDecimal bigDecimal3 = bigDecimal;
                if ((i11 & 4) != 0) {
                    bigDecimal2 = item.originalPrice;
                }
                BigDecimal bigDecimal4 = bigDecimal2;
                if ((i11 & 8) != 0) {
                    num = item.quantity;
                }
                Integer num2 = num;
                if ((i11 & 16) != 0) {
                    str = item.deliveryType;
                }
                String str2 = str;
                if ((i11 & 32) != 0) {
                    bool = item.isSupermarket;
                }
                return item.copy(j12, bigDecimal3, bigDecimal4, num2, str2, bool);
            }

            /* renamed from: component1, reason: from getter */
            public final long getSku() {
                return this.sku;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getFinalPrice() {
                return this.finalPrice;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getOriginalPrice() {
                return this.originalPrice;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getQuantity() {
                return this.quantity;
            }

            /* renamed from: component5, reason: from getter */
            public final String getDeliveryType() {
                return this.deliveryType;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getIsSupermarket() {
                return this.isSupermarket;
            }

            @NotNull
            public final Item copy(long sku, BigDecimal finalPrice, BigDecimal originalPrice, Integer quantity, String deliveryType, Boolean isSupermarket) {
                return new Item(sku, finalPrice, originalPrice, quantity, deliveryType, isSupermarket);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return this.sku == item.sku && Intrinsics.d(this.finalPrice, item.finalPrice) && Intrinsics.d(this.originalPrice, item.originalPrice) && Intrinsics.d(this.quantity, item.quantity) && Intrinsics.d(this.deliveryType, item.deliveryType) && Intrinsics.d(this.isSupermarket, item.isSupermarket);
            }

            public final String getDeliveryType() {
                return this.deliveryType;
            }

            public final BigDecimal getFinalPrice() {
                return this.finalPrice;
            }

            public final BigDecimal getOriginalPrice() {
                return this.originalPrice;
            }

            public final Integer getQuantity() {
                return this.quantity;
            }

            public final long getSku() {
                return this.sku;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.sku) * 31;
                BigDecimal bigDecimal = this.finalPrice;
                int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                BigDecimal bigDecimal2 = this.originalPrice;
                int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
                Integer num = this.quantity;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.deliveryType;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.isSupermarket;
                return hashCode5 + (bool != null ? bool.hashCode() : 0);
            }

            public final Boolean isSupermarket() {
                return this.isSupermarket;
            }

            @NotNull
            public String toString() {
                return "Item(sku=" + this.sku + ", finalPrice=" + this.finalPrice + ", originalPrice=" + this.originalPrice + ", quantity=" + this.quantity + ", deliveryType=" + this.deliveryType + ", isSupermarket=" + this.isSupermarket + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeLong(this.sku);
                dest.writeSerializable(this.finalPrice);
                dest.writeSerializable(this.originalPrice);
                Integer num = this.quantity;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    Nh.a.f(dest, 1, num);
                }
                dest.writeString(this.deliveryType);
                Boolean bool = this.isSupermarket;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    D40.c.c(dest, 1, bool);
                }
            }

            public /* synthetic */ Item(long j11, BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num, String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : bool);
            }
        }

        @InterfaceC3999a
        public final /* synthetic */ Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded, String courierTask, Integer turboPvzStaffId, String id2, String type) {
            return copy$default(this, regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, courierTask, turboPvzStaffId, id2, type, this.system_language, null, null, 0, 0, 12288, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ Properties copy(Long regionId, String promocode, String availability, Long paymentType, String orderId, BigDecimal finalPrice, BigDecimal originalPrice, Long discount, Integer number, Integer stock, Long sku, Long categoryId, String phoneNumber, Integer quantity, String suggestType, String suggestValue, Integer countItems, Long sellerId, Long brandId, String errorCode, String brandName, Long merchantId, Long marketingActionId, Long deliveryMarketingActionId, Long flashsaleSlotId, String advId, String algo, Long storehouseId, String postingId, String status, String unavailableReason, String filterValue, String cartType, String cardType, Boolean checked, String due, Long timeslotId, String deliveryService, BigDecimal weight, String reason, Long shipmentId, String date, String splitReason, BigDecimal finalDeliveryPrice, BigDecimal originalDeliveryPrice, String menuId, String deliveryType, Integer countPostings, Boolean fromAbroad, String searchString, String title, Boolean cardIsRemember, String cardId, Double longitude, Double latitude, String virtualPostingId, Boolean addressUid, ConnectionType connectionType, String contentType, Integer imageHeight, Integer imageWidth, Integer priority, Integer statusCode, String url, List items, String elementType, String cache, String stateId, String chatType, String language, String language_discarded, String courierTask, Integer turboPvzStaffId, String id2, String type, String system_language) {
            return copy(regionId, promocode, availability, paymentType, orderId, finalPrice, originalPrice, discount, number, stock, sku, categoryId, phoneNumber, quantity, suggestType, suggestValue, countItems, sellerId, brandId, errorCode, brandName, merchantId, marketingActionId, deliveryMarketingActionId, flashsaleSlotId, advId, algo, storehouseId, postingId, status, unavailableReason, filterValue, cartType, cardType, checked, due, timeslotId, deliveryService, weight, reason, shipmentId, date, splitReason, finalDeliveryPrice, originalDeliveryPrice, menuId, deliveryType, countPostings, fromAbroad, searchString, title, cardIsRemember, cardId, longitude, latitude, virtualPostingId, addressUid, connectionType, contentType, imageHeight, imageWidth, priority, statusCode, url, items, elementType, cache, stateId, chatType, language, language_discarded, courierTask, turboPvzStaffId, id2, type, system_language, this.context, this.deliveryPointId);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, int i11, int i12, int i13, Object obj) {
            Long l26 = (i11 & 1) != 0 ? properties.regionId : l11;
            return properties.copy(l26, (i11 & 2) != 0 ? properties.promocode : str, (i11 & 4) != 0 ? properties.availability : str2, (i11 & 8) != 0 ? properties.paymentType : l12, (i11 & 16) != 0 ? properties.orderId : str3, (i11 & 32) != 0 ? properties.finalPrice : bigDecimal, (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13, (i11 & 256) != 0 ? properties.number : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14, (i11 & 2048) != 0 ? properties.categoryId : l15, (i11 & 4096) != 0 ? properties.phoneNumber : str4, (i11 & 8192) != 0 ? properties.quantity : num3, (i11 & 16384) != 0 ? properties.suggestType : str5, (i11 & 32768) != 0 ? properties.suggestValue : str6, (i11 & 65536) != 0 ? properties.countItems : num4, (i11 & 131072) != 0 ? properties.sellerId : l16, (i11 & 262144) != 0 ? properties.brandId : l17, (i11 & 524288) != 0 ? properties.errorCode : str7, (i11 & 1048576) != 0 ? properties.brandName : str8, (i11 & 2097152) != 0 ? properties.merchantId : l18, (i11 & 4194304) != 0 ? properties.marketingActionId : l19, (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21, (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22, (i11 & 33554432) != 0 ? properties.advId : str9, (i11 & 67108864) != 0 ? properties.algo : str10, (i11 & 134217728) != 0 ? properties.storehouseId : l23, (i11 & 268435456) != 0 ? properties.postingId : str11, (i11 & 536870912) != 0 ? properties.status : str12, (i11 & 1073741824) != 0 ? properties.unavailableReason : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14, (i12 & 1) != 0 ? properties.cartType : str15, (i12 & 2) != 0 ? properties.cardType : str16, (i12 & 4) != 0 ? properties.checked : bool, (i12 & 8) != 0 ? properties.due : str17, (i12 & 16) != 0 ? properties.timeslotId : l24, (i12 & 32) != 0 ? properties.deliveryService : str18, (i12 & 64) != 0 ? properties.weight : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19, (i12 & 256) != 0 ? properties.shipmentId : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21, (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4, (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5, (i12 & 8192) != 0 ? properties.menuId : str22, (i12 & 16384) != 0 ? properties.deliveryType : str23, (i12 & 32768) != 0 ? properties.countPostings : num5, (i12 & 65536) != 0 ? properties.fromAbroad : bool2, (i12 & 131072) != 0 ? properties.searchString : str24, (i12 & 262144) != 0 ? properties.title : str25, (i12 & 524288) != 0 ? properties.cardIsRemember : bool3, (i12 & 1048576) != 0 ? properties.cardId : str26, (i12 & 2097152) != 0 ? properties.longitude : d11, (i12 & 4194304) != 0 ? properties.latitude : d12, (i12 & 8388608) != 0 ? properties.virtualPostingId : str27, (i12 & 16777216) != 0 ? properties.addressUid : bool4, (i12 & 33554432) != 0 ? properties.connectionType : connectionType, (i12 & 67108864) != 0 ? properties.contentType : str28, (i12 & 134217728) != 0 ? properties.imageHeight : num6, (i12 & 268435456) != 0 ? properties.imageWidth : num7, (i12 & 536870912) != 0 ? properties.priority : num8, (i12 & 1073741824) != 0 ? properties.statusCode : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29, (i13 & 1) != 0 ? properties.items : list, (i13 & 2) != 0 ? properties.elementType : str30, (i13 & 4) != 0 ? properties.cache : str31, (i13 & 8) != 0 ? properties.stateId : str32, (i13 & 16) != 0 ? properties.chatType : str33, (i13 & 32) != 0 ? properties.language : str34, (i13 & 64) != 0 ? properties.language_discarded : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.courierTask : str36);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39, String str40, Long l26, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r63, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r64, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str36, (i13 & 256) != 0 ? null : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str38, (i13 & 2048) != 0 ? null : str39, (i13 & 4096) != 0 ? null : str40, (i13 & 8192) != 0 ? null : l26);
            Long l27 = (i11 & 1) != 0 ? null : l11;
            String str41 = (i11 & 2) != 0 ? null : str;
            String str42 = (i11 & 4) != 0 ? null : str2;
            Long l28 = (i11 & 8) != 0 ? null : l12;
            String str43 = (i11 & 16) != 0 ? null : str3;
            BigDecimal bigDecimal6 = (i11 & 32) != 0 ? null : bigDecimal;
            BigDecimal bigDecimal7 = (i11 & 64) != 0 ? null : bigDecimal2;
            Long l29 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13;
            Integer num11 = (i11 & 256) != 0 ? null : num;
            Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2;
            Long l31 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14;
            Long l32 = (i11 & 2048) != 0 ? null : l15;
            String str44 = (i11 & 4096) != 0 ? null : str4;
            Long l33 = l27;
            Integer num13 = (i11 & 8192) != 0 ? null : num3;
            String str45 = (i11 & 16384) != 0 ? null : str5;
            String str46 = (i11 & 32768) != 0 ? null : str6;
            Integer num14 = (i11 & 65536) != 0 ? null : num4;
            Long l34 = (i11 & 131072) != 0 ? null : l16;
            Long l35 = (i11 & 262144) != 0 ? null : l17;
            String str47 = (i11 & 524288) != 0 ? null : str7;
            String str48 = (i11 & 1048576) != 0 ? null : str8;
            Long l36 = (i11 & 2097152) != 0 ? null : l18;
            Long l37 = (i11 & 4194304) != 0 ? null : l19;
            Long l38 = (i11 & 8388608) != 0 ? null : l21;
            Long l39 = (i11 & 16777216) != 0 ? null : l22;
            String str49 = (i11 & 33554432) != 0 ? null : str9;
            String str50 = (i11 & 67108864) != 0 ? null : str10;
            Long l41 = (i11 & 134217728) != 0 ? null : l23;
            String str51 = (i11 & 268435456) != 0 ? null : str11;
            String str52 = (i11 & 536870912) != 0 ? null : str12;
            String str53 = (i11 & 1073741824) != 0 ? null : str13;
            String str54 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r2, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14, (i11 & 2048) != 0 ? null : l15, (i11 & 4096) != 0 ? null : str4, (i11 & 8192) != 0 ? null : num3, (i11 & 16384) != 0 ? null : str5, (i11 & 32768) != 0 ? null : str6, (i11 & 65536) != 0 ? null : num4, (i11 & 131072) != 0 ? null : l16, (i11 & 262144) != 0 ? null : l17, (i11 & 524288) != 0 ? null : str7, (i11 & 1048576) != 0 ? null : str8, (i11 & 2097152) != 0 ? null : l18, (i11 & 4194304) != 0 ? null : l19, (i11 & 8388608) != 0 ? null : l21, (i11 & 16777216) != 0 ? null : l22, (i11 & 33554432) != 0 ? null : str9, (i11 & 67108864) != 0 ? null : str10, (i11 & 134217728) != 0 ? null : l23, (i11 & 268435456) != 0 ? null : str11, (i11 & 536870912) != 0 ? null : str12, (i11 & 1073741824) != 0 ? null : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35);
            Long l26 = (i11 & 1) != 0 ? null : l11;
        }

        @InterfaceC3999a
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35) {
            this(l11, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, null, null, null, null, null, null, null, 0, 0, 16128, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r3, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13, (i11 & 256) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14, (i11 & 2048) != 0 ? null : l15, (i11 & 4096) != 0 ? null : str4, (i11 & 8192) != 0 ? null : num3, (i11 & 16384) != 0 ? null : str5, (i11 & 32768) != 0 ? null : str6, (i11 & 65536) != 0 ? null : num4, (i11 & 131072) != 0 ? null : l16, (i11 & 262144) != 0 ? null : l17, (i11 & 524288) != 0 ? null : str7, (i11 & 1048576) != 0 ? null : str8, (i11 & 2097152) != 0 ? null : l18, (i11 & 4194304) != 0 ? null : l19, (i11 & 8388608) != 0 ? null : l21, (i11 & 16777216) != 0 ? null : l22, (i11 & 33554432) != 0 ? null : str9, (i11 & 67108864) != 0 ? null : str10, (i11 & 134217728) != 0 ? null : l23, (i11 & 268435456) != 0 ? null : str11, (i11 & 536870912) != 0 ? null : str12, (i11 & 1073741824) != 0 ? null : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str36);
            Long l26 = (i11 & 1) != 0 ? null : l11;
        }

        @InterfaceC3999a
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36) {
            this(l11, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, null, null, null, null, null, null, 0, 0, 15872, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r63, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r64, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str36, (i13 & 256) != 0 ? null : num10);
            Long l26 = (i11 & 1) != 0 ? null : l11;
            String str37 = (i11 & 2) != 0 ? null : str;
            String str38 = (i11 & 4) != 0 ? null : str2;
            Long l27 = (i11 & 8) != 0 ? null : l12;
            String str39 = (i11 & 16) != 0 ? null : str3;
            BigDecimal bigDecimal6 = (i11 & 32) != 0 ? null : bigDecimal;
            BigDecimal bigDecimal7 = (i11 & 64) != 0 ? null : bigDecimal2;
            Long l28 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13;
            Integer num11 = (i11 & 256) != 0 ? null : num;
            Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2;
            Long l29 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14;
            Long l31 = (i11 & 2048) != 0 ? null : l15;
            String str40 = (i11 & 4096) != 0 ? null : str4;
            Long l32 = l26;
            Integer num13 = (i11 & 8192) != 0 ? null : num3;
            String str41 = (i11 & 16384) != 0 ? null : str5;
            String str42 = (i11 & 32768) != 0 ? null : str6;
            Integer num14 = (i11 & 65536) != 0 ? null : num4;
            Long l33 = (i11 & 131072) != 0 ? null : l16;
            Long l34 = (i11 & 262144) != 0 ? null : l17;
            String str43 = (i11 & 524288) != 0 ? null : str7;
            String str44 = (i11 & 1048576) != 0 ? null : str8;
            Long l35 = (i11 & 2097152) != 0 ? null : l18;
            Long l36 = (i11 & 4194304) != 0 ? null : l19;
            Long l37 = (i11 & 8388608) != 0 ? null : l21;
            Long l38 = (i11 & 16777216) != 0 ? null : l22;
            String str45 = (i11 & 33554432) != 0 ? null : str9;
            String str46 = (i11 & 67108864) != 0 ? null : str10;
            Long l39 = (i11 & 134217728) != 0 ? null : l23;
            String str47 = (i11 & 268435456) != 0 ? null : str11;
            String str48 = (i11 & 536870912) != 0 ? null : str12;
            String str49 = (i11 & 1073741824) != 0 ? null : str13;
            String str50 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14;
        }

        @InterfaceC3999a
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10) {
            this(l11, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, num10, null, null, null, null, null, 0, 0, 14336, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r63, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r64, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str36, (i13 & 256) != 0 ? null : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str38);
            Long l26 = (i11 & 1) != 0 ? null : l11;
            String str39 = (i11 & 2) != 0 ? null : str;
            String str40 = (i11 & 4) != 0 ? null : str2;
            Long l27 = (i11 & 8) != 0 ? null : l12;
            String str41 = (i11 & 16) != 0 ? null : str3;
            BigDecimal bigDecimal6 = (i11 & 32) != 0 ? null : bigDecimal;
            BigDecimal bigDecimal7 = (i11 & 64) != 0 ? null : bigDecimal2;
            Long l28 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13;
            Integer num11 = (i11 & 256) != 0 ? null : num;
            Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2;
            Long l29 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14;
            Long l31 = (i11 & 2048) != 0 ? null : l15;
            String str42 = (i11 & 4096) != 0 ? null : str4;
            Long l32 = l26;
            Integer num13 = (i11 & 8192) != 0 ? null : num3;
            String str43 = (i11 & 16384) != 0 ? null : str5;
            String str44 = (i11 & 32768) != 0 ? null : str6;
            Integer num14 = (i11 & 65536) != 0 ? null : num4;
            Long l33 = (i11 & 131072) != 0 ? null : l16;
            Long l34 = (i11 & 262144) != 0 ? null : l17;
            String str45 = (i11 & 524288) != 0 ? null : str7;
            String str46 = (i11 & 1048576) != 0 ? null : str8;
            Long l35 = (i11 & 2097152) != 0 ? null : l18;
            Long l36 = (i11 & 4194304) != 0 ? null : l19;
            Long l37 = (i11 & 8388608) != 0 ? null : l21;
            Long l38 = (i11 & 16777216) != 0 ? null : l22;
            String str47 = (i11 & 33554432) != 0 ? null : str9;
            String str48 = (i11 & 67108864) != 0 ? null : str10;
            Long l39 = (i11 & 134217728) != 0 ? null : l23;
            String str49 = (i11 & 268435456) != 0 ? null : str11;
            String str50 = (i11 & 536870912) != 0 ? null : str12;
            String str51 = (i11 & 1073741824) != 0 ? null : str13;
            String str52 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14;
        }

        @InterfaceC3999a
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38) {
            this(l11, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, num10, str37, str38, null, null, null, 0, 0, 12288, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(r63, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r64, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i12 & 1) != 0 ? null : str15, (i12 & 2) != 0 ? null : str16, (i12 & 4) != 0 ? null : bool, (i12 & 8) != 0 ? null : str17, (i12 & 16) != 0 ? null : l24, (i12 & 32) != 0 ? null : str18, (i12 & 64) != 0 ? null : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str19, (i12 & 256) != 0 ? null : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str21, (i12 & 2048) != 0 ? null : bigDecimal4, (i12 & 4096) != 0 ? null : bigDecimal5, (i12 & 8192) != 0 ? null : str22, (i12 & 16384) != 0 ? null : str23, (i12 & 32768) != 0 ? null : num5, (i12 & 65536) != 0 ? null : bool2, (i12 & 131072) != 0 ? null : str24, (i12 & 262144) != 0 ? null : str25, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : str26, (i12 & 2097152) != 0 ? null : d11, (i12 & 4194304) != 0 ? null : d12, (i12 & 8388608) != 0 ? null : str27, (i12 & 16777216) != 0 ? null : bool4, (i12 & 33554432) != 0 ? null : connectionType, (i12 & 67108864) != 0 ? null : str28, (i12 & 134217728) != 0 ? null : num6, (i12 & 268435456) != 0 ? null : num7, (i12 & 536870912) != 0 ? null : num8, (i12 & 1073741824) != 0 ? null : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str29, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : str30, (i13 & 4) != 0 ? null : str31, (i13 & 8) != 0 ? null : str32, (i13 & 16) != 0 ? null : str33, (i13 & 32) != 0 ? null : str34, (i13 & 64) != 0 ? null : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str36, (i13 & 256) != 0 ? null : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str38, (i13 & 2048) != 0 ? null : str39);
            Long l26 = (i11 & 1) != 0 ? null : l11;
            String str40 = (i11 & 2) != 0 ? null : str;
            String str41 = (i11 & 4) != 0 ? null : str2;
            Long l27 = (i11 & 8) != 0 ? null : l12;
            String str42 = (i11 & 16) != 0 ? null : str3;
            BigDecimal bigDecimal6 = (i11 & 32) != 0 ? null : bigDecimal;
            BigDecimal bigDecimal7 = (i11 & 64) != 0 ? null : bigDecimal2;
            Long l28 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l13;
            Integer num11 = (i11 & 256) != 0 ? null : num;
            Integer num12 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2;
            Long l29 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : l14;
            Long l31 = (i11 & 2048) != 0 ? null : l15;
            String str43 = (i11 & 4096) != 0 ? null : str4;
            Long l32 = l26;
            Integer num13 = (i11 & 8192) != 0 ? null : num3;
            String str44 = (i11 & 16384) != 0 ? null : str5;
            String str45 = (i11 & 32768) != 0 ? null : str6;
            Integer num14 = (i11 & 65536) != 0 ? null : num4;
            Long l33 = (i11 & 131072) != 0 ? null : l16;
            Long l34 = (i11 & 262144) != 0 ? null : l17;
            String str46 = (i11 & 524288) != 0 ? null : str7;
            String str47 = (i11 & 1048576) != 0 ? null : str8;
            Long l35 = (i11 & 2097152) != 0 ? null : l18;
            Long l36 = (i11 & 4194304) != 0 ? null : l19;
            Long l37 = (i11 & 8388608) != 0 ? null : l21;
            Long l38 = (i11 & 16777216) != 0 ? null : l22;
            String str48 = (i11 & 33554432) != 0 ? null : str9;
            String str49 = (i11 & 67108864) != 0 ? null : str10;
            Long l39 = (i11 & 134217728) != 0 ? null : l23;
            String str50 = (i11 & 268435456) != 0 ? null : str11;
            String str51 = (i11 & 536870912) != 0 ? null : str12;
            String str52 = (i11 & 1073741824) != 0 ? null : str13;
            String str53 = (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str14;
        }

        @InterfaceC3999a
        public /* synthetic */ Properties(Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39) {
            this(l11, str, str2, l12, str3, bigDecimal, bigDecimal2, l13, num, num2, l14, l15, str4, num3, str5, str6, num4, l16, l17, str7, str8, l18, l19, l21, l22, str9, str10, l23, str11, str12, str13, str14, str15, str16, bool, str17, l24, str18, bigDecimal3, str19, l25, str20, str21, bigDecimal4, bigDecimal5, str22, str23, num5, bool2, str24, str25, bool3, str26, d11, d12, str27, bool4, connectionType, str28, num6, num7, num8, num9, str29, list, str30, str31, str32, str33, str34, str35, str36, num10, str37, str38, str39, null, null);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, int i11, int i12, int i13, Object obj) {
            Long l26 = (i11 & 1) != 0 ? properties.regionId : l11;
            return properties.copy(l26, (i11 & 2) != 0 ? properties.promocode : str, (i11 & 4) != 0 ? properties.availability : str2, (i11 & 8) != 0 ? properties.paymentType : l12, (i11 & 16) != 0 ? properties.orderId : str3, (i11 & 32) != 0 ? properties.finalPrice : bigDecimal, (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13, (i11 & 256) != 0 ? properties.number : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14, (i11 & 2048) != 0 ? properties.categoryId : l15, (i11 & 4096) != 0 ? properties.phoneNumber : str4, (i11 & 8192) != 0 ? properties.quantity : num3, (i11 & 16384) != 0 ? properties.suggestType : str5, (i11 & 32768) != 0 ? properties.suggestValue : str6, (i11 & 65536) != 0 ? properties.countItems : num4, (i11 & 131072) != 0 ? properties.sellerId : l16, (i11 & 262144) != 0 ? properties.brandId : l17, (i11 & 524288) != 0 ? properties.errorCode : str7, (i11 & 1048576) != 0 ? properties.brandName : str8, (i11 & 2097152) != 0 ? properties.merchantId : l18, (i11 & 4194304) != 0 ? properties.marketingActionId : l19, (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21, (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22, (i11 & 33554432) != 0 ? properties.advId : str9, (i11 & 67108864) != 0 ? properties.algo : str10, (i11 & 134217728) != 0 ? properties.storehouseId : l23, (i11 & 268435456) != 0 ? properties.postingId : str11, (i11 & 536870912) != 0 ? properties.status : str12, (i11 & 1073741824) != 0 ? properties.unavailableReason : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14, (i12 & 1) != 0 ? properties.cartType : str15, (i12 & 2) != 0 ? properties.cardType : str16, (i12 & 4) != 0 ? properties.checked : bool, (i12 & 8) != 0 ? properties.due : str17, (i12 & 16) != 0 ? properties.timeslotId : l24, (i12 & 32) != 0 ? properties.deliveryService : str18, (i12 & 64) != 0 ? properties.weight : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19, (i12 & 256) != 0 ? properties.shipmentId : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21, (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4, (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5, (i12 & 8192) != 0 ? properties.menuId : str22, (i12 & 16384) != 0 ? properties.deliveryType : str23, (i12 & 32768) != 0 ? properties.countPostings : num5, (i12 & 65536) != 0 ? properties.fromAbroad : bool2, (i12 & 131072) != 0 ? properties.searchString : str24, (i12 & 262144) != 0 ? properties.title : str25, (i12 & 524288) != 0 ? properties.cardIsRemember : bool3, (i12 & 1048576) != 0 ? properties.cardId : str26, (i12 & 2097152) != 0 ? properties.longitude : d11, (i12 & 4194304) != 0 ? properties.latitude : d12, (i12 & 8388608) != 0 ? properties.virtualPostingId : str27, (i12 & 16777216) != 0 ? properties.addressUid : bool4, (i12 & 33554432) != 0 ? properties.connectionType : connectionType, (i12 & 67108864) != 0 ? properties.contentType : str28, (i12 & 134217728) != 0 ? properties.imageHeight : num6, (i12 & 268435456) != 0 ? properties.imageWidth : num7, (i12 & 536870912) != 0 ? properties.priority : num8, (i12 & 1073741824) != 0 ? properties.statusCode : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29, (i13 & 1) != 0 ? properties.items : list, (i13 & 2) != 0 ? properties.elementType : str30, (i13 & 4) != 0 ? properties.cache : str31, (i13 & 8) != 0 ? properties.stateId : str32, (i13 & 16) != 0 ? properties.chatType : str33, (i13 & 32) != 0 ? properties.language : str34, (i13 & 64) != 0 ? properties.language_discarded : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.courierTask : str36, (i13 & 256) != 0 ? properties.turboPvzStaffId : num10);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, int i11, int i12, int i13, Object obj) {
            Long l26 = (i11 & 1) != 0 ? properties.regionId : l11;
            return properties.copy(l26, (i11 & 2) != 0 ? properties.promocode : str, (i11 & 4) != 0 ? properties.availability : str2, (i11 & 8) != 0 ? properties.paymentType : l12, (i11 & 16) != 0 ? properties.orderId : str3, (i11 & 32) != 0 ? properties.finalPrice : bigDecimal, (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13, (i11 & 256) != 0 ? properties.number : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14, (i11 & 2048) != 0 ? properties.categoryId : l15, (i11 & 4096) != 0 ? properties.phoneNumber : str4, (i11 & 8192) != 0 ? properties.quantity : num3, (i11 & 16384) != 0 ? properties.suggestType : str5, (i11 & 32768) != 0 ? properties.suggestValue : str6, (i11 & 65536) != 0 ? properties.countItems : num4, (i11 & 131072) != 0 ? properties.sellerId : l16, (i11 & 262144) != 0 ? properties.brandId : l17, (i11 & 524288) != 0 ? properties.errorCode : str7, (i11 & 1048576) != 0 ? properties.brandName : str8, (i11 & 2097152) != 0 ? properties.merchantId : l18, (i11 & 4194304) != 0 ? properties.marketingActionId : l19, (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21, (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22, (i11 & 33554432) != 0 ? properties.advId : str9, (i11 & 67108864) != 0 ? properties.algo : str10, (i11 & 134217728) != 0 ? properties.storehouseId : l23, (i11 & 268435456) != 0 ? properties.postingId : str11, (i11 & 536870912) != 0 ? properties.status : str12, (i11 & 1073741824) != 0 ? properties.unavailableReason : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14, (i12 & 1) != 0 ? properties.cartType : str15, (i12 & 2) != 0 ? properties.cardType : str16, (i12 & 4) != 0 ? properties.checked : bool, (i12 & 8) != 0 ? properties.due : str17, (i12 & 16) != 0 ? properties.timeslotId : l24, (i12 & 32) != 0 ? properties.deliveryService : str18, (i12 & 64) != 0 ? properties.weight : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19, (i12 & 256) != 0 ? properties.shipmentId : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21, (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4, (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5, (i12 & 8192) != 0 ? properties.menuId : str22, (i12 & 16384) != 0 ? properties.deliveryType : str23, (i12 & 32768) != 0 ? properties.countPostings : num5, (i12 & 65536) != 0 ? properties.fromAbroad : bool2, (i12 & 131072) != 0 ? properties.searchString : str24, (i12 & 262144) != 0 ? properties.title : str25, (i12 & 524288) != 0 ? properties.cardIsRemember : bool3, (i12 & 1048576) != 0 ? properties.cardId : str26, (i12 & 2097152) != 0 ? properties.longitude : d11, (i12 & 4194304) != 0 ? properties.latitude : d12, (i12 & 8388608) != 0 ? properties.virtualPostingId : str27, (i12 & 16777216) != 0 ? properties.addressUid : bool4, (i12 & 33554432) != 0 ? properties.connectionType : connectionType, (i12 & 67108864) != 0 ? properties.contentType : str28, (i12 & 134217728) != 0 ? properties.imageHeight : num6, (i12 & 268435456) != 0 ? properties.imageWidth : num7, (i12 & 536870912) != 0 ? properties.priority : num8, (i12 & 1073741824) != 0 ? properties.statusCode : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29, (i13 & 1) != 0 ? properties.items : list, (i13 & 2) != 0 ? properties.elementType : str30, (i13 & 4) != 0 ? properties.cache : str31, (i13 & 8) != 0 ? properties.stateId : str32, (i13 & 16) != 0 ? properties.chatType : str33, (i13 & 32) != 0 ? properties.language : str34, (i13 & 64) != 0 ? properties.language_discarded : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.courierTask : str36, (i13 & 256) != 0 ? properties.turboPvzStaffId : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.id : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.type : str38);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Long l11, String str, String str2, Long l12, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, Long l13, Integer num, Integer num2, Long l14, Long l15, String str4, Integer num3, String str5, String str6, Integer num4, Long l16, Long l17, String str7, String str8, Long l18, Long l19, Long l21, Long l22, String str9, String str10, Long l23, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, Long l24, String str18, BigDecimal bigDecimal3, String str19, Long l25, String str20, String str21, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str22, String str23, Integer num5, Boolean bool2, String str24, String str25, Boolean bool3, String str26, Double d11, Double d12, String str27, Boolean bool4, ConnectionType connectionType, String str28, Integer num6, Integer num7, Integer num8, Integer num9, String str29, List list, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Integer num10, String str37, String str38, String str39, int i11, int i12, int i13, Object obj) {
            Long l26 = (i11 & 1) != 0 ? properties.regionId : l11;
            return properties.copy(l26, (i11 & 2) != 0 ? properties.promocode : str, (i11 & 4) != 0 ? properties.availability : str2, (i11 & 8) != 0 ? properties.paymentType : l12, (i11 & 16) != 0 ? properties.orderId : str3, (i11 & 32) != 0 ? properties.finalPrice : bigDecimal, (i11 & 64) != 0 ? properties.originalPrice : bigDecimal2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.discount : l13, (i11 & 256) != 0 ? properties.number : num, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.stock : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.sku : l14, (i11 & 2048) != 0 ? properties.categoryId : l15, (i11 & 4096) != 0 ? properties.phoneNumber : str4, (i11 & 8192) != 0 ? properties.quantity : num3, (i11 & 16384) != 0 ? properties.suggestType : str5, (i11 & 32768) != 0 ? properties.suggestValue : str6, (i11 & 65536) != 0 ? properties.countItems : num4, (i11 & 131072) != 0 ? properties.sellerId : l16, (i11 & 262144) != 0 ? properties.brandId : l17, (i11 & 524288) != 0 ? properties.errorCode : str7, (i11 & 1048576) != 0 ? properties.brandName : str8, (i11 & 2097152) != 0 ? properties.merchantId : l18, (i11 & 4194304) != 0 ? properties.marketingActionId : l19, (i11 & 8388608) != 0 ? properties.deliveryMarketingActionId : l21, (i11 & 16777216) != 0 ? properties.flashsaleSlotId : l22, (i11 & 33554432) != 0 ? properties.advId : str9, (i11 & 67108864) != 0 ? properties.algo : str10, (i11 & 134217728) != 0 ? properties.storehouseId : l23, (i11 & 268435456) != 0 ? properties.postingId : str11, (i11 & 536870912) != 0 ? properties.status : str12, (i11 & 1073741824) != 0 ? properties.unavailableReason : str13, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.filterValue : str14, (i12 & 1) != 0 ? properties.cartType : str15, (i12 & 2) != 0 ? properties.cardType : str16, (i12 & 4) != 0 ? properties.checked : bool, (i12 & 8) != 0 ? properties.due : str17, (i12 & 16) != 0 ? properties.timeslotId : l24, (i12 & 32) != 0 ? properties.deliveryService : str18, (i12 & 64) != 0 ? properties.weight : bigDecimal3, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.reason : str19, (i12 & 256) != 0 ? properties.shipmentId : l25, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.date : str20, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.splitReason : str21, (i12 & 2048) != 0 ? properties.finalDeliveryPrice : bigDecimal4, (i12 & 4096) != 0 ? properties.originalDeliveryPrice : bigDecimal5, (i12 & 8192) != 0 ? properties.menuId : str22, (i12 & 16384) != 0 ? properties.deliveryType : str23, (i12 & 32768) != 0 ? properties.countPostings : num5, (i12 & 65536) != 0 ? properties.fromAbroad : bool2, (i12 & 131072) != 0 ? properties.searchString : str24, (i12 & 262144) != 0 ? properties.title : str25, (i12 & 524288) != 0 ? properties.cardIsRemember : bool3, (i12 & 1048576) != 0 ? properties.cardId : str26, (i12 & 2097152) != 0 ? properties.longitude : d11, (i12 & 4194304) != 0 ? properties.latitude : d12, (i12 & 8388608) != 0 ? properties.virtualPostingId : str27, (i12 & 16777216) != 0 ? properties.addressUid : bool4, (i12 & 33554432) != 0 ? properties.connectionType : connectionType, (i12 & 67108864) != 0 ? properties.contentType : str28, (i12 & 134217728) != 0 ? properties.imageHeight : num6, (i12 & 268435456) != 0 ? properties.imageWidth : num7, (i12 & 536870912) != 0 ? properties.priority : num8, (i12 & 1073741824) != 0 ? properties.statusCode : num9, (i12 & LinearLayoutManager.INVALID_OFFSET) != 0 ? properties.url : str29, (i13 & 1) != 0 ? properties.items : list, (i13 & 2) != 0 ? properties.elementType : str30, (i13 & 4) != 0 ? properties.cache : str31, (i13 & 8) != 0 ? properties.stateId : str32, (i13 & 16) != 0 ? properties.chatType : str33, (i13 & 32) != 0 ? properties.language : str34, (i13 & 64) != 0 ? properties.language_discarded : str35, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? properties.courierTask : str36, (i13 & 256) != 0 ? properties.turboPvzStaffId : num10, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? properties.id : str37, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? properties.type : str38, (i13 & 2048) != 0 ? properties.system_language : str39);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Review;", "Landroid/os/Parcelable;", "id", "", "uuid", "", "answerId", "questionId", "questionAnswerId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUuid", "()Ljava/lang/String;", "getAnswerId", "getQuestionId", "getQuestionAnswerId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/tracker/model/EventEntity$Review;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Review implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new Creator();
        private final Integer answerId;
        private final Integer id;
        private final Integer questionAnswerId;
        private final Integer questionId;
        private final String uuid;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Review> {
            @Override // android.os.Parcelable.Creator
            public final Review createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Review[] newArray(int i11) {
                return new Review[i11];
            }
        }

        public Review() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Review copy$default(Review review, Integer num, String str, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = review.id;
            }
            if ((i11 & 2) != 0) {
                str = review.uuid;
            }
            if ((i11 & 4) != 0) {
                num2 = review.answerId;
            }
            if ((i11 & 8) != 0) {
                num3 = review.questionId;
            }
            if ((i11 & 16) != 0) {
                num4 = review.questionAnswerId;
            }
            Integer num5 = num4;
            Integer num6 = num2;
            return review.copy(num, str, num6, num3, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getAnswerId() {
            return this.answerId;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getQuestionId() {
            return this.questionId;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getQuestionAnswerId() {
            return this.questionAnswerId;
        }

        @NotNull
        public final Review copy(Integer id2, String uuid, Integer answerId, Integer questionId, Integer questionAnswerId) {
            return new Review(id2, uuid, answerId, questionId, questionAnswerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Review)) {
                return false;
            }
            Review review = (Review) other;
            return Intrinsics.d(this.id, review.id) && Intrinsics.d(this.uuid, review.uuid) && Intrinsics.d(this.answerId, review.answerId) && Intrinsics.d(this.questionId, review.questionId) && Intrinsics.d(this.questionAnswerId, review.questionAnswerId);
        }

        public final Integer getAnswerId() {
            return this.answerId;
        }

        public final Integer getId() {
            return this.id;
        }

        public final Integer getQuestionAnswerId() {
            return this.questionAnswerId;
        }

        public final Integer getQuestionId() {
            return this.questionId;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            Integer num = this.id;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.uuid;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.answerId;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.questionId;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.questionAnswerId;
            return hashCode4 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.id;
            String str = this.uuid;
            Integer num2 = this.answerId;
            Integer num3 = this.questionId;
            Integer num4 = this.questionAnswerId;
            StringBuilder sb2 = new StringBuilder("Review(id=");
            sb2.append(num);
            sb2.append(", uuid=");
            sb2.append(str);
            sb2.append(", answerId=");
            Ef0.c.e(sb2, num2, ", questionId=", num3, ", questionAnswerId=");
            return Ep.a.c(sb2, num4, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.id;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeString(this.uuid);
            Integer num2 = this.answerId;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Integer num3 = this.questionId;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Integer num4 = this.questionAnswerId;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
        }

        public Review(Integer num, String str, Integer num2, Integer num3, Integer num4) {
            this.id = num;
            this.uuid = str;
            this.answerId = num2;
            this.questionId = num3;
            this.questionAnswerId = num4;
        }

        public /* synthetic */ Review(Integer num, String str, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3, (i11 & 16) != 0 ? null : num4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006$"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Sale;", "Landroid/os/Parcelable;", "id", "", "productsIds", "", "productNumber", "productChosenNumber", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductsIds", "()Ljava/util/List;", "getProductNumber", "getProductChosenNumber", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/tracker/model/EventEntity$Sale;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Sale implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Sale> CREATOR = new Creator();
        private final Integer id;
        private final Integer productChosenNumber;
        private final Integer productNumber;
        private final List<Integer> productsIds;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Sale> {
            @Override // android.os.Parcelable.Creator
            public final Sale createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Sh.a.a(parcel, arrayList, i11, 1);
                    }
                }
                return new Sale(valueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Sale[] newArray(int i11) {
                return new Sale[i11];
            }
        }

        public Sale() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sale copy$default(Sale sale, Integer num, List list, Integer num2, Integer num3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = sale.id;
            }
            if ((i11 & 2) != 0) {
                list = sale.productsIds;
            }
            if ((i11 & 4) != 0) {
                num2 = sale.productNumber;
            }
            if ((i11 & 8) != 0) {
                num3 = sale.productChosenNumber;
            }
            return sale.copy(num, list, num2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getId() {
            return this.id;
        }

        public final List<Integer> component2() {
            return this.productsIds;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getProductNumber() {
            return this.productNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getProductChosenNumber() {
            return this.productChosenNumber;
        }

        @NotNull
        public final Sale copy(Integer id2, List<Integer> productsIds, Integer productNumber, Integer productChosenNumber) {
            return new Sale(id2, productsIds, productNumber, productChosenNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sale)) {
                return false;
            }
            Sale sale = (Sale) other;
            return Intrinsics.d(this.id, sale.id) && Intrinsics.d(this.productsIds, sale.productsIds) && Intrinsics.d(this.productNumber, sale.productNumber) && Intrinsics.d(this.productChosenNumber, sale.productChosenNumber);
        }

        public final Integer getId() {
            return this.id;
        }

        public final Integer getProductChosenNumber() {
            return this.productChosenNumber;
        }

        public final Integer getProductNumber() {
            return this.productNumber;
        }

        public final List<Integer> getProductsIds() {
            return this.productsIds;
        }

        public int hashCode() {
            Integer num = this.id;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<Integer> list = this.productsIds;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Integer num2 = this.productNumber;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.productChosenNumber;
            return hashCode3 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.id;
            List<Integer> list = this.productsIds;
            Integer num2 = this.productNumber;
            Integer num3 = this.productChosenNumber;
            StringBuilder sb2 = new StringBuilder("Sale(id=");
            sb2.append(num);
            sb2.append(", productsIds=");
            sb2.append(list);
            sb2.append(", productNumber=");
            return Z.c(sb2, num2, ", productChosenNumber=", num3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.id;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            List<Integer> list = this.productsIds;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeInt(((Number) c11.next()).intValue());
                }
            }
            Integer num2 = this.productNumber;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Integer num3 = this.productChosenNumber;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
        }

        public Sale(Integer num, List<Integer> list, Integer num2, Integer num3) {
            this.id = num;
            this.productsIds = list;
            this.productNumber = num2;
            this.productChosenNumber = num3;
        }

        public /* synthetic */ Sale(Integer num, List list, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012B\u008d\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0013Bu\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0014B\u0081\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0015J\u0091\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010(Jy\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010)J\u0085\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u009e\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00107J\u0006\u00108\u001a\u00020\u0003J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001d¨\u0006D"}, d2 = {"Lru/ozon/tracker/model/EventEntity$User;", "Landroid/os/Parcelable;", "abGroup", "", "regionId", "", "clientId", "", "companyId", "appBuildNumber", "googleId", "appsflyerId", "firebaseInstallId", "longCookie", "role", "marketplaceId", "achievementId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbGroup", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClientId", "()Ljava/lang/String;", "getCompanyId", "getAppBuildNumber", "getGoogleId", "getAppsflyerId", "getFirebaseInstallId", "getLongCookie", "getRole", "getMarketplaceId", "getAchievementId", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$User;", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$User;", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/tracker/model/EventEntity$User;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class User implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<User> CREATOR = new Creator();
        private final Integer abGroup;
        private final String achievementId;
        private final Integer appBuildNumber;
        private final String appsflyerId;
        private final String clientId;
        private final Integer companyId;
        private final String firebaseInstallId;
        private final String googleId;
        private final String longCookie;
        private final String marketplaceId;
        private final Long regionId;
        private final String role;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<User> {
            @Override // android.os.Parcelable.Creator
            public final User createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new User(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final User[] newArray(int i11) {
                return new User[i11];
            }
        }

        public User() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        public static /* synthetic */ User copy$default(User user, Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = user.abGroup;
            }
            if ((i11 & 2) != 0) {
                l11 = user.regionId;
            }
            if ((i11 & 4) != 0) {
                str = user.clientId;
            }
            if ((i11 & 8) != 0) {
                num2 = user.companyId;
            }
            if ((i11 & 16) != 0) {
                num3 = user.appBuildNumber;
            }
            if ((i11 & 32) != 0) {
                str2 = user.googleId;
            }
            if ((i11 & 64) != 0) {
                str3 = user.appsflyerId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = user.firebaseInstallId;
            }
            if ((i11 & 256) != 0) {
                str5 = user.longCookie;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str6 = user.role;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str7 = user.marketplaceId;
            }
            if ((i11 & 2048) != 0) {
                str8 = user.achievementId;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            String str13 = str3;
            String str14 = str4;
            Integer num4 = num3;
            String str15 = str2;
            return user.copy(num, l11, str, num2, num4, str15, str13, str14, str11, str12, str9, str10);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getAbGroup() {
            return this.abGroup;
        }

        /* renamed from: component10, reason: from getter */
        public final String getRole() {
            return this.role;
        }

        /* renamed from: component11, reason: from getter */
        public final String getMarketplaceId() {
            return this.marketplaceId;
        }

        /* renamed from: component12, reason: from getter */
        public final String getAchievementId() {
            return this.achievementId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getRegionId() {
            return this.regionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getCompanyId() {
            return this.companyId;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getAppBuildNumber() {
            return this.appBuildNumber;
        }

        /* renamed from: component6, reason: from getter */
        public final String getGoogleId() {
            return this.googleId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAppsflyerId() {
            return this.appsflyerId;
        }

        /* renamed from: component8, reason: from getter */
        public final String getFirebaseInstallId() {
            return this.firebaseInstallId;
        }

        /* renamed from: component9, reason: from getter */
        public final String getLongCookie() {
            return this.longCookie;
        }

        @NotNull
        public final User copy(Integer abGroup, Long regionId, String clientId, Integer companyId, Integer appBuildNumber, String googleId, String appsflyerId, String firebaseInstallId, String longCookie, String role, String marketplaceId, @com.squareup.moshi.i(name = "achievement_id") String achievementId) {
            return new User(abGroup, regionId, clientId, companyId, appBuildNumber, googleId, appsflyerId, firebaseInstallId, longCookie, role, marketplaceId, achievementId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.d(this.abGroup, user.abGroup) && Intrinsics.d(this.regionId, user.regionId) && Intrinsics.d(this.clientId, user.clientId) && Intrinsics.d(this.companyId, user.companyId) && Intrinsics.d(this.appBuildNumber, user.appBuildNumber) && Intrinsics.d(this.googleId, user.googleId) && Intrinsics.d(this.appsflyerId, user.appsflyerId) && Intrinsics.d(this.firebaseInstallId, user.firebaseInstallId) && Intrinsics.d(this.longCookie, user.longCookie) && Intrinsics.d(this.role, user.role) && Intrinsics.d(this.marketplaceId, user.marketplaceId) && Intrinsics.d(this.achievementId, user.achievementId);
        }

        public final Integer getAbGroup() {
            return this.abGroup;
        }

        public final String getAchievementId() {
            return this.achievementId;
        }

        public final Integer getAppBuildNumber() {
            return this.appBuildNumber;
        }

        public final String getAppsflyerId() {
            return this.appsflyerId;
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final Integer getCompanyId() {
            return this.companyId;
        }

        public final String getFirebaseInstallId() {
            return this.firebaseInstallId;
        }

        public final String getGoogleId() {
            return this.googleId;
        }

        public final String getLongCookie() {
            return this.longCookie;
        }

        public final String getMarketplaceId() {
            return this.marketplaceId;
        }

        public final Long getRegionId() {
            return this.regionId;
        }

        public final String getRole() {
            return this.role;
        }

        public int hashCode() {
            Integer num = this.abGroup;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l11 = this.regionId;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.clientId;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.companyId;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.appBuildNumber;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str2 = this.googleId;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.appsflyerId;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.firebaseInstallId;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.longCookie;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.role;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.marketplaceId;
            int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.achievementId;
            return hashCode11 + (str8 != null ? str8.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.abGroup;
            Long l11 = this.regionId;
            String str = this.clientId;
            Integer num2 = this.companyId;
            Integer num3 = this.appBuildNumber;
            String str2 = this.googleId;
            String str3 = this.appsflyerId;
            String str4 = this.firebaseInstallId;
            String str5 = this.longCookie;
            String str6 = this.role;
            String str7 = this.marketplaceId;
            String str8 = this.achievementId;
            StringBuilder sb2 = new StringBuilder("User(abGroup=");
            sb2.append(num);
            sb2.append(", regionId=");
            sb2.append(l11);
            sb2.append(", clientId=");
            C2454a.f(num2, str, ", companyId=", ", appBuildNumber=", sb2);
            V.f(num3, ", googleId=", str2, ", appsflyerId=", sb2);
            Nh.a.h(sb2, str3, ", firebaseInstallId=", str4, ", longCookie=");
            Nh.a.h(sb2, str5, ", role=", str6, ", marketplaceId=");
            return C3173b.c(sb2, str7, ", achievementId=", str8, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.abGroup;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            Long l11 = this.regionId;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.clientId);
            Integer num2 = this.companyId;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            Integer num3 = this.appBuildNumber;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            dest.writeString(this.googleId);
            dest.writeString(this.appsflyerId);
            dest.writeString(this.firebaseInstallId);
            dest.writeString(this.longCookie);
            dest.writeString(this.role);
            dest.writeString(this.marketplaceId);
            dest.writeString(this.achievementId);
        }

        public User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7, @com.squareup.moshi.i(name = "achievement_id") String str8) {
            this.abGroup = num;
            this.regionId = l11;
            this.clientId = str;
            this.companyId = num2;
            this.appBuildNumber = num3;
            this.googleId = str2;
            this.appsflyerId = str3;
            this.firebaseInstallId = str4;
            this.longCookie = str5;
            this.role = str6;
            this.marketplaceId = str7;
            this.achievementId = str8;
        }

        public static /* synthetic */ User copy$default(User user, Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = null;
            }
            if ((i11 & 2) != 0) {
                l11 = null;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                num2 = null;
            }
            if ((i11 & 16) != 0) {
                num3 = null;
            }
            if ((i11 & 32) != 0) {
                str2 = null;
            }
            if ((i11 & 64) != 0) {
                str3 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = null;
            }
            if ((i11 & 256) != 0) {
                str5 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str6 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                str7 = null;
            }
            return user.copy(num, l11, str, num2, num3, str2, str3, str4, str5, str6, str7);
        }

        @InterfaceC3999a
        public final /* synthetic */ User copy(Integer abGroup, Long regionId, String clientId, Integer companyId, Integer appBuildNumber, String googleId, String appsflyerId, String firebaseInstallId, String longCookie, String role, String marketplaceId) {
            return copy(abGroup, regionId, clientId, companyId, appBuildNumber, googleId, appsflyerId, firebaseInstallId, longCookie, role, marketplaceId, null);
        }

        public static /* synthetic */ User copy$default(User user, Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = user.abGroup;
            }
            if ((i11 & 2) != 0) {
                l11 = user.regionId;
            }
            if ((i11 & 4) != 0) {
                str = user.clientId;
            }
            if ((i11 & 8) != 0) {
                num2 = user.companyId;
            }
            if ((i11 & 16) != 0) {
                num3 = user.appBuildNumber;
            }
            if ((i11 & 32) != 0) {
                str2 = user.googleId;
            }
            if ((i11 & 64) != 0) {
                str3 = user.appsflyerId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = user.firebaseInstallId;
            }
            if ((i11 & 256) != 0) {
                str5 = user.longCookie;
            }
            String str6 = str4;
            String str7 = str5;
            String str8 = str2;
            String str9 = str3;
            Integer num4 = num3;
            String str10 = str;
            return user.copy(num, l11, str10, num2, num4, str8, str9, str6, str7);
        }

        @InterfaceC3999a
        public final /* synthetic */ User copy(Integer abGroup, Long regionId, String clientId, Integer companyId, Integer appBuildNumber, String googleId, String appsflyerId, String firebaseInstallId, String longCookie) {
            return copy$default(this, abGroup, regionId, clientId, companyId, appBuildNumber, googleId, appsflyerId, firebaseInstallId, longCookie, this.role, null, null, 3072, null);
        }

        @InterfaceC3999a
        public final /* synthetic */ User copy(Integer abGroup, Long regionId, String clientId, Integer companyId, Integer appBuildNumber, String googleId, String appsflyerId, String firebaseInstallId, String longCookie, String role) {
            return copy$default(this, abGroup, regionId, clientId, companyId, appBuildNumber, googleId, appsflyerId, firebaseInstallId, longCookie, role, this.marketplaceId, null, 2048, null);
        }

        public static /* synthetic */ User copy$default(User user, Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = user.abGroup;
            }
            if ((i11 & 2) != 0) {
                l11 = user.regionId;
            }
            if ((i11 & 4) != 0) {
                str = user.clientId;
            }
            if ((i11 & 8) != 0) {
                num2 = user.companyId;
            }
            if ((i11 & 16) != 0) {
                num3 = user.appBuildNumber;
            }
            if ((i11 & 32) != 0) {
                str2 = user.googleId;
            }
            if ((i11 & 64) != 0) {
                str3 = user.appsflyerId;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = user.firebaseInstallId;
            }
            if ((i11 & 256) != 0) {
                str5 = user.longCookie;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                str6 = user.role;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str3;
            String str10 = str4;
            Integer num4 = num3;
            String str11 = str2;
            return user.copy(num, l11, str, num2, num4, str11, str9, str10, str7, str8);
        }

        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str7, (i11 & 2048) != 0 ? null : str8);
        }

        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str7);
        }

        @InterfaceC3999a
        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7) {
            this(num, l11, str, num2, num3, str2, str3, str4, str5, (String) null, str7, (String) null);
        }

        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5);
        }

        @InterfaceC3999a
        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5) {
            this(num, l11, str, num2, num3, str2, str3, str4, str5, null, null, null, UserVerificationMethods.USER_VERIFY_ALL, null);
        }

        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6);
        }

        @InterfaceC3999a
        public /* synthetic */ User(Integer num, Long l11, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6) {
            this(num, l11, str, num2, num3, str2, str3, str4, str5, str6, (String) null, (String) null);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(Jþ\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020\u000eJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u000eHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b%\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b&\u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b+\u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b,\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b0\u0010(R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b1\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010)\u001a\u0004\b3\u0010(¨\u0006V"}, d2 = {"Lru/ozon/tracker/model/EventEntity$Widget;", "Landroid/os/Parcelable;", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "vertical", "component", "version", "", "id", "revisionId", "configId", "config_revisionId", "index", "", "sliceType", "sliceId", "sliceIndex", "originName", "originVertical", "originComponent", "originVersion", "configDtId", "dtName", "timeSpent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getName", "getVertical", "getComponent", "getVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getRevisionId", "getConfigId", "getConfig_revisionId", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSliceType", "getSliceId", "getSliceIndex", "getOriginName", "getOriginVertical", "getOriginComponent", "getOriginVersion", "getConfigDtId", "getDtName", "getTimeSpent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/tracker/model/EventEntity$Widget;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();
        private final String component;
        private final Long configDtId;
        private final Long configId;
        private final Long config_revisionId;
        private final String dtName;
        private final Long id;
        private final Integer index;
        private final String name;
        private final String originComponent;
        private final String originName;
        private final Integer originVersion;
        private final String originVertical;
        private final Long revisionId;
        private final Long sliceId;
        private final Integer sliceIndex;
        private final String sliceType;
        private final Integer timeSpent;
        private final String type;
        private final Long version;
        private final String vertical;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Widget> {
            @Override // android.os.Parcelable.Creator
            public final Widget createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Widget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Widget[] newArray(int i11) {
                return new Widget[i11];
            }
        }

        public Widget() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Long l15, Integer num, String str5, Long l16, Integer num2, String str6, String str7, String str8, Integer num3, Long l17, String str9, Integer num4, int i11, Object obj) {
            Integer num5;
            String str10;
            String str11 = (i11 & 1) != 0 ? widget.type : str;
            String str12 = (i11 & 2) != 0 ? widget.name : str2;
            String str13 = (i11 & 4) != 0 ? widget.vertical : str3;
            String str14 = (i11 & 8) != 0 ? widget.component : str4;
            Long l18 = (i11 & 16) != 0 ? widget.version : l11;
            Long l19 = (i11 & 32) != 0 ? widget.id : l12;
            Long l21 = (i11 & 64) != 0 ? widget.revisionId : l13;
            Long l22 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? widget.configId : l14;
            Long l23 = (i11 & 256) != 0 ? widget.config_revisionId : l15;
            Integer num6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? widget.index : num;
            String str15 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? widget.sliceType : str5;
            Long l24 = (i11 & 2048) != 0 ? widget.sliceId : l16;
            Integer num7 = (i11 & 4096) != 0 ? widget.sliceIndex : num2;
            String str16 = (i11 & 8192) != 0 ? widget.originName : str6;
            String str17 = str11;
            String str18 = (i11 & 16384) != 0 ? widget.originVertical : str7;
            String str19 = (i11 & 32768) != 0 ? widget.originComponent : str8;
            Integer num8 = (i11 & 65536) != 0 ? widget.originVersion : num3;
            Long l25 = (i11 & 131072) != 0 ? widget.configDtId : l17;
            String str20 = (i11 & 262144) != 0 ? widget.dtName : str9;
            if ((i11 & 524288) != 0) {
                str10 = str20;
                num5 = widget.timeSpent;
            } else {
                num5 = num4;
                str10 = str20;
            }
            return widget.copy(str17, str12, str13, str14, l18, l19, l21, l22, l23, num6, str15, l24, num7, str16, str18, str19, num8, l25, str10, num5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSliceType() {
            return this.sliceType;
        }

        /* renamed from: component12, reason: from getter */
        public final Long getSliceId() {
            return this.sliceId;
        }

        /* renamed from: component13, reason: from getter */
        public final Integer getSliceIndex() {
            return this.sliceIndex;
        }

        /* renamed from: component14, reason: from getter */
        public final String getOriginName() {
            return this.originName;
        }

        /* renamed from: component15, reason: from getter */
        public final String getOriginVertical() {
            return this.originVertical;
        }

        /* renamed from: component16, reason: from getter */
        public final String getOriginComponent() {
            return this.originComponent;
        }

        /* renamed from: component17, reason: from getter */
        public final Integer getOriginVersion() {
            return this.originVersion;
        }

        /* renamed from: component18, reason: from getter */
        public final Long getConfigDtId() {
            return this.configDtId;
        }

        /* renamed from: component19, reason: from getter */
        public final String getDtName() {
            return this.dtName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component20, reason: from getter */
        public final Integer getTimeSpent() {
            return this.timeSpent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVertical() {
            return this.vertical;
        }

        /* renamed from: component4, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getVersion() {
            return this.version;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getRevisionId() {
            return this.revisionId;
        }

        /* renamed from: component8, reason: from getter */
        public final Long getConfigId() {
            return this.configId;
        }

        /* renamed from: component9, reason: from getter */
        public final Long getConfig_revisionId() {
            return this.config_revisionId;
        }

        @NotNull
        public final Widget copy(String type, String name, String vertical, String component, Long version, Long id2, Long revisionId, Long configId, Long config_revisionId, Integer index, String sliceType, Long sliceId, Integer sliceIndex, String originName, String originVertical, String originComponent, Integer originVersion, Long configDtId, String dtName, Integer timeSpent) {
            return new Widget(type, name, vertical, component, version, id2, revisionId, configId, config_revisionId, index, sliceType, sliceId, sliceIndex, originName, originVertical, originComponent, originVersion, configDtId, dtName, timeSpent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return Intrinsics.d(this.type, widget.type) && Intrinsics.d(this.name, widget.name) && Intrinsics.d(this.vertical, widget.vertical) && Intrinsics.d(this.component, widget.component) && Intrinsics.d(this.version, widget.version) && Intrinsics.d(this.id, widget.id) && Intrinsics.d(this.revisionId, widget.revisionId) && Intrinsics.d(this.configId, widget.configId) && Intrinsics.d(this.config_revisionId, widget.config_revisionId) && Intrinsics.d(this.index, widget.index) && Intrinsics.d(this.sliceType, widget.sliceType) && Intrinsics.d(this.sliceId, widget.sliceId) && Intrinsics.d(this.sliceIndex, widget.sliceIndex) && Intrinsics.d(this.originName, widget.originName) && Intrinsics.d(this.originVertical, widget.originVertical) && Intrinsics.d(this.originComponent, widget.originComponent) && Intrinsics.d(this.originVersion, widget.originVersion) && Intrinsics.d(this.configDtId, widget.configDtId) && Intrinsics.d(this.dtName, widget.dtName) && Intrinsics.d(this.timeSpent, widget.timeSpent);
        }

        public final String getComponent() {
            return this.component;
        }

        public final Long getConfigDtId() {
            return this.configDtId;
        }

        public final Long getConfigId() {
            return this.configId;
        }

        public final Long getConfig_revisionId() {
            return this.config_revisionId;
        }

        public final String getDtName() {
            return this.dtName;
        }

        public final Long getId() {
            return this.id;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginComponent() {
            return this.originComponent;
        }

        public final String getOriginName() {
            return this.originName;
        }

        public final Integer getOriginVersion() {
            return this.originVersion;
        }

        public final String getOriginVertical() {
            return this.originVertical;
        }

        public final Long getRevisionId() {
            return this.revisionId;
        }

        public final Long getSliceId() {
            return this.sliceId;
        }

        public final Integer getSliceIndex() {
            return this.sliceIndex;
        }

        public final String getSliceType() {
            return this.sliceType;
        }

        public final Integer getTimeSpent() {
            return this.timeSpent;
        }

        public final String getType() {
            return this.type;
        }

        public final Long getVersion() {
            return this.version;
        }

        public final String getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.vertical;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.component;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.version;
            int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.id;
            int hashCode6 = (hashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.revisionId;
            int hashCode7 = (hashCode6 + (l13 == null ? 0 : l13.hashCode())) * 31;
            Long l14 = this.configId;
            int hashCode8 = (hashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.config_revisionId;
            int hashCode9 = (hashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Integer num = this.index;
            int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.sliceType;
            int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l16 = this.sliceId;
            int hashCode12 = (hashCode11 + (l16 == null ? 0 : l16.hashCode())) * 31;
            Integer num2 = this.sliceIndex;
            int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.originName;
            int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.originVertical;
            int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.originComponent;
            int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num3 = this.originVersion;
            int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Long l17 = this.configDtId;
            int hashCode18 = (hashCode17 + (l17 == null ? 0 : l17.hashCode())) * 31;
            String str9 = this.dtName;
            int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Integer num4 = this.timeSpent;
            return hashCode19 + (num4 != null ? num4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.name;
            String str3 = this.vertical;
            String str4 = this.component;
            Long l11 = this.version;
            Long l12 = this.id;
            Long l13 = this.revisionId;
            Long l14 = this.configId;
            Long l15 = this.config_revisionId;
            Integer num = this.index;
            String str5 = this.sliceType;
            Long l16 = this.sliceId;
            Integer num2 = this.sliceIndex;
            String str6 = this.originName;
            String str7 = this.originVertical;
            String str8 = this.originComponent;
            Integer num3 = this.originVersion;
            Long l17 = this.configDtId;
            String str9 = this.dtName;
            Integer num4 = this.timeSpent;
            StringBuilder d11 = C3660k.d("Widget(type=", str, ", name=", str2, ", vertical=");
            Nh.a.h(d11, str3, ", component=", str4, ", version=");
            TY.a.e(d11, l11, ", id=", l12, ", revisionId=");
            TY.a.e(d11, l13, ", configId=", l14, ", config_revisionId=");
            d11.append(l15);
            d11.append(", index=");
            d11.append(num);
            d11.append(", sliceType=");
            d11.append(str5);
            d11.append(", sliceId=");
            d11.append(l16);
            d11.append(", sliceIndex=");
            V.f(num2, ", originName=", str6, ", originVertical=", d11);
            Nh.a.h(d11, str7, ", originComponent=", str8, ", originVersion=");
            d11.append(num3);
            d11.append(", configDtId=");
            d11.append(l17);
            d11.append(", dtName=");
            d11.append(str9);
            d11.append(", timeSpent=");
            d11.append(num4);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.name);
            dest.writeString(this.vertical);
            dest.writeString(this.component);
            Long l11 = this.version;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            Long l12 = this.id;
            if (l12 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l12);
            }
            Long l13 = this.revisionId;
            if (l13 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l13);
            }
            Long l14 = this.configId;
            if (l14 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l14);
            }
            Long l15 = this.config_revisionId;
            if (l15 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l15);
            }
            Integer num = this.index;
            if (num == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num);
            }
            dest.writeString(this.sliceType);
            Long l16 = this.sliceId;
            if (l16 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l16);
            }
            Integer num2 = this.sliceIndex;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num2);
            }
            dest.writeString(this.originName);
            dest.writeString(this.originVertical);
            dest.writeString(this.originComponent);
            Integer num3 = this.originVersion;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num3);
            }
            Long l17 = this.configDtId;
            if (l17 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l17);
            }
            dest.writeString(this.dtName);
            Integer num4 = this.timeSpent;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                Nh.a.f(dest, 1, num4);
            }
        }

        public Widget(String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Long l15, Integer num, String str5, Long l16, Integer num2, String str6, String str7, String str8, Integer num3, Long l17, String str9, Integer num4) {
            this.type = str;
            this.name = str2;
            this.vertical = str3;
            this.component = str4;
            this.version = l11;
            this.id = l12;
            this.revisionId = l13;
            this.configId = l14;
            this.config_revisionId = l15;
            this.index = num;
            this.sliceType = str5;
            this.sliceId = l16;
            this.sliceIndex = num2;
            this.originName = str6;
            this.originVertical = str7;
            this.originComponent = str8;
            this.originVersion = num3;
            this.configDtId = l17;
            this.dtName = str9;
            this.timeSpent = num4;
        }

        public /* synthetic */ Widget(String str, String str2, String str3, String str4, Long l11, Long l12, Long l13, Long l14, Long l15, Integer num, String str5, Long l16, Integer num2, String str6, String str7, String str8, Integer num3, Long l17, String str9, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : l12, (i11 & 64) != 0 ? null : l13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : l14, (i11 & 256) != 0 ? null : l15, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str5, (i11 & 2048) != 0 ? null : l16, (i11 & 4096) != 0 ? null : num2, (i11 & 8192) != 0 ? null : str6, (i11 & 16384) != 0 ? null : str7, (i11 & 32768) != 0 ? null : str8, (i11 & 65536) != 0 ? null : num3, (i11 & 131072) != 0 ? null : l17, (i11 & 262144) != 0 ? null : str9, (i11 & 524288) != 0 ? null : num4);
        }
    }

    public EventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull String version, @com.squareup.moshi.i(name = "actionType") String str3, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, @NotNull DateTime timestampMs, Courier courier) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        this.uuid = str;
        this.number = str2;
        this.timestamp = timestamp;
        this.version = version;
        this.actionType = str3;
        this.attributes = attributes;
        this.user = user;
        this.page = page;
        this.object = obj;
        this.properties = properties;
        this.widget = widget;
        this.form = form;
        this.eventError = eventError;
        this.posting = posting;
        this.custom = customCell;
        this.filter = filter;
        this.sale = sale;
        this.review = review;
        this.discountRequestId = num;
        this.advertisementCampaignId = num2;
        this.timestampMs = timestampMs;
        this.courier = courier;
    }

    public static /* synthetic */ EventEntity copy$default(EventEntity eventEntity, String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, DateTime dateTime2, Courier courier, int i11, Object obj2) {
        Courier courier2;
        DateTime dateTime3;
        String str5 = (i11 & 1) != 0 ? eventEntity.uuid : str;
        String str6 = (i11 & 2) != 0 ? eventEntity.number : str2;
        DateTime dateTime4 = (i11 & 4) != 0 ? eventEntity.timestamp : dateTime;
        String str7 = (i11 & 8) != 0 ? eventEntity.version : str3;
        String str8 = (i11 & 16) != 0 ? eventEntity.actionType : str4;
        Attributes attributes2 = (i11 & 32) != 0 ? eventEntity.attributes : attributes;
        User user2 = (i11 & 64) != 0 ? eventEntity.user : user;
        Page page2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? eventEntity.page : page;
        Obj obj3 = (i11 & 256) != 0 ? eventEntity.object : obj;
        Properties properties2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? eventEntity.properties : properties;
        Widget widget2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? eventEntity.widget : widget;
        Form form2 = (i11 & 2048) != 0 ? eventEntity.form : form;
        EventError eventError2 = (i11 & 4096) != 0 ? eventEntity.eventError : eventError;
        Posting posting2 = (i11 & 8192) != 0 ? eventEntity.posting : posting;
        String str9 = str5;
        Cell.CustomCell customCell2 = (i11 & 16384) != 0 ? eventEntity.custom : customCell;
        Filter filter2 = (i11 & 32768) != 0 ? eventEntity.filter : filter;
        Sale sale2 = (i11 & 65536) != 0 ? eventEntity.sale : sale;
        Review review2 = (i11 & 131072) != 0 ? eventEntity.review : review;
        Integer num3 = (i11 & 262144) != 0 ? eventEntity.discountRequestId : num;
        Integer num4 = (i11 & 524288) != 0 ? eventEntity.advertisementCampaignId : num2;
        DateTime dateTime5 = (i11 & 1048576) != 0 ? eventEntity.timestampMs : dateTime2;
        if ((i11 & 2097152) != 0) {
            dateTime3 = dateTime5;
            courier2 = eventEntity.courier;
        } else {
            courier2 = courier;
            dateTime3 = dateTime5;
        }
        return eventEntity.copy(str9, str6, dateTime4, str7, str8, attributes2, user2, page2, obj3, properties2, widget2, form2, eventError2, posting2, customCell2, filter2, sale2, review2, num3, num4, dateTime3, courier2);
    }

    @DateTimeWithMs
    public static /* synthetic */ void getTimestampMs$annotations() {
    }

    @com.squareup.moshi.i(name = TrinityEventEntityKt.TRACK_CAMPAIGN_UUID_JSON_NAME)
    public static /* synthetic */ void getTrackCampaignUuid$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component10, reason: from getter */
    public final Properties getProperties() {
        return this.properties;
    }

    /* renamed from: component11, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    /* renamed from: component12, reason: from getter */
    public final Form getForm() {
        return this.form;
    }

    /* renamed from: component13, reason: from getter */
    public final EventError getEventError() {
        return this.eventError;
    }

    /* renamed from: component14, reason: from getter */
    public final Posting getPosting() {
        return this.posting;
    }

    /* renamed from: component15, reason: from getter */
    public final Cell.CustomCell getCustom() {
        return this.custom;
    }

    /* renamed from: component16, reason: from getter */
    public final Filter getFilter() {
        return this.filter;
    }

    /* renamed from: component17, reason: from getter */
    public final Sale getSale() {
        return this.sale;
    }

    /* renamed from: component18, reason: from getter */
    public final Review getReview() {
        return this.review;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getDiscountRequestId() {
        return this.discountRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getAdvertisementCampaignId() {
        return this.advertisementCampaignId;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final DateTime getTimestampMs() {
        return this.timestampMs;
    }

    /* renamed from: component22, reason: from getter */
    public final Courier getCourier() {
        return this.courier;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component5, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* renamed from: component6, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* renamed from: component7, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component8, reason: from getter */
    public final Page getPage() {
        return this.page;
    }

    /* renamed from: component9, reason: from getter */
    public final Obj getObject() {
        return this.object;
    }

    @NotNull
    public final EventEntity copy(String uuid, String number, @NotNull DateTime timestamp, @NotNull String version, @com.squareup.moshi.i(name = "actionType") String actionType, Attributes attributes, User user, Page page, Obj object, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell custom, Filter filter, Sale sale, Review review, Integer discountRequestId, Integer advertisementCampaignId, @NotNull DateTime timestampMs, Courier courier) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        return new EventEntity(uuid, number, timestamp, version, actionType, attributes, user, page, object, properties, widget, form, eventError, posting, custom, filter, sale, review, discountRequestId, advertisementCampaignId, timestampMs, courier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventEntity)) {
            return false;
        }
        EventEntity eventEntity = (EventEntity) other;
        return Intrinsics.d(this.uuid, eventEntity.uuid) && Intrinsics.d(this.number, eventEntity.number) && Intrinsics.d(this.timestamp, eventEntity.timestamp) && Intrinsics.d(this.version, eventEntity.version) && Intrinsics.d(this.actionType, eventEntity.actionType) && Intrinsics.d(this.attributes, eventEntity.attributes) && Intrinsics.d(this.user, eventEntity.user) && Intrinsics.d(this.page, eventEntity.page) && Intrinsics.d(this.object, eventEntity.object) && Intrinsics.d(this.properties, eventEntity.properties) && Intrinsics.d(this.widget, eventEntity.widget) && Intrinsics.d(this.form, eventEntity.form) && Intrinsics.d(this.eventError, eventEntity.eventError) && Intrinsics.d(this.posting, eventEntity.posting) && Intrinsics.d(this.custom, eventEntity.custom) && Intrinsics.d(this.filter, eventEntity.filter) && Intrinsics.d(this.sale, eventEntity.sale) && Intrinsics.d(this.review, eventEntity.review) && Intrinsics.d(this.discountRequestId, eventEntity.discountRequestId) && Intrinsics.d(this.advertisementCampaignId, eventEntity.advertisementCampaignId) && Intrinsics.d(this.timestampMs, eventEntity.timestampMs) && Intrinsics.d(this.courier, eventEntity.courier);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final Integer getAdvertisementCampaignId() {
        return this.advertisementCampaignId;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final Courier getCourier() {
        return this.courier;
    }

    public final Cell.CustomCell getCustom() {
        return this.custom;
    }

    public final Integer getDiscountRequestId() {
        return this.discountRequestId;
    }

    public final EventError getEventError() {
        return this.eventError;
    }

    public final Filter getFilter() {
        return this.filter;
    }

    public final Form getForm() {
        return this.form;
    }

    public final String getNumber() {
        return this.number;
    }

    public final Obj getObject() {
        return this.object;
    }

    public final Page getPage() {
        return this.page;
    }

    public final Posting getPosting() {
        return this.posting;
    }

    public final Properties getProperties() {
        return this.properties;
    }

    public final Review getReview() {
        return this.review;
    }

    public final Sale getSale() {
        return this.sale;
    }

    @NotNull
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DateTime getTimestampMs() {
        return this.timestampMs;
    }

    public final String getTrackCampaignUuid() {
        return this.trackCampaignUuid;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final Widget getWidget() {
        return this.widget;
    }

    public int hashCode() {
        String str = this.uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int a11 = g.a(GR.b.a(this.timestamp, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.version);
        String str3 = this.actionType;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Attributes attributes = this.attributes;
        int hashCode3 = (hashCode2 + (attributes == null ? 0 : attributes.hashCode())) * 31;
        User user = this.user;
        int hashCode4 = (hashCode3 + (user == null ? 0 : user.hashCode())) * 31;
        Page page = this.page;
        int hashCode5 = (hashCode4 + (page == null ? 0 : page.hashCode())) * 31;
        Obj obj = this.object;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Properties properties = this.properties;
        int hashCode7 = (hashCode6 + (properties == null ? 0 : properties.hashCode())) * 31;
        Widget widget = this.widget;
        int hashCode8 = (hashCode7 + (widget == null ? 0 : widget.hashCode())) * 31;
        Form form = this.form;
        int hashCode9 = (hashCode8 + (form == null ? 0 : form.hashCode())) * 31;
        EventError eventError = this.eventError;
        int hashCode10 = (hashCode9 + (eventError == null ? 0 : eventError.hashCode())) * 31;
        Posting posting = this.posting;
        int hashCode11 = (hashCode10 + (posting == null ? 0 : posting.hashCode())) * 31;
        Cell.CustomCell customCell = this.custom;
        int hashCode12 = (hashCode11 + (customCell == null ? 0 : customCell.hashCode())) * 31;
        Filter filter = this.filter;
        int hashCode13 = (hashCode12 + (filter == null ? 0 : filter.hashCode())) * 31;
        Sale sale = this.sale;
        int hashCode14 = (hashCode13 + (sale == null ? 0 : sale.hashCode())) * 31;
        Review review = this.review;
        int hashCode15 = (hashCode14 + (review == null ? 0 : review.hashCode())) * 31;
        Integer num = this.discountRequestId;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.advertisementCampaignId;
        int a12 = GR.b.a(this.timestampMs, (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Courier courier = this.courier;
        return a12 + (courier != null ? courier.hashCode() : 0);
    }

    public final void setTrackCampaignUuid(String str) {
        this.trackCampaignUuid = str;
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.number;
        DateTime dateTime = this.timestamp;
        String str3 = this.version;
        String str4 = this.actionType;
        Attributes attributes = this.attributes;
        User user = this.user;
        Page page = this.page;
        Obj obj = this.object;
        Properties properties = this.properties;
        Widget widget = this.widget;
        Form form = this.form;
        EventError eventError = this.eventError;
        Posting posting = this.posting;
        Cell.CustomCell customCell = this.custom;
        Filter filter = this.filter;
        Sale sale = this.sale;
        Review review = this.review;
        Integer num = this.discountRequestId;
        Integer num2 = this.advertisementCampaignId;
        DateTime dateTime2 = this.timestampMs;
        Courier courier = this.courier;
        StringBuilder d11 = C3660k.d("EventEntity(uuid=", str, ", number=", str2, ", timestamp=");
        d11.append(dateTime);
        d11.append(", version=");
        d11.append(str3);
        d11.append(", actionType=");
        d11.append(str4);
        d11.append(", attributes=");
        d11.append(attributes);
        d11.append(", user=");
        d11.append(user);
        d11.append(", page=");
        d11.append(page);
        d11.append(", object=");
        d11.append(obj);
        d11.append(", properties=");
        d11.append(properties);
        d11.append(", widget=");
        d11.append(widget);
        d11.append(", form=");
        d11.append(form);
        d11.append(", eventError=");
        d11.append(eventError);
        d11.append(", posting=");
        d11.append(posting);
        d11.append(", custom=");
        d11.append(customCell);
        d11.append(", filter=");
        d11.append(filter);
        d11.append(", sale=");
        d11.append(sale);
        d11.append(", review=");
        d11.append(review);
        d11.append(", discountRequestId=");
        Ef0.c.e(d11, num, ", advertisementCampaignId=", num2, ", timestampMs=");
        d11.append(dateTime2);
        d11.append(", courier=");
        d11.append(courier);
        d11.append(")");
        return d11.toString();
    }

    public static /* synthetic */ EventEntity copy$default(EventEntity eventEntity, String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, int i11, Object obj2) {
        Integer num3;
        Integer num4;
        String str5 = (i11 & 1) != 0 ? eventEntity.uuid : str;
        String str6 = (i11 & 2) != 0 ? eventEntity.number : str2;
        DateTime dateTime2 = (i11 & 4) != 0 ? eventEntity.timestamp : dateTime;
        String str7 = (i11 & 8) != 0 ? eventEntity.version : str3;
        String str8 = (i11 & 16) != 0 ? eventEntity.actionType : str4;
        Attributes attributes2 = (i11 & 32) != 0 ? eventEntity.attributes : attributes;
        User user2 = (i11 & 64) != 0 ? eventEntity.user : user;
        Page page2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? eventEntity.page : page;
        Obj obj3 = (i11 & 256) != 0 ? eventEntity.object : obj;
        Properties properties2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? eventEntity.properties : properties;
        Widget widget2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? eventEntity.widget : widget;
        Form form2 = (i11 & 2048) != 0 ? eventEntity.form : form;
        EventError eventError2 = (i11 & 4096) != 0 ? eventEntity.eventError : eventError;
        Posting posting2 = (i11 & 8192) != 0 ? eventEntity.posting : posting;
        String str9 = str5;
        Cell.CustomCell customCell2 = (i11 & 16384) != 0 ? eventEntity.custom : customCell;
        Filter filter2 = (i11 & 32768) != 0 ? eventEntity.filter : filter;
        Sale sale2 = (i11 & 65536) != 0 ? eventEntity.sale : sale;
        Review review2 = (i11 & 131072) != 0 ? eventEntity.review : review;
        Integer num5 = (i11 & 262144) != 0 ? eventEntity.discountRequestId : num;
        if ((i11 & 524288) != 0) {
            num4 = num5;
            num3 = eventEntity.advertisementCampaignId;
        } else {
            num3 = num2;
            num4 = num5;
        }
        return eventEntity.copy(str9, str6, dateTime2, str7, str8, attributes2, user2, page2, obj3, properties2, widget2, form2, eventError2, posting2, customCell2, filter2, sale2, review2, num4, num3);
    }

    @InterfaceC3999a
    @NotNull
    public final EventEntity copy(String uuid, String number, @NotNull DateTime timestamp, @NotNull String version, String actionType, Attributes attributes, User user, Page page, Obj object, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell custom, Filter filter, Sale sale, Review review, Integer discountRequestId, Integer advertisementCampaignId) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        return new EventEntity(uuid, number, timestamp, version, actionType, attributes, user, page, object, properties, widget, form, eventError, posting, custom, filter, sale, review, discountRequestId, advertisementCampaignId, timestamp);
    }

    @InterfaceC3999a
    @NotNull
    public final EventEntity copy(String uuid, String number, @NotNull DateTime timestamp, @NotNull String version, String actionType, Attributes attributes, User user, Page page, Obj object, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell custom, Filter filter, Sale sale, Review review, Integer discountRequestId, Integer advertisementCampaignId, @NotNull DateTime timestampMs) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
        return new EventEntity(uuid, number, timestamp, version, actionType, attributes, user, page, object, properties, widget, form, eventError, posting, custom, filter, sale, review, discountRequestId, advertisementCampaignId, timestampMs, this.courier);
    }

    public static /* synthetic */ EventEntity copy$default(EventEntity eventEntity, String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, DateTime dateTime2, int i11, Object obj2) {
        DateTime dateTime3;
        Integer num3;
        String str5 = (i11 & 1) != 0 ? eventEntity.uuid : str;
        String str6 = (i11 & 2) != 0 ? eventEntity.number : str2;
        DateTime dateTime4 = (i11 & 4) != 0 ? eventEntity.timestamp : dateTime;
        String str7 = (i11 & 8) != 0 ? eventEntity.version : str3;
        String str8 = (i11 & 16) != 0 ? eventEntity.actionType : str4;
        Attributes attributes2 = (i11 & 32) != 0 ? eventEntity.attributes : attributes;
        User user2 = (i11 & 64) != 0 ? eventEntity.user : user;
        Page page2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? eventEntity.page : page;
        Obj obj3 = (i11 & 256) != 0 ? eventEntity.object : obj;
        Properties properties2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? eventEntity.properties : properties;
        Widget widget2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? eventEntity.widget : widget;
        Form form2 = (i11 & 2048) != 0 ? eventEntity.form : form;
        EventError eventError2 = (i11 & 4096) != 0 ? eventEntity.eventError : eventError;
        Posting posting2 = (i11 & 8192) != 0 ? eventEntity.posting : posting;
        String str9 = str5;
        Cell.CustomCell customCell2 = (i11 & 16384) != 0 ? eventEntity.custom : customCell;
        Filter filter2 = (i11 & 32768) != 0 ? eventEntity.filter : filter;
        Sale sale2 = (i11 & 65536) != 0 ? eventEntity.sale : sale;
        Review review2 = (i11 & 131072) != 0 ? eventEntity.review : review;
        Integer num4 = (i11 & 262144) != 0 ? eventEntity.discountRequestId : num;
        Integer num5 = (i11 & 524288) != 0 ? eventEntity.advertisementCampaignId : num2;
        if ((i11 & 1048576) != 0) {
            num3 = num5;
            dateTime3 = eventEntity.timestampMs;
        } else {
            dateTime3 = dateTime2;
            num3 = num5;
        }
        return eventEntity.copy(str9, str6, dateTime4, str7, str8, attributes2, user2, page2, obj3, properties2, widget2, form2, eventError2, posting2, customCell2, filter2, sale2, review2, num4, num3, dateTime3);
    }

    public /* synthetic */ EventEntity(String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, DateTime dateTime2, Courier courier, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, (i11 & 8) != 0 ? "2" : str3, str4, (i11 & 32) != 0 ? null : attributes, (i11 & 64) != 0 ? null : user, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : obj, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : properties, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : widget, (i11 & 2048) != 0 ? null : form, (i11 & 4096) != 0 ? null : eventError, (i11 & 8192) != 0 ? null : posting, (i11 & 16384) != 0 ? null : customCell, (32768 & i11) != 0 ? null : filter, (65536 & i11) != 0 ? null : sale, (131072 & i11) != 0 ? null : review, (262144 & i11) != 0 ? null : num, (524288 & i11) != 0 ? null : num2, dateTime2, (i11 & 2097152) != 0 ? null : courier);
    }

    public /* synthetic */ EventEntity(String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, (i11 & 8) != 0 ? "2" : str3, str4, (i11 & 32) != 0 ? null : attributes, (i11 & 64) != 0 ? null : user, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : obj, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : properties, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : widget, (i11 & 2048) != 0 ? null : form, (i11 & 4096) != 0 ? null : eventError, (i11 & 8192) != 0 ? null : posting, (i11 & 16384) != 0 ? null : customCell, (32768 & i11) != 0 ? null : filter, (65536 & i11) != 0 ? null : sale, (131072 & i11) != 0 ? null : review, (262144 & i11) != 0 ? null : num, (i11 & 524288) != 0 ? null : num2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public EventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull String version, String str3, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2) {
        this(str, str2, timestamp, version, str3, attributes, user, page, obj, properties, widget, form, eventError, posting, customCell, filter, sale, review, num, num2, timestamp);
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
    }

    public /* synthetic */ EventEntity(String str, String str2, DateTime dateTime, String str3, String str4, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, DateTime dateTime2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, dateTime, (i11 & 8) != 0 ? "2" : str3, str4, (i11 & 32) != 0 ? null : attributes, (i11 & 64) != 0 ? null : user, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : page, (i11 & 256) != 0 ? null : obj, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : properties, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : widget, (i11 & 2048) != 0 ? null : form, (i11 & 4096) != 0 ? null : eventError, (i11 & 8192) != 0 ? null : posting, (i11 & 16384) != 0 ? null : customCell, (32768 & i11) != 0 ? null : filter, (65536 & i11) != 0 ? null : sale, (131072 & i11) != 0 ? null : review, (262144 & i11) != 0 ? null : num, (i11 & 524288) != 0 ? null : num2, dateTime2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public EventEntity(String str, String str2, @NotNull DateTime timestamp, @NotNull String version, String str3, Attributes attributes, User user, Page page, Obj obj, Properties properties, Widget widget, Form form, EventError eventError, Posting posting, Cell.CustomCell customCell, Filter filter, Sale sale, Review review, Integer num, Integer num2, @NotNull DateTime timestampMs) {
        this(str, str2, timestamp, version, str3, attributes, user, page, obj, properties, widget, form, eventError, posting, customCell, filter, sale, review, num, num2, timestampMs, (Courier) null);
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(timestampMs, "timestampMs");
    }
}
