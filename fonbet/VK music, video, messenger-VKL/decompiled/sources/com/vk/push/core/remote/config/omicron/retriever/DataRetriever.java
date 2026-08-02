package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;

/* loaded from: classes.dex */
public interface DataRetriever {
    Data getData();

    RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery);
}
