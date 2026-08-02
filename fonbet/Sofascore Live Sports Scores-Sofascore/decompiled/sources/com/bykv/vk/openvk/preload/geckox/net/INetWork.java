package com.bykv.vk.openvk.preload.geckox.net;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface INetWork {
    Response doGet(String str) throws Exception;

    Response doPost(String str, String str2) throws Exception;

    Response doPost(String str, List<Pair<String, String>> list) throws Exception;

    void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception;

    void syncDoGet(String str);
}
