package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import B0.C2454a;
import B90.C2616s;
import Bi.b;
import C.J;
import D40.c;
import De.C2860c;
import G.g;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001DBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)Jl\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u001a\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010'R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010)R\u001c\u0010C\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010'¨\u0006E"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO;", "Landroid/os/Parcelable;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/a;", "", "id", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "type", "", "version", "selectedFrame", "", "canClose", "widgetName", "", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO$FrameDTO;", "frames", "", "ratio", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;F)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Ljava/util/List;", "component8", "()F", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;F)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "getType", "Ljava/lang/Integer;", "getVersion", "I", "getSelectedFrame", "Ljava/lang/Boolean;", "getCanClose", "getWidgetName", "Ljava/util/List;", "getFrames", "F", "getRatio", "LF40/a;", "getAllWidgets", "allWidgets", "FrameDTO", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Cbottom2OnboardingV2DTO implements Parcelable, ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a {

    @NotNull
    public static final Parcelable.Creator<Cbottom2OnboardingV2DTO> CREATOR = new a();

    @i(name = "canClose")
    private final Boolean canClose;

    @i(name = "frames")
    @NotNull
    private final List<FrameDTO> frames;

    @i(name = "id")
    @NotNull
    private final String id;

    @i(name = "ratio")
    private final float ratio;

    @i(name = "selectedFrame")
    private final int selectedFrame;

    @i(name = "type")
    @NotNull
    private final CbottomType type;

    @i(name = "version")
    private final Integer version;

    @i(name = "widgetName")
    private final String widgetName;

    @Keep
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010(J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010(JÄ\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00101\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u001a\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010&R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010(R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bA\u0010(R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bC\u0010(R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bD\u0010(R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bE\u0010(¨\u0006F"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO$FrameDTO;", "Landroid/os/Parcelable;", "", "id", "videoUrl", "imageUrl", "background", "", "duration", "", "autoplay", "", "LF40/a;", CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "main", "", "mainPaddings", "footerPaddings", "headerPaddings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO$FrameDTO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getVideoUrl", "getImageUrl", "getBackground", "Ljava/lang/Long;", "getDuration", "Ljava/lang/Boolean;", "getAutoplay", "Ljava/util/List;", "getHeader", "getFooter", "getMain", "getMainPaddings", "getFooterPaddings", "getHeaderPaddings", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FrameDTO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FrameDTO> CREATOR = new a();

        @i(name = "autoplay")
        private final Boolean autoplay;

        @i(name = "background")
        private final String background;

        @i(name = "duration")
        private final Long duration;

        @i(name = CommentV3DTO.FOOTER_FIELD_NAME)
        private final List<F40.a> footer;

        @i(name = "footerPaddings")
        private final List<Integer> footerPaddings;

        @i(name = CommentV3DTO.HEADER_FIELD_NAME)
        private final List<F40.a> header;

        @i(name = "headerPaddings")
        private final List<Integer> headerPaddings;

        @i(name = "id")
        private final String id;

        @i(name = "imageUrl")
        private final String imageUrl;

        @i(name = "main")
        private final List<F40.a> main;

        @i(name = "mainPaddings")
        private final List<Integer> mainPaddings;

        @i(name = "videoUrl")
        private final String videoUrl;

        public static final class a implements Parcelable.Creator<FrameDTO> {
            @Override // android.os.Parcelable.Creator
            public final FrameDTO createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                int i11 = 0;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt);
                    int i12 = 0;
                    while (i12 != readInt) {
                        i12 = b.a(FrameDTO.class, parcel, arrayList7, i12, 1);
                    }
                    arrayList = arrayList7;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    int i13 = 0;
                    while (i13 != readInt2) {
                        i13 = b.a(FrameDTO.class, parcel, arrayList2, i13, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt3);
                    int i14 = 0;
                    while (i14 != readInt3) {
                        i14 = b.a(FrameDTO.class, parcel, arrayList8, i14, 1);
                    }
                    arrayList3 = arrayList8;
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt4);
                    int i15 = 0;
                    while (i15 != readInt4) {
                        i15 = Sh.a.a(parcel, arrayList4, i15, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    arrayList5 = new ArrayList(readInt5);
                    int i16 = 0;
                    while (i16 != readInt5) {
                        i16 = Sh.a.a(parcel, arrayList5, i16, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList6 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt6);
                    while (i11 != readInt6) {
                        i11 = Sh.a.a(parcel, arrayList9, i11, 1);
                    }
                    arrayList6 = arrayList9;
                }
                return new FrameDTO(readString, readString2, readString3, readString4, valueOf2, valueOf, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
            }

            @Override // android.os.Parcelable.Creator
            public final FrameDTO[] newArray(int i11) {
                return new FrameDTO[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FrameDTO(String str, String str2, String str3, String str4, Long l11, Boolean bool, List<? extends F40.a> list, List<? extends F40.a> list2, List<? extends F40.a> list3, List<Integer> list4, List<Integer> list5, List<Integer> list6) {
            this.id = str;
            this.videoUrl = str2;
            this.imageUrl = str3;
            this.background = str4;
            this.duration = l11;
            this.autoplay = bool;
            this.header = list;
            this.footer = list2;
            this.main = list3;
            this.mainPaddings = list4;
            this.footerPaddings = list5;
            this.headerPaddings = list6;
        }

        public static /* synthetic */ FrameDTO copy$default(FrameDTO frameDTO, String str, String str2, String str3, String str4, Long l11, Boolean bool, List list, List list2, List list3, List list4, List list5, List list6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = frameDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = frameDTO.videoUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = frameDTO.imageUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = frameDTO.background;
            }
            if ((i11 & 16) != 0) {
                l11 = frameDTO.duration;
            }
            if ((i11 & 32) != 0) {
                bool = frameDTO.autoplay;
            }
            if ((i11 & 64) != 0) {
                list = frameDTO.header;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                list2 = frameDTO.footer;
            }
            if ((i11 & 256) != 0) {
                list3 = frameDTO.main;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                list4 = frameDTO.mainPaddings;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                list5 = frameDTO.footerPaddings;
            }
            if ((i11 & 2048) != 0) {
                list6 = frameDTO.headerPaddings;
            }
            List list7 = list5;
            List list8 = list6;
            List list9 = list3;
            List list10 = list4;
            List list11 = list;
            List list12 = list2;
            Long l12 = l11;
            Boolean bool2 = bool;
            return frameDTO.copy(str, str2, str3, str4, l12, bool2, list11, list12, list9, list10, list7, list8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<Integer> component10() {
            return this.mainPaddings;
        }

        public final List<Integer> component11() {
            return this.footerPaddings;
        }

        public final List<Integer> component12() {
            return this.headerPaddings;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackground() {
            return this.background;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        public final List<F40.a> component7() {
            return this.header;
        }

        public final List<F40.a> component8() {
            return this.footer;
        }

        public final List<F40.a> component9() {
            return this.main;
        }

        @NotNull
        public final FrameDTO copy(String id2, String videoUrl, String imageUrl, String background, Long duration, Boolean autoplay, List<? extends F40.a> header, List<? extends F40.a> footer, List<? extends F40.a> main, List<Integer> mainPaddings, List<Integer> footerPaddings, List<Integer> headerPaddings) {
            return new FrameDTO(id2, videoUrl, imageUrl, background, duration, autoplay, header, footer, main, mainPaddings, footerPaddings, headerPaddings);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FrameDTO)) {
                return false;
            }
            FrameDTO frameDTO = (FrameDTO) other;
            return Intrinsics.d(this.id, frameDTO.id) && Intrinsics.d(this.videoUrl, frameDTO.videoUrl) && Intrinsics.d(this.imageUrl, frameDTO.imageUrl) && Intrinsics.d(this.background, frameDTO.background) && Intrinsics.d(this.duration, frameDTO.duration) && Intrinsics.d(this.autoplay, frameDTO.autoplay) && Intrinsics.d(this.header, frameDTO.header) && Intrinsics.d(this.footer, frameDTO.footer) && Intrinsics.d(this.main, frameDTO.main) && Intrinsics.d(this.mainPaddings, frameDTO.mainPaddings) && Intrinsics.d(this.footerPaddings, frameDTO.footerPaddings) && Intrinsics.d(this.headerPaddings, frameDTO.headerPaddings);
        }

        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        public final String getBackground() {
            return this.background;
        }

        public final Long getDuration() {
            return this.duration;
        }

        public final List<F40.a> getFooter() {
            return this.footer;
        }

        public final List<Integer> getFooterPaddings() {
            return this.footerPaddings;
        }

        public final List<F40.a> getHeader() {
            return this.header;
        }

        public final List<Integer> getHeaderPaddings() {
            return this.headerPaddings;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final List<F40.a> getMain() {
            return this.main;
        }

        public final List<Integer> getMainPaddings() {
            return this.mainPaddings;
        }

        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.videoUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.background;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l11 = this.duration;
            int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Boolean bool = this.autoplay;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<F40.a> list = this.header;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<F40.a> list2 = this.footer;
            int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<F40.a> list3 = this.main;
            int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<Integer> list4 = this.mainPaddings;
            int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<Integer> list5 = this.footerPaddings;
            int hashCode11 = (hashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<Integer> list6 = this.headerPaddings;
            return hashCode11 + (list6 != null ? list6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.videoUrl;
            String str3 = this.imageUrl;
            String str4 = this.background;
            Long l11 = this.duration;
            Boolean bool = this.autoplay;
            List<F40.a> list = this.header;
            List<F40.a> list2 = this.footer;
            List<F40.a> list3 = this.main;
            List<Integer> list4 = this.mainPaddings;
            List<Integer> list5 = this.footerPaddings;
            List<Integer> list6 = this.headerPaddings;
            StringBuilder d11 = C3660k.d("FrameDTO(id=", str, ", videoUrl=", str2, ", imageUrl=");
            Nh.a.h(d11, str3, ", background=", str4, ", duration=");
            d11.append(l11);
            d11.append(", autoplay=");
            d11.append(bool);
            d11.append(", header=");
            C2616s.g(", footer=", ", main=", d11, list, list2);
            C2616s.g(", mainPaddings=", ", footerPaddings=", d11, list3, list4);
            d11.append(list5);
            d11.append(", headerPaddings=");
            d11.append(list6);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.videoUrl);
            dest.writeString(this.imageUrl);
            dest.writeString(this.background);
            Long l11 = this.duration;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            Boolean bool = this.autoplay;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                c.c(dest, 1, bool);
            }
            List<F40.a> list = this.header;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), flags);
                }
            }
            List<F40.a> list2 = this.footer;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator c12 = J.c(dest, 1, list2);
                while (c12.hasNext()) {
                    dest.writeParcelable((Parcelable) c12.next(), flags);
                }
            }
            List<F40.a> list3 = this.main;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                Iterator c13 = J.c(dest, 1, list3);
                while (c13.hasNext()) {
                    dest.writeParcelable((Parcelable) c13.next(), flags);
                }
            }
            List<Integer> list4 = this.mainPaddings;
            if (list4 == null) {
                dest.writeInt(0);
            } else {
                Iterator c14 = J.c(dest, 1, list4);
                while (c14.hasNext()) {
                    dest.writeInt(((Number) c14.next()).intValue());
                }
            }
            List<Integer> list5 = this.footerPaddings;
            if (list5 == null) {
                dest.writeInt(0);
            } else {
                Iterator c15 = J.c(dest, 1, list5);
                while (c15.hasNext()) {
                    dest.writeInt(((Number) c15.next()).intValue());
                }
            }
            List<Integer> list6 = this.headerPaddings;
            if (list6 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator c16 = J.c(dest, 1, list6);
            while (c16.hasNext()) {
                dest.writeInt(((Number) c16.next()).intValue());
            }
        }
    }

    public static final class a implements Parcelable.Creator<Cbottom2OnboardingV2DTO> {
        @Override // android.os.Parcelable.Creator
        public final Cbottom2OnboardingV2DTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            CbottomType valueOf = CbottomType.valueOf(parcel.readString());
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt = parcel.readInt();
            int i11 = 0;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = Ak.b.b(FrameDTO.CREATOR, parcel, arrayList, i11, 1);
            }
            return new Cbottom2OnboardingV2DTO(readString, valueOf, valueOf2, readInt, bool, readString2, arrayList, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Cbottom2OnboardingV2DTO[] newArray(int i11) {
            return new Cbottom2OnboardingV2DTO[i11];
        }
    }

    public Cbottom2OnboardingV2DTO(@NotNull String id2, @NotNull CbottomType type, Integer num, int i11, Boolean bool, String str, @NotNull List<FrameDTO> frames, float f7) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.id = id2;
        this.type = type;
        this.version = num;
        this.selectedFrame = i11;
        this.canClose = bool;
        this.widgetName = str;
        this.frames = frames;
        this.ratio = f7;
    }

    public static /* synthetic */ Cbottom2OnboardingV2DTO copy$default(Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO, String str, CbottomType cbottomType, Integer num, int i11, Boolean bool, String str2, List list, float f7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cbottom2OnboardingV2DTO.id;
        }
        if ((i12 & 2) != 0) {
            cbottomType = cbottom2OnboardingV2DTO.type;
        }
        if ((i12 & 4) != 0) {
            num = cbottom2OnboardingV2DTO.version;
        }
        if ((i12 & 8) != 0) {
            i11 = cbottom2OnboardingV2DTO.selectedFrame;
        }
        if ((i12 & 16) != 0) {
            bool = cbottom2OnboardingV2DTO.canClose;
        }
        if ((i12 & 32) != 0) {
            str2 = cbottom2OnboardingV2DTO.widgetName;
        }
        if ((i12 & 64) != 0) {
            list = cbottom2OnboardingV2DTO.frames;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            f7 = cbottom2OnboardingV2DTO.ratio;
        }
        List list2 = list;
        float f11 = f7;
        Boolean bool2 = bool;
        String str3 = str2;
        return cbottom2OnboardingV2DTO.copy(str, cbottomType, num, i11, bool2, str3, list2, f11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CbottomType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedFrame() {
        return this.selectedFrame;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @NotNull
    public final List<FrameDTO> component7() {
        return this.frames;
    }

    /* renamed from: component8, reason: from getter */
    public final float getRatio() {
        return this.ratio;
    }

    @NotNull
    public final Cbottom2OnboardingV2DTO copy(@NotNull String id2, @NotNull CbottomType type, Integer version, int selectedFrame, Boolean canClose, String widgetName, @NotNull List<FrameDTO> frames, float ratio) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(frames, "frames");
        return new Cbottom2OnboardingV2DTO(id2, type, version, selectedFrame, canClose, widgetName, frames, ratio);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cbottom2OnboardingV2DTO)) {
            return false;
        }
        Cbottom2OnboardingV2DTO cbottom2OnboardingV2DTO = (Cbottom2OnboardingV2DTO) other;
        return Intrinsics.d(this.id, cbottom2OnboardingV2DTO.id) && this.type == cbottom2OnboardingV2DTO.type && Intrinsics.d(this.version, cbottom2OnboardingV2DTO.version) && this.selectedFrame == cbottom2OnboardingV2DTO.selectedFrame && Intrinsics.d(this.canClose, cbottom2OnboardingV2DTO.canClose) && Intrinsics.d(this.widgetName, cbottom2OnboardingV2DTO.widgetName) && Intrinsics.d(this.frames, cbottom2OnboardingV2DTO.frames) && Float.compare(this.ratio, cbottom2OnboardingV2DTO.ratio) == 0;
    }

    @Override // B40.a
    public List<F40.a> getAllWidgets() {
        Tc.b builder = C7714v.B();
        for (FrameDTO frameDTO : this.frames) {
            List<F40.a> header = frameDTO.getHeader();
            if (header == null) {
                header = K.f71697a;
            }
            builder.addAll(header);
            List<F40.a> main = frameDTO.getMain();
            if (main == null) {
                main = K.f71697a;
            }
            builder.addAll(main);
            List<F40.a> footer = frameDTO.getFooter();
            if (footer == null) {
                footer = K.f71697a;
            }
            builder.addAll(footer);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    public final Boolean getCanClose() {
        return this.canClose;
    }

    @NotNull
    public final List<FrameDTO> getFrames() {
        return this.frames;
    }

    @Override // A40.a
    @NotNull
    public String getId() {
        return this.id;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getSelectedFrame() {
        return this.selectedFrame;
    }

    @Override // A40.a
    @NotNull
    public CbottomType getType() {
        return this.type;
    }

    @Override // A40.a
    public Integer getVersion() {
        return this.version;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        Integer num = this.version;
        int a11 = C2454a.a(this.selectedFrame, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Boolean bool = this.canClose;
        int hashCode2 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.widgetName;
        return Float.hashCode(this.ratio) + g.b((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.frames);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        CbottomType cbottomType = this.type;
        Integer num = this.version;
        int i11 = this.selectedFrame;
        Boolean bool = this.canClose;
        String str2 = this.widgetName;
        List<FrameDTO> list = this.frames;
        float f7 = this.ratio;
        StringBuilder sb2 = new StringBuilder("Cbottom2OnboardingV2DTO(id=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(cbottomType);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", selectedFrame=");
        sb2.append(i11);
        sb2.append(", canClose=");
        HY.b.c(bool, ", widgetName=", str2, ", frames=", sb2);
        sb2.append(list);
        sb2.append(", ratio=");
        sb2.append(f7);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // B40.a
    public boolean updateLazyColumnWidgetsOrder(List<? extends F40.a> list, boolean z11, String str, List<String> list2) {
        return a.C1999a.a(this, list, z11, str, list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type.name());
        Integer num = this.version;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeInt(this.selectedFrame);
        Boolean bool = this.canClose;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.widgetName);
        Iterator c11 = Bi.a.c(this.frames, dest);
        while (c11.hasNext()) {
            ((FrameDTO) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeFloat(this.ratio);
    }

    public /* synthetic */ Cbottom2OnboardingV2DTO(String str, CbottomType cbottomType, Integer num, int i11, Boolean bool, String str2, List list, float f7, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? CbottomType.ONBOARDING : cbottomType, (i12 & 4) != 0 ? 2 : num, i11, bool, str2, list, f7);
    }
}
