package com.vk.push.core.remote.config.omicron.storage;

import androidx.annotation.Nullable;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;

/* loaded from: classes.dex */
public interface DataStorage {
    void clearData();

    @Nullable
    Data getData(DataId dataId);

    void putData(DataId dataId, Data data);
}
