package com.adsbynimbus.render.mraid;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.a1g;
import defpackage.ge0;
import defpackage.gjh;
import defpackage.h2f;
import defpackage.ie0;
import defpackage.joa;
import defpackage.kwd;
import defpackage.l2f;
import defpackage.ljh;
import defpackage.mwd;
import defpackage.nf9;
import defpackage.oea;
import defpackage.of9;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uh6;
import defpackage.wf3;
import defpackage.wh6;
import defpackage.wx4;
import defpackage.y0g;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zg3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Keep
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 12\u00020\u0001:\u000223B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019B§\u0001\b\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ(\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"HÁ\u0001¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0016\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+¨\u00064"}, d2 = {"Lcom/adsbynimbus/render/mraid/Host;", "", "Lie0;", "CurrentAppOrientation", "Ll2f;", "CurrentPosition", "", U3.i.o, "", "PlacementType", "Lljh;", "MaxSize", "ScreenSize", "Lmwd;", "OrientationProperties", "La1g;", "ResizeProperties", "DefaultPosition", "State", "Lwh6;", "ExpandProperties", "", "supports", "Version", "<init>", "(Lie0;Ll2f;ZLjava/lang/String;Lljh;Lljh;Lmwd;La1g;Ll2f;Ljava/lang/String;Lwh6;Ljava/util/Map;Ljava/lang/String;)V", "", "seen1", "Lt5h;", "serializationConstructorMarker", "(ILie0;Ll2f;ZLjava/lang/String;Lljh;Lljh;Lmwd;La1g;Ll2f;Ljava/lang/String;Lwh6;Ljava/util/Map;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$static_release", "(Lcom/adsbynimbus/render/mraid/Host;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lie0;", "Ll2f;", "Z", "Ljava/lang/String;", "Lljh;", "Lmwd;", "La1g;", "Lwh6;", "Ljava/util/Map;", "Companion", "nf9", "of9", "static_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Host {

    @NotNull
    public ie0 CurrentAppOrientation;

    @NotNull
    public l2f CurrentPosition;

    @NotNull
    public l2f DefaultPosition;

    @NotNull
    public wh6 ExpandProperties;

    @NotNull
    public final ljh MaxSize;

    @Nullable
    public mwd OrientationProperties;

    @NotNull
    public final String PlacementType;

    @Nullable
    public a1g ResizeProperties;

    @NotNull
    public final ljh ScreenSize;

    @NotNull
    public String State;

    @NotNull
    public final String Version;
    public boolean isViewable;

    @NotNull
    public final Map<String, Boolean> supports;

    @NotNull
    public static final of9 Companion = new of9();

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, zg3.t), null};

    @wx4
    public /* synthetic */ Host(int i, ie0 ie0Var, l2f l2fVar, boolean z, String str, ljh ljhVar, ljh ljhVar2, mwd mwdVar, a1g a1gVar, l2f l2fVar2, String str2, wh6 wh6Var, Map map, String str3, t5h t5hVar) {
        if (7999 != (i & 7999)) {
            oea.z(i, 7999, nf9.a.getDescriptor());
            throw null;
        }
        this.CurrentAppOrientation = ie0Var;
        this.CurrentPosition = l2fVar;
        this.isViewable = z;
        this.PlacementType = str;
        this.MaxSize = ljhVar;
        this.ScreenSize = ljhVar2;
        if ((i & 64) == 0) {
            this.OrientationProperties = null;
        } else {
            this.OrientationProperties = mwdVar;
        }
        if ((i & 128) == 0) {
            this.ResizeProperties = null;
        } else {
            this.ResizeProperties = a1gVar;
        }
        this.DefaultPosition = l2fVar2;
        this.State = str2;
        this.ExpandProperties = wh6Var;
        this.supports = map;
        this.Version = str3;
    }

    public static final /* synthetic */ void write$Self$static_release(Host self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, ge0.a, self.CurrentAppOrientation);
        h2f h2fVar = h2f.a;
        output.f(serialDesc, 1, h2fVar, self.CurrentPosition);
        output.x(serialDesc, 2, self.isViewable);
        output.y(serialDesc, 3, self.PlacementType);
        gjh gjhVar = gjh.a;
        output.f(serialDesc, 4, gjhVar, self.MaxSize);
        output.f(serialDesc, 5, gjhVar, self.ScreenSize);
        if (output.o(serialDesc) || self.OrientationProperties != null) {
            output.h(serialDesc, 6, kwd.a, self.OrientationProperties);
        }
        if (output.o(serialDesc) || self.ResizeProperties != null) {
            output.h(serialDesc, 7, y0g.a, self.ResizeProperties);
        }
        output.f(serialDesc, 8, h2fVar, self.DefaultPosition);
        output.y(serialDesc, 9, self.State);
        output.f(serialDesc, 10, uh6.a, self.ExpandProperties);
        output.f(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.supports);
        output.y(serialDesc, 12, self.Version);
    }

    public Host(@NotNull ie0 ie0Var, @NotNull l2f l2fVar, boolean z, @NotNull String str, @NotNull ljh ljhVar, @NotNull ljh ljhVar2, @Nullable mwd mwdVar, @Nullable a1g a1gVar, @NotNull l2f l2fVar2, @NotNull String str2, @NotNull wh6 wh6Var, @NotNull Map<String, Boolean> map, @NotNull String str3) {
        ie0Var.getClass();
        l2fVar.getClass();
        str.getClass();
        ljhVar.getClass();
        ljhVar2.getClass();
        l2fVar2.getClass();
        str2.getClass();
        wh6Var.getClass();
        map.getClass();
        str3.getClass();
        this.CurrentAppOrientation = ie0Var;
        this.CurrentPosition = l2fVar;
        this.isViewable = z;
        this.PlacementType = str;
        this.MaxSize = ljhVar;
        this.ScreenSize = ljhVar2;
        this.OrientationProperties = mwdVar;
        this.ResizeProperties = a1gVar;
        this.DefaultPosition = l2fVar2;
        this.State = str2;
        this.ExpandProperties = wh6Var;
        this.supports = map;
        this.Version = str3;
    }

    public /* synthetic */ Host(ie0 ie0Var, l2f l2fVar, boolean z, String str, ljh ljhVar, ljh ljhVar2, mwd mwdVar, a1g a1gVar, l2f l2fVar2, String str2, wh6 wh6Var, Map map, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ie0Var, l2fVar, z, str, ljhVar, ljhVar2, (i & 64) != 0 ? null : mwdVar, (i & 128) != 0 ? null : a1gVar, l2fVar2, str2, wh6Var, map, str3);
    }
}
