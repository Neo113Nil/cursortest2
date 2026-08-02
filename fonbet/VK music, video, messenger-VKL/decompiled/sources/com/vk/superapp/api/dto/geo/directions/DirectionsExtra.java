package com.vk.superapp.api.dto.geo.directions;

import com.vk.superapp.api.dto.geo.common.Costing;
import com.vk.superapp.api.dto.geo.common.CostingOptions;
import com.vk.superapp.api.dto.geo.common.Language;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DirectionsExtra.kt */
/* loaded from: classes6.dex */
public final class DirectionsExtra {

    @pmi0("avoid_locations")
    private final List<Object> avoidLocations;

    @pmi0("costing")
    private final Costing costing;

    @pmi0("costing_options")
    private final CostingOptions costingOptions;

    @pmi0("date_time")
    private final DateTime dateTime;

    @pmi0("directions_type")
    private final DirectionsType directionsType;

    @pmi0("language")
    private final Language language;

    @pmi0("traffic")
    private final boolean traffic;

    @pmi0("units")
    private final Units units;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectionsExtra.kt */
    public static final class DirectionsType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DirectionsType[] $VALUES;

        @pmi0("instructions")
        public static final DirectionsType INSTRUCTIONS;

        @pmi0("maneuvers")
        public static final DirectionsType MANEUVERS;

        @pmi0("none")
        public static final DirectionsType NONE;

        static {
            DirectionsType directionsType = new DirectionsType("NONE", 0);
            NONE = directionsType;
            DirectionsType directionsType2 = new DirectionsType("MANEUVERS", 1);
            MANEUVERS = directionsType2;
            DirectionsType directionsType3 = new DirectionsType("INSTRUCTIONS", 2);
            INSTRUCTIONS = directionsType3;
            DirectionsType[] directionsTypeArr = {directionsType, directionsType2, directionsType3};
            $VALUES = directionsTypeArr;
            $ENTRIES = new asp(directionsTypeArr);
        }

        private DirectionsType(String str, int i) {
        }

        public static DirectionsType valueOf(String str) {
            return (DirectionsType) Enum.valueOf(DirectionsType.class, str);
        }

        public static DirectionsType[] values() {
            return (DirectionsType[]) $VALUES.clone();
        }
    }

    public DirectionsExtra() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsExtra)) {
            return false;
        }
        DirectionsExtra directionsExtra = (DirectionsExtra) obj;
        return this.costing == directionsExtra.costing && epx.f(this.costingOptions, directionsExtra.costingOptions) && this.directionsType == directionsExtra.directionsType && epx.f(this.avoidLocations, directionsExtra.avoidLocations) && epx.f(this.dateTime, directionsExtra.dateTime) && this.traffic == directionsExtra.traffic && this.language == directionsExtra.language && this.units == directionsExtra.units;
    }

    public final int hashCode() {
        int hashCode = this.costing.hashCode() * 31;
        CostingOptions costingOptions = this.costingOptions;
        int a = fw3.a((this.directionsType.hashCode() + ((hashCode + (costingOptions == null ? 0 : costingOptions.hashCode())) * 31)) * 31, 31, this.avoidLocations);
        DateTime dateTime = this.dateTime;
        return this.units.hashCode() + ((this.language.hashCode() + qoy.b((a + (dateTime != null ? dateTime.hashCode() : 0)) * 31, 31, this.traffic)) * 31);
    }

    public final String toString() {
        return "DirectionsExtra(costing=" + this.costing + ", costingOptions=" + this.costingOptions + ", directionsType=" + this.directionsType + ", avoidLocations=" + this.avoidLocations + ", dateTime=" + this.dateTime + ", traffic=" + this.traffic + ", language=" + this.language + ", units=" + this.units + ')';
    }

    public DirectionsExtra(Costing costing, CostingOptions costingOptions, DirectionsType directionsType, List<Object> list, DateTime dateTime, boolean z, Language language, Units units) {
        this.costing = costing;
        this.costingOptions = costingOptions;
        this.directionsType = directionsType;
        this.avoidLocations = list;
        this.dateTime = dateTime;
        this.traffic = z;
        this.language = language;
        this.units = units;
    }

    public DirectionsExtra(Costing costing, CostingOptions costingOptions, DirectionsType directionsType, List list, DateTime dateTime, boolean z, Language language, Units units, int i, zcl zclVar) {
        this((i & 1) != 0 ? Costing.AUTO : costing, (i & 2) != 0 ? null : costingOptions, (i & 4) != 0 ? DirectionsType.NONE : directionsType, (i & 8) != 0 ? EmptyList.b : list, (i & 16) != 0 ? null : dateTime, (i & 32) != 0 ? false : z, (i & 64) != 0 ? Language.RU : language, (i & 128) != 0 ? Units.KILOMETERS : units);
    }
}
