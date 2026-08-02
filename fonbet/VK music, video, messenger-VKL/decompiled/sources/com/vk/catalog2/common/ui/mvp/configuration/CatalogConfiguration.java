package com.vk.catalog2.common.ui.mvp.configuration;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import io.reactivex.rxjava3.core.q;
import xsna.asp;
import xsna.ayn0;
import xsna.db80;
import xsna.g3a;
import xsna.gda;
import xsna.hda;
import xsna.jda;
import xsna.lca;
import xsna.qca;
import xsna.s8a;
import xsna.tca;
import xsna.u4a;
import xsna.vha;
import xsna.wba;
import xsna.y7a;
import xsna.zrp;

/* compiled from: CatalogConfiguration.kt */
/* loaded from: classes16.dex */
public interface CatalogConfiguration {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogConfiguration.kt */
    public static final class AutoPlayEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AutoPlayEntryPoint[] $VALUES;
        public static final AutoPlayEntryPoint Search;

        static {
            AutoPlayEntryPoint autoPlayEntryPoint = new AutoPlayEntryPoint("Search", 0);
            Search = autoPlayEntryPoint;
            AutoPlayEntryPoint[] autoPlayEntryPointArr = {autoPlayEntryPoint};
            $VALUES = autoPlayEntryPointArr;
            $ENTRIES = new asp(autoPlayEntryPointArr);
        }

        public AutoPlayEntryPoint() {
            throw null;
        }

        public static AutoPlayEntryPoint valueOf(String str) {
            return (AutoPlayEntryPoint) Enum.valueOf(AutoPlayEntryPoint.class, str);
        }

        public static AutoPlayEntryPoint[] values() {
            return (AutoPlayEntryPoint[]) $VALUES.clone();
        }
    }

    vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar);

    o0 B(CatalogViewType catalogViewType);

    int C(UIBlock uIBlock);

    q<hda> D(String str, String str2, boolean z);

    void E(u4a u4aVar);

    RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar);

    Boolean G(lca lcaVar, tca tcaVar);

    default boolean J() {
        return false;
    }

    jda K(u4a u4aVar);

    default boolean L() {
        return false;
    }

    default db80 M(AutoPlayEntryPoint autoPlayEntryPoint) {
        return V();
    }

    wba N();

    default boolean O(UserId userId) {
        return false;
    }

    default boolean P() {
        return false;
    }

    default boolean Q(UIBlock uIBlock) {
        return false;
    }

    int R();

    g3a S(u4a u4aVar, String str);

    void T(RecyclerView recyclerView);

    gda U();

    db80 V();

    ayn0 W(RecyclerView recyclerView);

    String X(Context context, int i, UIBlock uIBlock, s8a s8aVar);

    String getRef();

    default VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    UserId q();

    Bundle r();

    qca s();

    default String t() {
        return q() + '-' + getRef();
    }

    int u(UIBlock uIBlock);

    int v();

    CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar);

    q<hda> x(UserId userId, String str);

    default boolean y() {
        return true;
    }

    y7a z(lca lcaVar, CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType);
}
