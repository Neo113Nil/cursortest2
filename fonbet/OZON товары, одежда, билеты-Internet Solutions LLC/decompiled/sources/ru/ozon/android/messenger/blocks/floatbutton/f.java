package ru.ozon.android.messenger.blocks.floatbutton;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class f implements ru.ozon.android.messenger.framework.presentation.models.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IconDTO f85216a;

    /* renamed from: b, reason: collision with root package name */
    private final TextDTO f85217b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomActionDTO f85218c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f85219d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85220e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f85221f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f85222g;

    public f(@NotNull IconDTO icon, TextDTO textDTO, @NotNull AtomActionDTO action, Integer num, String str, Map<String, MessengerTrackingInfo> map, @NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        this.f85216a = icon;
        this.f85217b = textDTO;
        this.f85218c = action;
        this.f85219d = num;
        this.f85220e = str;
        this.f85221f = map;
        this.f85222g = blockId;
    }

    @NotNull
    public final AtomActionDTO a() {
        return this.f85218c;
    }

    public final String b() {
        return this.f85220e;
    }

    public final Integer c() {
        return this.f85219d;
    }

    @NotNull
    public final IconDTO d() {
        return this.f85216a;
    }

    public final TextDTO e() {
        return this.f85217b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f85216a, fVar.f85216a) && Intrinsics.d(this.f85217b, fVar.f85217b) && Intrinsics.d(this.f85218c, fVar.f85218c) && Intrinsics.d(this.f85219d, fVar.f85219d) && Intrinsics.d(this.f85220e, fVar.f85220e) && Intrinsics.d(this.f85221f, fVar.f85221f) && Intrinsics.d(this.f85222g, fVar.f85222g);
    }

    public final Map<String, MessengerTrackingInfo> f() {
        return this.f85221f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f85222g;
    }

    public final int hashCode() {
        int hashCode = this.f85216a.hashCode() * 31;
        TextDTO textDTO = this.f85217b;
        int b11 = Ih.a.b(this.f85218c, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        Integer num = this.f85219d;
        int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f85220e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f85221f;
        return this.f85222g.hashCode() + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FloatButtonVO(icon=" + this.f85216a + ", text=" + this.f85217b + ", action=" + this.f85218c + ", cornerRadius=" + this.f85219d + ", backgroundColor=" + this.f85220e + ", trackingInfo=" + this.f85221f + ", blockId=" + this.f85222g + ")";
    }
}
