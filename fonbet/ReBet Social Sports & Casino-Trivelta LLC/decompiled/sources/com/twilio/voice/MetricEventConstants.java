package com.twilio.voice;

/* loaded from: classes4.dex */
class MetricEventConstants {
    static final int BATCH_PAYLOAD_COUNT = 10;

    public final class MetricEventKeys {
        public static final String AUDIO_CODEC = "audio_codec";
        public static final String AUDIO_INPUT_LEVEL = "audio_level_in";
        public static final String AUDIO_OUTPUT_LEVEL = "audio_level_out";
        public static final String JITTER = "jitter";
        public static final String MOS = "mos";
        public static final String PACKETS_LOST = "packets_lost";
        public static final String PACKETS_LOST_FRACTION = "packets_lost_fraction";
        public static final String PACKETS_RECEIVED = "packets_received";
        public static final String RTT = "rtt";
        public static final String TIMESTAMP_MS = "timestamp_ms";
        public static final String TOTAL_BYTES_RECEIVED = "total_bytes_received";
        public static final String TOTAL_BYTES_SENT = "total_bytes_sent";
        public static final String TOTAL_PACKETS_LOST = "total_packets_lost";
        public static final String TOTAL_PACKETS_RECEIVED = "total_packets_received";
        public static final String TOTAL_PACKETS_SENT = "total_packets_sent";

        public MetricEventKeys() {
        }
    }

    public class Thresholds {
        public static final String AUDIO_INPUT_CONSTANT_MAX_DURATIOTN = "audioInputConstantMaxDuration";
        public static final String AUDIO_OUTPUT_CONSTANT_MAX_DURATIOTN = "audioOutputConstantMaxDuration";
        public static final String JITTER_THRESHOLD_NAME = "jitter";
        public static final String MOS_THRESHOLD_NAME = "mos";
        public static final String PACKET_FRACTION_LOSS_MIN_THRESHOLD_NAME = "packetsLostFraction";
        public static final String RTT_THRESHOLD_NAME = "rtt";

        public Thresholds() {
        }
    }

    public class ThresholdsValue {
        public static final int MAX_DURATION_CONSTANT_AUDIO_INPUT_LEVEL = 10;
        public static final int MAX_DURATION_CONSTANT_AUDIO_OUTPUT_LEVEL = 10;
        public static final int MAX_JITTER_THRESHOLD = 30;
        public static final int MAX_PACKET_LOST_FRACTION = 1;
        public static final int MAX_RTT_THRESHOLD = 400;
        public static final int MIN_MOS_SCORE_THRESHOLD = 3;

        public ThresholdsValue() {
        }
    }
}
