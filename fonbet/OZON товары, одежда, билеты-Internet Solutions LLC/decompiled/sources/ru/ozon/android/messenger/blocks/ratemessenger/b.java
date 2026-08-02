package ru.ozon.android.messenger.blocks.ratemessenger;

import B90.C2618u;
import Kk.C3532b;
import T7.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes10.dex */
public final class b implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f86090a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86091b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f86092c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f86093d;

    /* renamed from: e, reason: collision with root package name */
    private final a f86094e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ButtonV3Atom.LargeButton f86095f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomActionDTO f86096g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final b.c f86097h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f86098i;

    public b(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String title, @NotNull String description, @NotNull ArrayList rates, a aVar, @NotNull ButtonV3Atom.LargeButton sendButton, AtomActionDTO atomActionDTO, @NotNull b.c keyboardState, Map map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        this.f86090a = blockId;
        this.f86091b = title;
        this.f86092c = description;
        this.f86093d = rates;
        this.f86094e = aVar;
        this.f86095f = sendButton;
        this.f86096g = atomActionDTO;
        this.f86097h = keyboardState;
        this.f86098i = map;
    }

    public static b a(b bVar, b.c keyboardState) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = bVar.f86090a;
        bVar.getClass();
        String title = bVar.f86091b;
        String description = bVar.f86092c;
        ArrayList rates = bVar.f86093d;
        a aVar = bVar.f86094e;
        ButtonV3Atom.LargeButton sendButton = bVar.f86095f;
        AtomActionDTO atomActionDTO = bVar.f86096g;
        Map<String, MessengerTrackingInfo> map = bVar.f86098i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        return new b(blockId, title, description, rates, aVar, sendButton, atomActionDTO, keyboardState, map);
    }

    public final AtomActionDTO b() {
        return this.f86096g;
    }

    @NotNull
    public final String c() {
        return this.f86092c;
    }

    @NotNull
    public final b.c d() {
        return this.f86097h;
    }

    public final a e() {
        return this.f86094e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f86090a, bVar.f86090a) && Intrinsics.d(this.f86091b, bVar.f86091b) && Intrinsics.d(this.f86092c, bVar.f86092c) && this.f86093d.equals(bVar.f86093d) && this.f86094e.equals(bVar.f86094e) && Intrinsics.d(this.f86095f, bVar.f86095f) && Intrinsics.d(this.f86096g, bVar.f86096g) && Intrinsics.d(this.f86097h, bVar.f86097h) && Intrinsics.d(this.f86098i, bVar.f86098i);
    }

    @NotNull
    public final List<j> f() {
        return this.f86093d;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton g() {
        return this.f86095f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f86090a;
    }

    @NotNull
    public final String h() {
        return this.f86091b;
    }

    public final int hashCode() {
        int a11 = Tl.b.a(this.f86095f, (this.f86094e.hashCode() + C2618u.b(this.f86093d, G.g.a(G.g.a(C3532b.a(this.f86090a.hashCode() * 31, 31, true), 31, this.f86091b), 31, this.f86092c), 31)) * 31, 31);
        AtomActionDTO atomActionDTO = this.f86096g;
        int hashCode = (this.f86097h.hashCode() + ((a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f86098i;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final Map<String, MessengerTrackingInfo> i() {
        return this.f86098i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateMessengerVO(blockId=");
        sb2.append(this.f86090a);
        sb2.append(", hasOnHideActions=true, title=");
        sb2.append(this.f86091b);
        sb2.append(", description=");
        sb2.append(this.f86092c);
        sb2.append(", rates=");
        sb2.append(this.f86093d);
        sb2.append(", message=");
        sb2.append(this.f86094e);
        sb2.append(", sendButton=");
        sb2.append(this.f86095f);
        sb2.append(", cancelAction=");
        sb2.append(this.f86096g);
        sb2.append(", keyboardState=");
        sb2.append(this.f86097h);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f86098i, ")");
    }
}
