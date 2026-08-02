package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.sport.CatalogSportMatch;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatchItem;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchResult;
import com.vk.catalog2.common.dto.api.sport.CatalogSportsMatchTeam;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import java.util.UUID;
import xsna.dfp0;
import xsna.epx;

/* compiled from: UIBlockSportMatch.kt */
/* loaded from: classes16.dex */
public final class UIBlockSportMatch extends UIBlock implements dfp0 {
    public final CatalogSportMatch y;
    public final CatalogSportMatchItem z;

    public UIBlockSportMatch(a aVar, CatalogSportMatch catalogSportMatch, CatalogSportMatchItem catalogSportMatchItem) {
        super(aVar);
        this.y = catalogSportMatch;
        this.z = catalogSportMatchItem;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return UUID.randomUUID().toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIBlockSportMatch) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSportMatch uIBlockSportMatch = (UIBlockSportMatch) obj;
        CatalogSportMatchItem catalogSportMatchItem = uIBlockSportMatch.z;
        CatalogSportMatchItem catalogSportMatchItem2 = this.z;
        return epx.f(catalogSportMatchItem2, catalogSportMatchItem) && epx.f(this.y, uIBlockSportMatch.y) && epx.f(catalogSportMatchItem2, uIBlockSportMatch.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.c;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockSportMatch[id:" + this.b + " sportMatch:" + this.y + " sportMatchItem:" + this.z + ']';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        a Ab = Ab();
        CatalogSportMatch catalogSportMatch = this.y;
        String str = catalogSportMatch.b;
        CatalogSportMatch.SportsType sportsType = catalogSportMatch.c;
        String str2 = catalogSportMatch.d;
        String str3 = catalogSportMatch.e;
        String str4 = catalogSportMatch.f;
        String str5 = catalogSportMatch.g;
        CatalogSportMatch.Status status = catalogSportMatch.h;
        String str6 = catalogSportMatch.i;
        String str7 = catalogSportMatch.j;
        CatalogSportsMatchTeam catalogSportsMatchTeam = catalogSportMatch.k;
        CatalogSportsMatchTeam catalogSportsMatchTeam2 = catalogSportMatch.l;
        CatalogSportsMatchResult catalogSportsMatchResult = catalogSportMatch.m;
        String str8 = catalogSportMatch.n;
        String str9 = catalogSportMatch.o;
        String str10 = catalogSportMatch.p;
        catalogSportMatch.getClass();
        CatalogSportMatch catalogSportMatch2 = new CatalogSportMatch(str, sportsType, str2, str3, str4, str5, status, str6, str7, catalogSportsMatchTeam, catalogSportsMatchTeam2, catalogSportsMatchResult, str8, str9, str10);
        CatalogSportMatchItem catalogSportMatchItem = this.z;
        String str11 = catalogSportMatchItem.b;
        String str12 = catalogSportMatchItem.c;
        catalogSportMatchItem.getClass();
        return new UIBlockSportMatch(Ab, catalogSportMatch2, new CatalogSportMatchItem(str11, str12));
    }
}
