package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes5.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase __db) {
        this.__db = __db;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ed A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c9 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bb A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ab A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018d A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0182 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0173 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0156 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014d A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0133 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0122 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0282 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025c A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0244 A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b A[Catch: all -> 0x02b6, TryCatch #0 {all -> 0x02b6, blocks: (B:3:0x0011, B:4:0x00b3, B:6:0x00b9, B:8:0x00c7, B:9:0x00d4, B:11:0x00e0, B:17:0x00ed, B:18:0x0104, B:77:0x0271, B:79:0x0282, B:80:0x0287, B:82:0x0295, B:83:0x029a, B:85:0x025c, B:88:0x0269, B:89:0x0265, B:90:0x0252, B:91:0x0244, B:92:0x0232, B:95:0x021b, B:100:0x0204, B:105:0x01ed, B:110:0x01d7, B:111:0x01c9, B:112:0x01bb, B:113:0x01ab, B:114:0x019b, B:115:0x018d, B:116:0x0182, B:117:0x0173, B:118:0x016a, B:119:0x015f, B:120:0x0156, B:121:0x014d, B:122:0x0133, B:125:0x013f, B:126:0x013b, B:127:0x0122, B:128:0x0110, B:131:0x0117), top: B:2:0x0011 }] */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(final SupportSQLiteQuery query) {
        String string;
        WorkInfo.State intToState;
        Data fromByteArray;
        boolean z;
        BackoffPolicy intToBackoffPolicy;
        int i;
        NetworkType intToNetworkType;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
        ArrayList<String> arrayList;
        ArrayList<Data> arrayList2;
        int i7;
        this.__db.assertNotSuspendingTransaction();
        Cursor query2 = DBUtil.query(this.__db, query, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query2, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(query2, AgentOptions.OUTPUT);
            int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
            int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
            int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
            int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
            int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
            int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
            int i8 = columnIndex13;
            HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
            while (query2.moveToNext()) {
                int i9 = columnIndex12;
                String string2 = query2.getString(columnIndex);
                if (hashMap.get(string2) == null) {
                    i7 = columnIndex11;
                    hashMap.put(string2, new ArrayList<>());
                } else {
                    i7 = columnIndex11;
                }
                String string3 = query2.getString(columnIndex);
                if (hashMap2.get(string3) == null) {
                    hashMap2.put(string3, new ArrayList<>());
                }
                columnIndex12 = i9;
                columnIndex11 = i7;
            }
            int i10 = columnIndex11;
            int i11 = columnIndex12;
            query2.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList3 = new ArrayList(query2.getCount());
            while (query2.moveToNext()) {
                if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                    string = query2.getString(columnIndex);
                    if (columnIndex2 != -1) {
                        intToState = null;
                    } else {
                        int i12 = query2.getInt(columnIndex2);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        intToState = WorkTypeConverters.intToState(i12);
                    }
                    if (columnIndex3 != -1) {
                        fromByteArray = null;
                    } else {
                        fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                    }
                    long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                    long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                    long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                    z = false;
                    int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                    if (columnIndex8 != -1) {
                        intToBackoffPolicy = null;
                    } else {
                        int i14 = query2.getInt(columnIndex8);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                    }
                    long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                    long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                    int i15 = i10;
                    int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                    i10 = i15;
                    int i17 = i11;
                    int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                    i11 = i17;
                    int i19 = i8;
                    long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                    i8 = i19;
                    int i20 = columnIndex14;
                    int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                    columnIndex14 = i20;
                    i = columnIndex15;
                    if (i != -1) {
                        intToNetworkType = null;
                    } else {
                        int i22 = query2.getInt(i);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                    }
                    columnIndex15 = i;
                    i2 = columnIndex16;
                    if (i2 != -1) {
                        z2 = false;
                    } else {
                        z2 = query2.getInt(i2) != 0;
                    }
                    columnIndex16 = i2;
                    i3 = columnIndex17;
                    if (i3 != -1) {
                        z3 = false;
                    } else {
                        z3 = query2.getInt(i3) != 0;
                    }
                    columnIndex17 = i3;
                    i4 = columnIndex18;
                    if (i4 != -1) {
                        z4 = false;
                    } else {
                        z4 = query2.getInt(i4) != 0;
                    }
                    columnIndex18 = i4;
                    i5 = columnIndex19;
                    if (i5 != -1 && query2.getInt(i5) != 0) {
                        z = true;
                    }
                    columnIndex19 = i5;
                    int i23 = columnIndex20;
                    boolean z5 = z;
                    long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                    columnIndex20 = i23;
                    int i24 = columnIndex21;
                    long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                    columnIndex21 = i24;
                    i6 = columnIndex22;
                    long j9 = j8;
                    if (i6 != -1) {
                        byteArrayToSetOfTriggers = null;
                    } else {
                        byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                    arrayList = hashMap.get(query2.getString(columnIndex));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList2 = hashMap2.get(query2.getString(columnIndex));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                    columnIndex22 = i6;
                }
                string = null;
                if (columnIndex2 != -1) {
                }
                if (columnIndex3 != -1) {
                }
                if (columnIndex4 != -1) {
                }
                if (columnIndex5 != -1) {
                }
                if (columnIndex6 != -1) {
                }
                z = false;
                if (columnIndex7 != -1) {
                }
                if (columnIndex8 != -1) {
                }
                if (columnIndex9 != -1) {
                }
                if (columnIndex10 != -1) {
                }
                int i152 = i10;
                if (i152 != -1) {
                }
                i10 = i152;
                int i172 = i11;
                if (i172 != -1) {
                }
                i11 = i172;
                int i192 = i8;
                if (i192 != -1) {
                }
                i8 = i192;
                int i202 = columnIndex14;
                if (i202 != -1) {
                }
                columnIndex14 = i202;
                i = columnIndex15;
                if (i != -1) {
                }
                columnIndex15 = i;
                i2 = columnIndex16;
                if (i2 != -1) {
                }
                columnIndex16 = i2;
                i3 = columnIndex17;
                if (i3 != -1) {
                }
                columnIndex17 = i3;
                i4 = columnIndex18;
                if (i4 != -1) {
                }
                columnIndex18 = i4;
                i5 = columnIndex19;
                if (i5 != -1) {
                    z = true;
                }
                columnIndex19 = i5;
                int i232 = columnIndex20;
                boolean z52 = z;
                if (i232 != -1) {
                }
                columnIndex20 = i232;
                int i242 = columnIndex21;
                if (i242 != -1) {
                }
                columnIndex21 = i242;
                i6 = columnIndex22;
                long j92 = j8;
                if (i6 != -1) {
                }
                Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                arrayList = hashMap.get(query2.getString(columnIndex));
                if (arrayList == null) {
                }
                arrayList2 = hashMap2.get(query2.getString(columnIndex));
                if (arrayList2 == null) {
                }
                arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                columnIndex22 = i6;
            }
            return arrayList3;
        } finally {
            query2.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery query) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            /* JADX WARN: Removed duplicated region for block: B:100:0x0209 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01f2 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x01dc A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x01cc A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01be A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x01ae A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x019e A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0190 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0185 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0176 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x016d A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0162 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0159 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0150 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0136 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0125 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01eb  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x025e  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0287 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x029a A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0261 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0257 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0249 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0220 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                String string;
                WorkInfo.State intToState;
                Data fromByteArray;
                boolean z;
                BackoffPolicy intToBackoffPolicy;
                int i;
                NetworkType intToNetworkType;
                int i2;
                boolean z2;
                int i3;
                boolean z3;
                int i4;
                boolean z4;
                int i5;
                int i6;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                ArrayList arrayList;
                ArrayList arrayList2;
                int i7;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, AgentOptions.OUTPUT);
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i8 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i9 = columnIndex12;
                        String string2 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            i7 = columnIndex11;
                            hashMap.put(string2, new ArrayList());
                        } else {
                            i7 = columnIndex11;
                        }
                        String string3 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                        columnIndex12 = i9;
                        columnIndex11 = i7;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList3 = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                            string = query2.getString(columnIndex);
                            if (columnIndex2 != -1) {
                                intToState = null;
                            } else {
                                int i12 = query2.getInt(columnIndex2);
                                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                                intToState = WorkTypeConverters.intToState(i12);
                            }
                            if (columnIndex3 != -1) {
                                fromByteArray = null;
                            } else {
                                fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                            }
                            long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                            long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                            long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                            z = false;
                            int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                            if (columnIndex8 != -1) {
                                intToBackoffPolicy = null;
                            } else {
                                int i14 = query2.getInt(columnIndex8);
                                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                                intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                            }
                            long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                            long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                            int i15 = i10;
                            int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                            i10 = i15;
                            int i17 = i11;
                            int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                            i11 = i17;
                            int i19 = i8;
                            long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                            i8 = i19;
                            int i20 = columnIndex14;
                            int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                            columnIndex14 = i20;
                            i = columnIndex15;
                            if (i != -1) {
                                intToNetworkType = null;
                            } else {
                                int i22 = query2.getInt(i);
                                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                                intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                            }
                            columnIndex15 = i;
                            i2 = columnIndex16;
                            if (i2 != -1) {
                                z2 = false;
                            } else {
                                z2 = query2.getInt(i2) != 0;
                            }
                            columnIndex16 = i2;
                            i3 = columnIndex17;
                            if (i3 != -1) {
                                z3 = false;
                            } else {
                                z3 = query2.getInt(i3) != 0;
                            }
                            columnIndex17 = i3;
                            i4 = columnIndex18;
                            if (i4 != -1) {
                                z4 = false;
                            } else {
                                z4 = query2.getInt(i4) != 0;
                            }
                            columnIndex18 = i4;
                            i5 = columnIndex19;
                            if (i5 != -1 && query2.getInt(i5) != 0) {
                                z = true;
                            }
                            columnIndex19 = i5;
                            int i23 = columnIndex20;
                            boolean z5 = z;
                            long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                            columnIndex20 = i23;
                            int i24 = columnIndex21;
                            long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                            columnIndex21 = i24;
                            i6 = columnIndex22;
                            long j9 = j8;
                            if (i6 != -1) {
                                byteArrayToSetOfTriggers = null;
                            } else {
                                byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                                byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                            }
                            Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                            arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                            columnIndex22 = i6;
                        }
                        string = null;
                        if (columnIndex2 != -1) {
                        }
                        if (columnIndex3 != -1) {
                        }
                        if (columnIndex4 != -1) {
                        }
                        if (columnIndex5 != -1) {
                        }
                        if (columnIndex6 != -1) {
                        }
                        z = false;
                        if (columnIndex7 != -1) {
                        }
                        if (columnIndex8 != -1) {
                        }
                        if (columnIndex9 != -1) {
                        }
                        if (columnIndex10 != -1) {
                        }
                        int i152 = i10;
                        if (i152 != -1) {
                        }
                        i10 = i152;
                        int i172 = i11;
                        if (i172 != -1) {
                        }
                        i11 = i172;
                        int i192 = i8;
                        if (i192 != -1) {
                        }
                        i8 = i192;
                        int i202 = columnIndex14;
                        if (i202 != -1) {
                        }
                        columnIndex14 = i202;
                        i = columnIndex15;
                        if (i != -1) {
                        }
                        columnIndex15 = i;
                        i2 = columnIndex16;
                        if (i2 != -1) {
                        }
                        columnIndex16 = i2;
                        i3 = columnIndex17;
                        if (i3 != -1) {
                        }
                        columnIndex17 = i3;
                        i4 = columnIndex18;
                        if (i4 != -1) {
                        }
                        columnIndex18 = i4;
                        i5 = columnIndex19;
                        if (i5 != -1) {
                            z = true;
                        }
                        columnIndex19 = i5;
                        int i232 = columnIndex20;
                        boolean z52 = z;
                        if (i232 != -1) {
                        }
                        columnIndex20 = i232;
                        int i242 = columnIndex21;
                        if (i242 != -1) {
                        }
                        columnIndex21 = i242;
                        i6 = columnIndex22;
                        long j92 = j8;
                        if (i6 != -1) {
                        }
                        Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                        arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                        if (arrayList == null) {
                        }
                        arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                        if (arrayList2 == null) {
                        }
                        arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                        columnIndex22 = i6;
                    }
                    return arrayList3;
                } finally {
                    query2.close();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery query) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            /* JADX WARN: Removed duplicated region for block: B:100:0x0209 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01f2 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x01dc A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x01cc A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01be A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x01ae A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x019e A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x0190 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0185 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0176 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x016d A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0162 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0159 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0150 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0136 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0125 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01eb  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x025e  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0287 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x029a A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0261 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0257 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0249 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0220 A[Catch: all -> 0x02bb, TryCatch #0 {all -> 0x02bb, blocks: (B:3:0x0010, B:4:0x00b2, B:6:0x00b8, B:8:0x00c6, B:9:0x00d3, B:11:0x00df, B:17:0x00ec, B:18:0x0107, B:77:0x0276, B:79:0x0287, B:80:0x028c, B:82:0x029a, B:83:0x029f, B:85:0x0261, B:88:0x026e, B:89:0x026a, B:90:0x0257, B:91:0x0249, B:92:0x0237, B:95:0x0220, B:100:0x0209, B:105:0x01f2, B:110:0x01dc, B:111:0x01cc, B:112:0x01be, B:113:0x01ae, B:114:0x019e, B:115:0x0190, B:116:0x0185, B:117:0x0176, B:118:0x016d, B:119:0x0162, B:120:0x0159, B:121:0x0150, B:122:0x0136, B:125:0x0142, B:126:0x013e, B:127:0x0125, B:128:0x0113, B:131:0x011a), top: B:2:0x0010 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                String string;
                WorkInfo.State intToState;
                Data fromByteArray;
                boolean z;
                BackoffPolicy intToBackoffPolicy;
                int i;
                NetworkType intToNetworkType;
                int i2;
                boolean z2;
                int i3;
                boolean z3;
                int i4;
                boolean z4;
                int i5;
                int i6;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                ArrayList arrayList;
                ArrayList arrayList2;
                int i7;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, AgentOptions.OUTPUT);
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i8 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i9 = columnIndex12;
                        String string2 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            i7 = columnIndex11;
                            hashMap.put(string2, new ArrayList());
                        } else {
                            i7 = columnIndex11;
                        }
                        String string3 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                        columnIndex12 = i9;
                        columnIndex11 = i7;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList3 = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                            string = query2.getString(columnIndex);
                            if (columnIndex2 != -1) {
                                intToState = null;
                            } else {
                                int i12 = query2.getInt(columnIndex2);
                                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                                intToState = WorkTypeConverters.intToState(i12);
                            }
                            if (columnIndex3 != -1) {
                                fromByteArray = null;
                            } else {
                                fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                            }
                            long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                            long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                            long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                            z = false;
                            int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                            if (columnIndex8 != -1) {
                                intToBackoffPolicy = null;
                            } else {
                                int i14 = query2.getInt(columnIndex8);
                                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                                intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                            }
                            long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                            long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                            int i15 = i10;
                            int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                            i10 = i15;
                            int i17 = i11;
                            int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                            i11 = i17;
                            int i19 = i8;
                            long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                            i8 = i19;
                            int i20 = columnIndex14;
                            int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                            columnIndex14 = i20;
                            i = columnIndex15;
                            if (i != -1) {
                                intToNetworkType = null;
                            } else {
                                int i22 = query2.getInt(i);
                                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                                intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                            }
                            columnIndex15 = i;
                            i2 = columnIndex16;
                            if (i2 != -1) {
                                z2 = false;
                            } else {
                                z2 = query2.getInt(i2) != 0;
                            }
                            columnIndex16 = i2;
                            i3 = columnIndex17;
                            if (i3 != -1) {
                                z3 = false;
                            } else {
                                z3 = query2.getInt(i3) != 0;
                            }
                            columnIndex17 = i3;
                            i4 = columnIndex18;
                            if (i4 != -1) {
                                z4 = false;
                            } else {
                                z4 = query2.getInt(i4) != 0;
                            }
                            columnIndex18 = i4;
                            i5 = columnIndex19;
                            if (i5 != -1 && query2.getInt(i5) != 0) {
                                z = true;
                            }
                            columnIndex19 = i5;
                            int i23 = columnIndex20;
                            boolean z5 = z;
                            long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                            columnIndex20 = i23;
                            int i24 = columnIndex21;
                            long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                            columnIndex21 = i24;
                            i6 = columnIndex22;
                            long j9 = j8;
                            if (i6 != -1) {
                                byteArrayToSetOfTriggers = null;
                            } else {
                                byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                                byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                            }
                            Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                            arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                            columnIndex22 = i6;
                        }
                        string = null;
                        if (columnIndex2 != -1) {
                        }
                        if (columnIndex3 != -1) {
                        }
                        if (columnIndex4 != -1) {
                        }
                        if (columnIndex5 != -1) {
                        }
                        if (columnIndex6 != -1) {
                        }
                        z = false;
                        if (columnIndex7 != -1) {
                        }
                        if (columnIndex8 != -1) {
                        }
                        if (columnIndex9 != -1) {
                        }
                        if (columnIndex10 != -1) {
                        }
                        int i152 = i10;
                        if (i152 != -1) {
                        }
                        i10 = i152;
                        int i172 = i11;
                        if (i172 != -1) {
                        }
                        i11 = i172;
                        int i192 = i8;
                        if (i192 != -1) {
                        }
                        i8 = i192;
                        int i202 = columnIndex14;
                        if (i202 != -1) {
                        }
                        columnIndex14 = i202;
                        i = columnIndex15;
                        if (i != -1) {
                        }
                        columnIndex15 = i;
                        i2 = columnIndex16;
                        if (i2 != -1) {
                        }
                        columnIndex16 = i2;
                        i3 = columnIndex17;
                        if (i3 != -1) {
                        }
                        columnIndex17 = i3;
                        i4 = columnIndex18;
                        if (i4 != -1) {
                        }
                        columnIndex18 = i4;
                        i5 = columnIndex19;
                        if (i5 != -1) {
                            z = true;
                        }
                        columnIndex19 = i5;
                        int i232 = columnIndex20;
                        boolean z52 = z;
                        if (i232 != -1) {
                        }
                        columnIndex20 = i232;
                        int i242 = columnIndex21;
                        if (i242 != -1) {
                        }
                        columnIndex21 = i242;
                        i6 = columnIndex22;
                        long j92 = j8;
                        if (i6 != -1) {
                        }
                        Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                        arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                        if (arrayList == null) {
                        }
                        arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                        if (arrayList2 == null) {
                        }
                        arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                        columnIndex22 = i6;
                    }
                    return arrayList3;
                } finally {
                    query2.close();
                }
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final HashMap<String, ArrayList<String>> _map) {
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                hashMap = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<String> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.isNull(0) ? null : query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final HashMap<String, ArrayList<Data>> _map) {
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<Data>> hashMap = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
                hashMap = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<Data> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }
}
