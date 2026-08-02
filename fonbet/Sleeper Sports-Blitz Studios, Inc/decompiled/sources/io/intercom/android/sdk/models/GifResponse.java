package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* loaded from: classes9.dex */
public class GifResponse {
    private final List<Block> results;

    GifResponse(List<Block> list) {
        this.results = list;
    }

    public List<Block> results() {
        return this.results;
    }

    public static final class Builder {
        List<Block> results;

        public GifResponse build() {
            return new GifResponse(this.results);
        }
    }
}
