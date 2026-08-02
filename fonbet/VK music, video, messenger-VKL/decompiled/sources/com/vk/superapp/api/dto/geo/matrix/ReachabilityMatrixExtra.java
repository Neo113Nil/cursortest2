package com.vk.superapp.api.dto.geo.matrix;

import com.vk.superapp.api.dto.geo.common.Costing;
import com.vk.superapp.api.dto.geo.common.CostingOptions;
import com.vk.superapp.api.dto.geo.common.Language;
import com.vk.superapp.api.dto.geo.directions.Units;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ReachabilityMatrixExtra.kt */
/* loaded from: classes6.dex */
public final class ReachabilityMatrixExtra {

    @pmi0("costing")
    private final Costing costing;

    @pmi0("costing_options")
    private final CostingOptions costingOptions;

    @pmi0("generalize")
    private final Float generalize;

    @pmi0("id")
    private final String id;

    @pmi0("language")
    private final Language language;

    @pmi0("polygons")
    private final boolean polygons;

    @pmi0("traffic")
    private final boolean traffic;

    @pmi0("units")
    private final Units units;

    public ReachabilityMatrixExtra() {
        this(null, null, null, false, null, false, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachabilityMatrixExtra)) {
            return false;
        }
        ReachabilityMatrixExtra reachabilityMatrixExtra = (ReachabilityMatrixExtra) obj;
        return this.costing == reachabilityMatrixExtra.costing && epx.f(this.costingOptions, reachabilityMatrixExtra.costingOptions) && epx.f(this.id, reachabilityMatrixExtra.id) && this.traffic == reachabilityMatrixExtra.traffic && this.units == reachabilityMatrixExtra.units && this.polygons == reachabilityMatrixExtra.polygons && epx.f(this.generalize, reachabilityMatrixExtra.generalize) && this.language == reachabilityMatrixExtra.language;
    }

    public final int hashCode() {
        int hashCode = this.costing.hashCode() * 31;
        CostingOptions costingOptions = this.costingOptions;
        int hashCode2 = (hashCode + (costingOptions == null ? 0 : costingOptions.hashCode())) * 31;
        String str = this.id;
        int b = qoy.b((this.units.hashCode() + qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.traffic)) * 31, 31, this.polygons);
        Float f = this.generalize;
        return this.language.hashCode() + ((b + (f != null ? f.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ReachabilityMatrixExtra(costing=" + this.costing + ", costingOptions=" + this.costingOptions + ", id=" + this.id + ", traffic=" + this.traffic + ", units=" + this.units + ", polygons=" + this.polygons + ", generalize=" + this.generalize + ", language=" + this.language + ')';
    }

    public ReachabilityMatrixExtra(Costing costing, CostingOptions costingOptions, String str, boolean z, Units units, boolean z2, Float f, Language language) {
        this.costing = costing;
        this.costingOptions = costingOptions;
        this.id = str;
        this.traffic = z;
        this.units = units;
        this.polygons = z2;
        this.generalize = f;
        this.language = language;
    }

    public /* synthetic */ ReachabilityMatrixExtra(Costing costing, CostingOptions costingOptions, String str, boolean z, Units units, boolean z2, Float f, Language language, int i, zcl zclVar) {
        this((i & 1) != 0 ? Costing.AUTO : costing, (i & 2) != 0 ? null : costingOptions, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? Units.KILOMETERS : units, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : f, (i & 128) != 0 ? Language.RU : language);
    }
}
