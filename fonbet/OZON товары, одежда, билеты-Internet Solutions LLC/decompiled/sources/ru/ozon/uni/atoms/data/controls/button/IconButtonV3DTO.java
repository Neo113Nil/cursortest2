package ru.ozon.uni.atoms.data.controls.button;

import D40.c;
import G.g;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003RSTB«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0019B¡\u0001\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u001aB}\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u001bBq\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u001cJ§\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u00104J\u0083\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u00105Jw\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0016H\u0016J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J´\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020\u0016J\u0013\u0010H\u001a\u00020\u000b2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\u0016HÖ\u0001J\t\u0010L\u001a\u00020\tHÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\n\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0010\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b-\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$¨\u0006U"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "size", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "styleType", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "buttonShape", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "icon", "", "isDisabled", "", "iconColor", "backgroundColor", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isHoverDisabled", "buttonStyle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "hasStroke", "strokeColor", "strokeWidth", "", "hoverColor", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)V", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;)V", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)V", "getSize", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "getStyleType", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getButtonShape", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "getIcon", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIconColor", "getBackgroundColor", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getButtonStyle", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "getHasStroke", "getStrokeColor", "getStrokeWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHoverColor", "copy", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Sizes", "ButtonStyle", "IconButtonShape", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IconButtonV3DTO extends ButtonsDTO {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<IconButtonV3DTO> CREATOR = new Creator();
    private final String backgroundColor;

    @EnumNullFallback
    private final IconButtonShape buttonShape;

    @EnumNullFallback
    private final ButtonStyle buttonStyle;
    private final CommonControlSettings common;
    private final Boolean hasStroke;
    private final String hoverColor;

    @NotNull
    private final String icon;
    private final String iconColor;
    private final Boolean isDisabled;
    private final Boolean isHoverDisabled;

    @EnumNullFallback
    private final Sizes size;
    private final String strokeColor;
    private final Integer strokeWidth;

    @EnumNullFallback
    private final ButtonV3DTO.StyleTypes styleType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_PRIMARY", "ACTION_SECONDARY", "ACCENT_PRIMARY", "ACCENT_SECONDARY", "NEUTRAL_SECONDARY", "NEUTRAL_TRANSPARENT", "NEGATIVE", "CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle ACTION_PRIMARY = new ButtonStyle("ACTION_PRIMARY", 0);
        public static final ButtonStyle ACTION_SECONDARY = new ButtonStyle("ACTION_SECONDARY", 1);
        public static final ButtonStyle ACCENT_PRIMARY = new ButtonStyle("ACCENT_PRIMARY", 2);
        public static final ButtonStyle ACCENT_SECONDARY = new ButtonStyle("ACCENT_SECONDARY", 3);
        public static final ButtonStyle NEUTRAL_SECONDARY = new ButtonStyle("NEUTRAL_SECONDARY", 4);
        public static final ButtonStyle NEUTRAL_TRANSPARENT = new ButtonStyle("NEUTRAL_TRANSPARENT", 5);
        public static final ButtonStyle NEGATIVE = new ButtonStyle("NEGATIVE", 6);
        public static final ButtonStyle CUSTOM = new ButtonStyle("CUSTOM", 7);

        private static final /* synthetic */ ButtonStyle[] $values() {
            return new ButtonStyle[]{ACTION_PRIMARY, ACTION_SECONDARY, ACCENT_PRIMARY, ACCENT_SECONDARY, NEUTRAL_SECONDARY, NEUTRAL_TRANSPARENT, NEGATIVE, CUSTOM};
        }

        static {
            ButtonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonStyle(String str, int i11) {
        }

        @NotNull
        public static a<ButtonStyle> getEntries() {
            return $ENTRIES;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconButtonV3DTO> {
        @Override // android.os.Parcelable.Creator
        public final IconButtonV3DTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Sizes valueOf4 = parcel.readInt() == 0 ? null : Sizes.valueOf(parcel.readString());
            ButtonV3DTO.StyleTypes valueOf5 = parcel.readInt() == 0 ? null : ButtonV3DTO.StyleTypes.valueOf(parcel.readString());
            IconButtonShape valueOf6 = parcel.readInt() == 0 ? null : IconButtonShape.valueOf(parcel.readString());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z11 = false;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CommonControlSettings createFromParcel = parcel.readInt() == 0 ? null : CommonControlSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ButtonStyle valueOf7 = parcel.readInt() == 0 ? null : ButtonStyle.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                valueOf3 = Boolean.valueOf(z11);
            }
            return new IconButtonV3DTO(valueOf4, valueOf5, valueOf6, readString, valueOf, readString2, readString3, createFromParcel, valueOf2, valueOf7, valueOf3, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconButtonV3DTO[] newArray(int i11) {
            return new IconButtonV3DTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$IconButtonShape;", "", "<init>", "(Ljava/lang/String;I)V", "SHAPE_CIRCLE", "SHAPE_SQUARE", "SHAPE_SQUARE_FORCE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconButtonShape {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconButtonShape[] $VALUES;
        public static final IconButtonShape SHAPE_CIRCLE = new IconButtonShape("SHAPE_CIRCLE", 0);
        public static final IconButtonShape SHAPE_SQUARE = new IconButtonShape("SHAPE_SQUARE", 1);
        public static final IconButtonShape SHAPE_SQUARE_FORCE = new IconButtonShape("SHAPE_SQUARE_FORCE", 2);

        private static final /* synthetic */ IconButtonShape[] $values() {
            return new IconButtonShape[]{SHAPE_CIRCLE, SHAPE_SQUARE, SHAPE_SQUARE_FORCE};
        }

        static {
            IconButtonShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconButtonShape(String str, int i11) {
        }

        @NotNull
        public static a<IconButtonShape> getEntries() {
            return $ENTRIES;
        }

        public static IconButtonShape valueOf(String str) {
            return (IconButtonShape) Enum.valueOf(IconButtonShape.class, str);
        }

        public static IconButtonShape[] values() {
            return (IconButtonShape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "", "size", "", "cornerRadius", "<init>", "(Ljava/lang/String;III)V", "getSize", "()I", "getCornerRadius", "SIZE_300", "SIZE_400", "SIZE_450", "SIZE_500", "SIZE_600", "SIZE_700", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sizes {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Sizes[] $VALUES;
        public static final Sizes SIZE_300 = new Sizes("SIZE_300", 0, 24, 8);
        public static final Sizes SIZE_400 = new Sizes("SIZE_400", 1, 32, 10);
        public static final Sizes SIZE_450 = new Sizes("SIZE_450", 2, 40, 12);
        public static final Sizes SIZE_500 = new Sizes("SIZE_500", 3, 44, 12);
        public static final Sizes SIZE_600 = new Sizes("SIZE_600", 4, 56, 16);
        public static final Sizes SIZE_700 = new Sizes("SIZE_700", 5, 72, 20);
        private final int cornerRadius;
        private final int size;

        private static final /* synthetic */ Sizes[] $values() {
            return new Sizes[]{SIZE_300, SIZE_400, SIZE_450, SIZE_500, SIZE_600, SIZE_700};
        }

        static {
            Sizes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Sizes(String str, int i11, int i12, int i13) {
            this.size = i12;
            this.cornerRadius = i13;
        }

        @NotNull
        public static a<Sizes> getEntries() {
            return $ENTRIES;
        }

        public static Sizes valueOf(String str) {
            return (Sizes) Enum.valueOf(Sizes.class, str);
        }

        public static Sizes[] values() {
            return (Sizes[]) $VALUES.clone();
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getSize() {
            return this.size;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ IconButtonV3DTO(ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.Sizes r18, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO.StyleTypes r19, ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.IconButtonShape r20, java.lang.String r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, ru.ozon.uni.atoms.data.controls.CommonControlSettings r25, java.lang.Boolean r26, ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.ButtonStyle r27, java.lang.Boolean r28, java.lang.String r29, java.lang.Integer r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto La
            ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$Sizes r1 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.Sizes.SIZE_400
            r3 = r1
            goto Lc
        La:
            r3 = r18
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO$StyleTypes r1 = ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO.StyleTypes.ACTION_PRIMARY
            r4 = r1
            goto L16
        L14:
            r4 = r19
        L16:
            r1 = r0 & 4
            if (r1 == 0) goto L1e
            ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$IconButtonShape r1 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE
            r5 = r1
            goto L20
        L1e:
            r5 = r20
        L20:
            r1 = r0 & 16
            if (r1 == 0) goto L28
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7 = r1
            goto L2a
        L28:
            r7 = r22
        L2a:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L31
            r8 = r2
            goto L33
        L31:
            r8 = r23
        L33:
            r1 = r0 & 64
            if (r1 == 0) goto L39
            r9 = r2
            goto L3b
        L39:
            r9 = r24
        L3b:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L41
            r10 = r2
            goto L43
        L41:
            r10 = r25
        L43:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11 = r1
            goto L4d
        L4b:
            r11 = r26
        L4d:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5d
            if (r4 == 0) goto L59
            ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$ButtonStyle r1 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOKt.access$toIconButtonStyle(r4)
            if (r1 != 0) goto L5b
        L59:
            ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$ButtonStyle r1 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.ButtonStyle.ACTION_PRIMARY
        L5b:
            r12 = r1
            goto L5f
        L5d:
            r12 = r27
        L5f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L67
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r13 = r1
            goto L69
        L67:
            r13 = r28
        L69:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L71
            java.lang.String r1 = "graphicSecondaryDynamic"
            r14 = r1
            goto L73
        L71:
            r14 = r29
        L73:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L7e
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15 = r1
            goto L80
        L7e:
            r15 = r30
        L80:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L8b
            r16 = r2
            r6 = r21
            r2 = r17
            goto L91
        L8b:
            r16 = r31
            r2 = r17
            r6 = r21
        L91:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO.<init>(ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$Sizes, ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO$StyleTypes, ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$IconButtonShape, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, ru.ozon.uni.atoms.data.controls.CommonControlSettings, java.lang.Boolean, ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO$ButtonStyle, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, Boolean bool3, String str4, Integer num, String str5, int i11, Object obj) {
        return iconButtonV3DTO.copy((i11 & 1) != 0 ? iconButtonV3DTO.size : sizes, (i11 & 2) != 0 ? iconButtonV3DTO.styleType : styleTypes, (i11 & 4) != 0 ? iconButtonV3DTO.buttonShape : iconButtonShape, (i11 & 8) != 0 ? iconButtonV3DTO.icon : str, (i11 & 16) != 0 ? iconButtonV3DTO.isDisabled : bool, (i11 & 32) != 0 ? iconButtonV3DTO.iconColor : str2, (i11 & 64) != 0 ? iconButtonV3DTO.backgroundColor : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconButtonV3DTO.common : commonControlSettings, (i11 & 256) != 0 ? iconButtonV3DTO.isHoverDisabled : bool2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconButtonV3DTO.buttonStyle : buttonStyle, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconButtonV3DTO.hasStroke : bool3, (i11 & 2048) != 0 ? iconButtonV3DTO.strokeColor : str4, (i11 & 4096) != 0 ? iconButtonV3DTO.strokeWidth : num, (i11 & 8192) != 0 ? iconButtonV3DTO.hoverColor : str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Sizes getSize() {
        return this.size;
    }

    /* renamed from: component10, reason: from getter */
    public final ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getHasStroke() {
        return this.hasStroke;
    }

    /* renamed from: component12, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: component14, reason: from getter */
    public final String getHoverColor() {
        return this.hoverColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO.StyleTypes getStyleType() {
        return this.styleType;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonShape getButtonShape() {
        return this.buttonShape;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsHoverDisabled() {
        return this.isHoverDisabled;
    }

    @NotNull
    public final IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, @NotNull String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled, ButtonStyle buttonStyle, Boolean hasStroke, String strokeColor, Integer strokeWidth, String hoverColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconButtonV3DTO(size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, isHoverDisabled, buttonStyle, hasStroke, strokeColor, strokeWidth, hoverColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonV3DTO)) {
            return false;
        }
        IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) other;
        return this.size == iconButtonV3DTO.size && this.styleType == iconButtonV3DTO.styleType && this.buttonShape == iconButtonV3DTO.buttonShape && Intrinsics.d(this.icon, iconButtonV3DTO.icon) && Intrinsics.d(this.isDisabled, iconButtonV3DTO.isDisabled) && Intrinsics.d(this.iconColor, iconButtonV3DTO.iconColor) && Intrinsics.d(this.backgroundColor, iconButtonV3DTO.backgroundColor) && Intrinsics.d(this.common, iconButtonV3DTO.common) && Intrinsics.d(this.isHoverDisabled, iconButtonV3DTO.isHoverDisabled) && this.buttonStyle == iconButtonV3DTO.buttonStyle && Intrinsics.d(this.hasStroke, iconButtonV3DTO.hasStroke) && Intrinsics.d(this.strokeColor, iconButtonV3DTO.strokeColor) && Intrinsics.d(this.strokeWidth, iconButtonV3DTO.strokeWidth) && Intrinsics.d(this.hoverColor, iconButtonV3DTO.hoverColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final IconButtonShape getButtonShape() {
        return this.buttonShape;
    }

    public final ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @Override // ru.ozon.uni.atoms.data.controls.button.ButtonsDTO
    public CommonControlSettings getCommon() {
        return this.common;
    }

    public final Boolean getHasStroke() {
        return this.hasStroke;
    }

    public final String getHoverColor() {
        return this.hoverColor;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.iconButtonV3;
    }

    public final Sizes getSize() {
        return this.size;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final Integer getStrokeWidth() {
        return this.strokeWidth;
    }

    public final ButtonV3DTO.StyleTypes getStyleType() {
        return this.styleType;
    }

    public int hashCode() {
        Sizes sizes = this.size;
        int hashCode = (sizes == null ? 0 : sizes.hashCode()) * 31;
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        int hashCode2 = (hashCode + (styleTypes == null ? 0 : styleTypes.hashCode())) * 31;
        IconButtonShape iconButtonShape = this.buttonShape;
        int a11 = g.a((hashCode2 + (iconButtonShape == null ? 0 : iconButtonShape.hashCode())) * 31, 31, this.icon);
        Boolean bool = this.isDisabled;
        int hashCode3 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.iconColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode6 = (hashCode5 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Boolean bool2 = this.isHoverDisabled;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ButtonStyle buttonStyle = this.buttonStyle;
        int hashCode8 = (hashCode7 + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31;
        Boolean bool3 = this.hasStroke;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.strokeColor;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.strokeWidth;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.hoverColor;
        return hashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    public final Boolean isHoverDisabled() {
        return this.isHoverDisabled;
    }

    @NotNull
    public String toString() {
        Sizes sizes = this.size;
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        IconButtonShape iconButtonShape = this.buttonShape;
        String str = this.icon;
        Boolean bool = this.isDisabled;
        String str2 = this.iconColor;
        String str3 = this.backgroundColor;
        CommonControlSettings commonControlSettings = this.common;
        Boolean bool2 = this.isHoverDisabled;
        ButtonStyle buttonStyle = this.buttonStyle;
        Boolean bool3 = this.hasStroke;
        String str4 = this.strokeColor;
        Integer num = this.strokeWidth;
        String str5 = this.hoverColor;
        StringBuilder sb2 = new StringBuilder("IconButtonV3DTO(size=");
        sb2.append(sizes);
        sb2.append(", styleType=");
        sb2.append(styleTypes);
        sb2.append(", buttonShape=");
        sb2.append(iconButtonShape);
        sb2.append(", icon=");
        sb2.append(str);
        sb2.append(", isDisabled=");
        HY.b.c(bool, ", iconColor=", str2, ", backgroundColor=", sb2);
        sb2.append(str3);
        sb2.append(", common=");
        sb2.append(commonControlSettings);
        sb2.append(", isHoverDisabled=");
        sb2.append(bool2);
        sb2.append(", buttonStyle=");
        sb2.append(buttonStyle);
        sb2.append(", hasStroke=");
        HY.b.c(bool3, ", strokeColor=", str4, ", strokeWidth=", sb2);
        sb2.append(num);
        sb2.append(", hoverColor=");
        sb2.append(str5);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Sizes sizes = this.size;
        if (sizes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sizes.name());
        }
        ButtonV3DTO.StyleTypes styleTypes = this.styleType;
        if (styleTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(styleTypes.name());
        }
        IconButtonShape iconButtonShape = this.buttonShape;
        if (iconButtonShape == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconButtonShape.name());
        }
        dest.writeString(this.icon);
        Boolean bool = this.isDisabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        dest.writeString(this.iconColor);
        dest.writeString(this.backgroundColor);
        CommonControlSettings commonControlSettings = this.common;
        if (commonControlSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonControlSettings.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.isHoverDisabled;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        ButtonStyle buttonStyle = this.buttonStyle;
        if (buttonStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(buttonStyle.name());
        }
        Boolean bool3 = this.hasStroke;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool3);
        }
        dest.writeString(this.strokeColor);
        Integer num = this.strokeWidth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeString(this.hoverColor);
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, Boolean bool3, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sizes = iconButtonV3DTO.size;
        }
        return iconButtonV3DTO.copy(sizes, (i11 & 2) != 0 ? iconButtonV3DTO.styleType : styleTypes, (i11 & 4) != 0 ? iconButtonV3DTO.buttonShape : iconButtonShape, (i11 & 8) != 0 ? iconButtonV3DTO.icon : str, (i11 & 16) != 0 ? iconButtonV3DTO.isDisabled : bool, (i11 & 32) != 0 ? iconButtonV3DTO.iconColor : str2, (i11 & 64) != 0 ? iconButtonV3DTO.backgroundColor : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconButtonV3DTO.getCommon() : commonControlSettings, (i11 & 256) != 0 ? iconButtonV3DTO.isHoverDisabled : bool2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconButtonV3DTO.buttonStyle : buttonStyle, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconButtonV3DTO.hasStroke : bool3, (i11 & 2048) != 0 ? iconButtonV3DTO.strokeColor : str4, (i11 & 4096) != 0 ? iconButtonV3DTO.strokeWidth : num);
    }

    @InterfaceC3999a
    public final /* synthetic */ IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled, ButtonStyle buttonStyle, Boolean hasStroke, String strokeColor, Integer strokeWidth) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return copy(size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, isHoverDisabled, buttonStyle, hasStroke, strokeColor, strokeWidth, this.hoverColor);
    }

    @InterfaceC3999a
    public final /* synthetic */ IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled, ButtonStyle buttonStyle) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return copy(size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, isHoverDisabled, buttonStyle, Boolean.FALSE, "graphicSecondaryDynamic", 1, null);
    }

    @InterfaceC3999a
    public final /* synthetic */ IconButtonV3DTO copy(Sizes size, ButtonV3DTO.StyleTypes styleType, IconButtonShape buttonShape, String icon, Boolean isDisabled, String iconColor, String backgroundColor, CommonControlSettings common, Boolean isHoverDisabled) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return copy$default(this, size, styleType, buttonShape, icon, isDisabled, iconColor, backgroundColor, common, isHoverDisabled, this.buttonStyle, null, null, null, null, 15360, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, @NotNull String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, Boolean bool3, String str3, Integer num, String str4) {
        super(DsAtomsType.ICON_BUTTON_V3, commonControlSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.size = sizes;
        this.styleType = styleTypes;
        this.buttonShape = iconButtonShape;
        this.icon = icon;
        this.isDisabled = bool;
        this.iconColor = str;
        this.backgroundColor = str2;
        this.common = commonControlSettings;
        this.isHoverDisabled = bool2;
        this.buttonStyle = buttonStyle;
        this.hasStroke = bool3;
        this.strokeColor = str3;
        this.strokeWidth = num;
        this.hoverColor = str4;
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sizes = iconButtonV3DTO.size;
        }
        if ((i11 & 2) != 0) {
            styleTypes = iconButtonV3DTO.styleType;
        }
        if ((i11 & 4) != 0) {
            iconButtonShape = iconButtonV3DTO.buttonShape;
        }
        if ((i11 & 8) != 0) {
            str = iconButtonV3DTO.icon;
        }
        if ((i11 & 16) != 0) {
            bool = iconButtonV3DTO.isDisabled;
        }
        if ((i11 & 32) != 0) {
            str2 = iconButtonV3DTO.iconColor;
        }
        if ((i11 & 64) != 0) {
            str3 = iconButtonV3DTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = iconButtonV3DTO.getCommon();
        }
        if ((i11 & 256) != 0) {
            bool2 = iconButtonV3DTO.isHoverDisabled;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            buttonStyle = iconButtonV3DTO.buttonStyle;
        }
        Boolean bool3 = bool2;
        ButtonStyle buttonStyle2 = buttonStyle;
        String str4 = str3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Boolean bool4 = bool;
        String str5 = str2;
        return iconButtonV3DTO.copy(sizes, styleTypes, iconButtonShape, str, bool4, str5, str4, commonControlSettings2, bool3, buttonStyle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r1 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOKt.toIconButtonStyle(r4);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, Boolean bool3, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str, r7, r8, r9, r10, r11, r12, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? Boolean.FALSE : bool3, (i11 & 2048) != 0 ? "graphicSecondaryDynamic" : str4, (i11 & 4096) != 0 ? 1 : num);
        ButtonStyle buttonStyle2;
        Sizes sizes2 = (i11 & 1) != 0 ? Sizes.SIZE_400 : sizes;
        ButtonV3DTO.StyleTypes styleTypes2 = (i11 & 2) != 0 ? ButtonV3DTO.StyleTypes.ACTION_PRIMARY : styleTypes;
        IconButtonShape iconButtonShape2 = (i11 & 4) != 0 ? IconButtonShape.SHAPE_SQUARE : iconButtonShape;
        Boolean bool4 = (i11 & 16) != 0 ? Boolean.FALSE : bool;
        String str5 = (i11 & 32) != 0 ? null : str2;
        String str6 = (i11 & 64) != 0 ? null : str3;
        CommonControlSettings commonControlSettings2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings;
        Boolean bool5 = (i11 & 256) != 0 ? Boolean.FALSE : bool2;
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            ButtonStyle buttonStyle3 = (styleTypes2 == null || buttonStyle3 == null) ? ButtonStyle.ACTION_PRIMARY : buttonStyle3;
            buttonStyle2 = buttonStyle3;
        } else {
            buttonStyle2 = buttonStyle;
        }
    }

    public static /* synthetic */ IconButtonV3DTO copy$default(IconButtonV3DTO iconButtonV3DTO, Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sizes = iconButtonV3DTO.size;
        }
        if ((i11 & 2) != 0) {
            styleTypes = iconButtonV3DTO.styleType;
        }
        if ((i11 & 4) != 0) {
            iconButtonShape = iconButtonV3DTO.buttonShape;
        }
        if ((i11 & 8) != 0) {
            str = iconButtonV3DTO.icon;
        }
        if ((i11 & 16) != 0) {
            bool = iconButtonV3DTO.isDisabled;
        }
        if ((i11 & 32) != 0) {
            str2 = iconButtonV3DTO.iconColor;
        }
        if ((i11 & 64) != 0) {
            str3 = iconButtonV3DTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            commonControlSettings = iconButtonV3DTO.getCommon();
        }
        if ((i11 & 256) != 0) {
            bool2 = iconButtonV3DTO.isHoverDisabled;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Boolean bool3 = bool2;
        String str4 = str2;
        String str5 = str3;
        Boolean bool4 = bool;
        IconButtonShape iconButtonShape2 = iconButtonShape;
        return iconButtonV3DTO.copy(sizes, styleTypes, iconButtonShape2, str, bool4, str4, str5, commonControlSettings2, bool3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, Boolean bool3, String str3, Integer num) {
        this(sizes, styleTypes, iconButtonShape, icon, bool, str, str2, commonControlSettings, bool2, buttonStyle, Boolean.FALSE, "graphicSecondaryDynamic", 1, null);
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        r11 = ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTOKt.toIconButtonStyle(r3);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sizes, styleTypes, iconButtonShape, str, bool, str2, str3, commonControlSettings, bool2, buttonStyle);
        sizes = (i11 & 1) != 0 ? Sizes.SIZE_400 : sizes;
        styleTypes = (i11 & 2) != 0 ? ButtonV3DTO.StyleTypes.ACTION_PRIMARY : styleTypes;
        iconButtonShape = (i11 & 4) != 0 ? IconButtonShape.SHAPE_SQUARE : iconButtonShape;
        bool = (i11 & 16) != 0 ? Boolean.FALSE : bool;
        str2 = (i11 & 32) != 0 ? null : str2;
        str3 = (i11 & 64) != 0 ? null : str3;
        commonControlSettings = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings;
        bool2 = (i11 & 256) != 0 ? Boolean.FALSE : bool2;
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && (styleTypes == null || buttonStyle == null)) {
            buttonStyle = ButtonStyle.ACTION_PRIMARY;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings, Boolean bool2, ButtonStyle buttonStyle) {
        this(sizes, styleTypes, iconButtonShape, icon, bool, str, str2, commonControlSettings, bool2, buttonStyle, Boolean.FALSE, "graphicSecondaryDynamic", 1, null, 8192, null);
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String str, Boolean bool, String str2, String str3, CommonControlSettings commonControlSettings, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Sizes.SIZE_400 : sizes, (i11 & 2) != 0 ? ButtonV3DTO.StyleTypes.ACTION_PRIMARY : styleTypes, (i11 & 4) != 0 ? IconButtonShape.SHAPE_SQUARE : iconButtonShape, str, (i11 & 16) != 0 ? Boolean.FALSE : bool, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : commonControlSettings, (i11 & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC3999a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IconButtonV3DTO(Sizes sizes, ButtonV3DTO.StyleTypes styleTypes, IconButtonShape iconButtonShape, String icon, Boolean bool, String str, String str2, CommonControlSettings commonControlSettings, Boolean bool2) {
        this(sizes, styleTypes, iconButtonShape, icon, bool, str, str2, commonControlSettings, bool2, r11, null, null, null, null, 15360, null);
        ButtonStyle iconButtonStyle;
        Intrinsics.checkNotNullParameter(icon, "icon");
        iconButtonStyle = IconButtonV3DTOKt.toIconButtonStyle(styleTypes);
    }
}
